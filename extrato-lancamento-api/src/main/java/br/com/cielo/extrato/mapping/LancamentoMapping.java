package br.com.cielo.extrato.mapping;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import br.com.cielo.extrato.domain.Lancamento;
import br.com.cielo.extrato.domain.legacy.ControleLancamentoLegacy;
import br.com.cielo.extrato.exception.Http404Exception;
import br.com.cielo.extrato.util.LancamentoBuilder;

public class LancamentoMapping {

	public static ResponseEntity<List<Lancamento>> from (List<ControleLancamentoLegacy> lancamentosLegado){

		try{
			
			if(lancamentosLegado.size() == 0){
				throw new Http404Exception("Não existe lançamentos.");
			}
			
			List<Lancamento> lancamentos = new ArrayList<Lancamento>();
			for(ControleLancamentoLegacy lancamentoLegado : lancamentosLegado){
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
		
			return new ResponseEntity<List<Lancamento>> (lancamentos, HttpStatus.OK);

		} catch(Http404Exception e){
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
	}
}
