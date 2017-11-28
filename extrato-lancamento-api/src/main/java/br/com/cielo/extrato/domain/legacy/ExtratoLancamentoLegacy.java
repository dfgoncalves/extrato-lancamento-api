package br.com.cielo.extrato.domain.legacy;

import java.util.ArrayList;
import java.util.List;

import br.com.cielo.extrato.domain.ContaCorrente;

/**
 * 
 * @author Diogo Ferreira Gonçalves
 *
 */
public class ExtratoLancamentoLegacy {

	private TotalizadorLancamentoLegacy totalControleLancamento;
	private List<ControleLancamentoLegacy> listaControleLancamento;
	private int indice;
	private int tamanhoPagina;
	private int totalElements;

	/**
	 * 
	 * @param totalControleLancamento
	 * @param listaControleLancamento
	 * @param indice
	 * @param tamanhoPagina
	 * @param totalElements
	 */
	public ExtratoLancamentoLegacy(TotalizadorLancamentoLegacy totalControleLancamento,
			List<ControleLancamentoLegacy> listaControleLancamento, int indice,
			int tamanhoPagina, int totalElements) {
		super();
		this.totalControleLancamento = totalControleLancamento;
		this.listaControleLancamento = listaControleLancamento;
		this.indice = indice;
		this.tamanhoPagina = tamanhoPagina;
		this.totalElements = totalElements;
	}
	
	/**
	 * 
	 * @param contaCorrentePesquisada
	 * @return
	 */
	public List<ControleLancamentoLegacy> obterTodosLancamentos(ContaCorrente contaCorrentePesquisada){
		//esta sendo abstra�do a pagina��o do sistema legado.
		if(contaCorrentePesquisada == null){
			return listaControleLancamento;
		} else {
			List<ControleLancamentoLegacy> lancamentoLocalizados = new ArrayList<ControleLancamentoLegacy>();
			for(ControleLancamentoLegacy lancamento : listaControleLancamento){
				ContaCorrente contaCorrenteLancamento = lancamento.getLancamentoContaCorrenteCliente().getDadosDomicilioBancario();
				if(contaCorrenteLancamento.equals(contaCorrentePesquisada)){
					lancamentoLocalizados.add(lancamento);
				}
			}
			return lancamentoLocalizados;
		}
	}
	
	/**
	 * 
	 * @return
	 */
	public TotalizadorLancamentoLegacy getTotalControleLancamento() {
		return totalControleLancamento;
	}

	/**
	 * 
	 * @param totalControleLancamento
	 */
	public void setTotalControleLancamento(
			TotalizadorLancamentoLegacy totalControleLancamento) {
		this.totalControleLancamento = totalControleLancamento;
	}

	/**
	 * 
	 * @return
	 */
	public List<ControleLancamentoLegacy> getListaControleLancamento() {
		return listaControleLancamento;
	}

	/**
	 * 
	 * @param listaControleLancamento
	 */
	public void setListaControleLancamento(
			List<ControleLancamentoLegacy> listaControleLancamento) {
		this.listaControleLancamento = listaControleLancamento;
	}

	/**
	 * 
	 * @return
	 */
	public int getIndice() {
		return indice;
	}

	/**
	 * 
	 * @param indice
	 */
	public void setIndice(int indice) {
		this.indice = indice;
	}

	/**
	 * 
	 * @return
	 */
	public int getTamanhoPagina() {
		return tamanhoPagina;
	}

	/**
	 * 
	 * @param tamanhoPagina
	 */
	public void setTamanhoPagina(int tamanhoPagina) {
		this.tamanhoPagina = tamanhoPagina;
	}

	/**
	 * 
	 * @return
	 */
	public int getTotalElements() {
		return totalElements;
	}

	/**
	 * 
	 * @param totalElements
	 */
	public void setTotalElements(int totalElements) {
		this.totalElements = totalElements;
	}
	
}





