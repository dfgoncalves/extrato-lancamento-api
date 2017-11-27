package br.com.cielo.extrato.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.cielo.extrato.domain.ControleLancamento;
import br.com.cielo.extrato.domain.Lancamento;
import br.com.cielo.extrato.exception.Http500Exception;
import br.com.cielo.extrato.util.LancamentoBuilder;

@Repository
public class ExtratoLancamentoDAO {

	@Autowired
	private LegacyConnectionFactory legacyConnection;

	public List<Lancamento> findAll() throws Http500Exception{
		
		List<Lancamento> lancamentos = new ArrayList<Lancamento>();
		List<ControleLancamento> lancamentosLegado = legacyConnection.getAllExtracts();
		for(ControleLancamento lancamentoLegado : lancamentosLegado){
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
		
		return null;
	}

	public Lancamento findById(){
		return null;
	}
	
}
