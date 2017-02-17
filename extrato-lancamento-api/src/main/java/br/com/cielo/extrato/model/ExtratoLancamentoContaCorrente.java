package br.com.cielo.extrato.model;

import java.util.ArrayList;
import java.util.List;

import br.com.cielo.extrato.exception.Http404Exception;
import br.com.cielo.extrato.exception.Http500Exception;
import br.com.cielo.extrato.util.ConexaoLegadoFactory;
import br.com.cielo.extrato.util.LancamentoBuilder;

public class ExtratoLancamentoContaCorrente implements ExtratoLancamento {
	
	private ContaCorrente contaCorrente;
	
	public ExtratoLancamentoContaCorrente(int idBanco, int idAgencia, String idConta){
		if(idBanco > 0 && idAgencia > 0 && !idConta.equals("")){
			this.contaCorrente = new ContaCorrente(idBanco, idAgencia, idConta);
		}
	}

	public List<Lancamento> listarLancamentos() throws Http500Exception, Http404Exception {
		List<Lancamento> lancamentos = new ArrayList<Lancamento>();
		List<ControleLancamento> lancamentoslegado = ConexaoLegadoFactory.getConexao().obterTodosLancamentos(this.contaCorrente);
		for(ControleLancamento lancamentoLegado : lancamentoslegado){
			
			String dataLancamento = lancamentoLegado.getDataLancamentoContaCorrenteCliente();
			String descricao = lancamentoLegado.getLancamentoContaCorrenteCliente().getNomeTipoOperacao();
			long numero = lancamentoLegado.getLancamentoContaCorrenteCliente().getNumeroRemessaBanco();
			String situacao = lancamentoLegado.getLancamentoContaCorrenteCliente().getNomeSituacaoRemessa();
			String dataConfirmacao = lancamentoLegado.getDataEfetivaLancamento();
			int banco = lancamentoLegado.getLancamentoContaCorrenteCliente().getDadosDomicilioBancario().getCodigoBanco();
			int agencia = lancamentoLegado.getLancamentoContaCorrenteCliente().getDadosDomicilioBancario().getNumeroAgencia();
			String contaCorrente = lancamentoLegado.getLancamentoContaCorrenteCliente().getDadosDomicilioBancario().getNumeroContaCorrente();
			double valorFinal = lancamentoLegado.getValorLancamentoRemessa();
			
			LancamentoBuilder builder = new LancamentoBuilder();
			Lancamento lancamento = builder.comLancamentoEm(dataLancamento).comDescricao(descricao)
					.comNumero(numero).comSituacao(situacao).comConfirmacaoEm(dataConfirmacao)
					.noBanco(banco).naAgencia(agencia).naContaCorrente(contaCorrente).comValorFinalDe(valorFinal).build();
			
			lancamentos.add(lancamento);
		}
		
		if(lancamentos.size() <= 0){
			throw new Http404Exception("Não existem lançamentos para esta conta corrente.");
		}
		
		return lancamentos;
	}

}
