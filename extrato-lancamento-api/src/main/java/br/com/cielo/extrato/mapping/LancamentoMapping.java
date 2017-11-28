package br.com.cielo.extrato.mapping;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import br.com.cielo.extrato.domain.Lancamento;
import br.com.cielo.extrato.domain.LancamentoBuilder;
import br.com.cielo.extrato.domain.legacy.ControleLancamentoLegacy;
import br.com.cielo.extrato.exception.Http404Exception;

/**
 * 
 * @author Diogo Ferreira Gonçalves
 *
 */
public class LancamentoMapping {

	/**
	 * 
	 * @param lancamentosLegado
	 * @return
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static ResponseEntity<List<Lancamento>> from (List<ControleLancamentoLegacy> lancamentosLegado){
		try{
			if(lancamentosLegado.size() == 0){
				throw new Http404Exception("Não existe lançamentos.");
			}
			List<Lancamento> lancamentos = new ArrayList<Lancamento>();
			for(ControleLancamentoLegacy lancamentoLegado : lancamentosLegado){
				Lancamento lancamento = convert(lancamentoLegado);
				lancamentos.add(lancamento);
			}
			return new ResponseEntity<List<Lancamento>> (lancamentos, HttpStatus.OK);
		} catch(Http404Exception e){
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
	}
	
	/**
	 * 
	 * @param lancamentoLegado
	 * @return
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static ResponseEntity<Lancamento> from (ControleLancamentoLegacy lancamentoLegado){
		try{
			if(lancamentoLegado == null){
				throw new Http404Exception("Não existe lançamentos.");
			}
			Lancamento lancamento = convert(lancamentoLegado);
			return new ResponseEntity<Lancamento> (lancamento, HttpStatus.OK);
		} catch(Http404Exception e){
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
	}
	
	/**
	 * 
	 * @param lancamentoLegado
	 * @return
	 */
	private static Lancamento convert(ControleLancamentoLegacy lancamentoLegado){
		String dataLancamento = lancamentoLegado.getDataLancamentoContaCorrenteCliente();
		String descricao = lancamentoLegado.getLancamentoContaCorrenteCliente().getNomeTipoOperacao();
		long numero = lancamentoLegado.getLancamentoContaCorrenteCliente().getNumeroRemessaBanco();
		String situacao = lancamentoLegado.getLancamentoContaCorrenteCliente().getNomeSituacaoRemessa();
		String dataConfirmacao = lancamentoLegado.getDataEfetivaLancamento();
		int banco = lancamentoLegado.getLancamentoContaCorrenteCliente().getDadosDomicilioBancario().getCodigoBanco();
		int agencia = lancamentoLegado.getLancamentoContaCorrenteCliente().getDadosDomicilioBancario().getNumeroAgencia();
		long contaCorrente = lancamentoLegado.getLancamentoContaCorrenteCliente().getDadosDomicilioBancario().getNumeroContaCorrente();
		double valorFinal = lancamentoLegado.getValorLancamentoRemessa();
		
		LancamentoBuilder builder = new LancamentoBuilder();
		Lancamento lancamento = builder.comLancamentoEm(dataLancamento).comDescricao(descricao)
				.comNumero(numero).comSituacao(situacao).comConfirmacaoEm(dataConfirmacao)
				.noBanco(banco).naAgencia(agencia).naContaCorrente(contaCorrente).comValorFinalDe(valorFinal).build();
		return lancamento;
	}
}
