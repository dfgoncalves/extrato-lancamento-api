package br.com.cielo.extrato.model;

import java.util.ArrayList;
import java.util.List;

public class ExtratoLancamentoLegado {

	private TotalizadorLancamento totalControleLancamento;
	private List<ControleLancamento> listaControleLancamento;
	private int indice;
	private int tamanhoPagina;
	private int totalElements;

	public ExtratoLancamentoLegado(TotalizadorLancamento totalControleLancamento,
			List<ControleLancamento> listaControleLancamento, int indice,
			int tamanhoPagina, int totalElements) {
		super();
		this.totalControleLancamento = totalControleLancamento;
		this.listaControleLancamento = listaControleLancamento;
		this.indice = indice;
		this.tamanhoPagina = tamanhoPagina;
		this.totalElements = totalElements;
	}
	
	public List<ControleLancamento> obterTodosLancamentos(ContaCorrente contaCorrentePesquisada){
		//esta sendo abstraído a paginação do sistema legado.
		if(contaCorrentePesquisada == null){
			return listaControleLancamento;
		} else {
			List<ControleLancamento> lancamentoLocalizados = new ArrayList<ControleLancamento>();
			for(ControleLancamento lancamento : listaControleLancamento){
				ContaCorrente contaCorrenteLancamento = lancamento.getLancamentoContaCorrenteCliente().getDadosDomicilioBancario();
				if(contaCorrenteLancamento.equals(contaCorrentePesquisada)){
					lancamentoLocalizados.add(lancamento);
				}
			}
			return lancamentoLocalizados;
		}
	}
	

	public TotalizadorLancamento getTotalControleLancamento() {
		return totalControleLancamento;
	}

	public void setTotalControleLancamento(
			TotalizadorLancamento totalControleLancamento) {
		this.totalControleLancamento = totalControleLancamento;
	}

	public List<ControleLancamento> getListaControleLancamento() {
		return listaControleLancamento;
	}

	public void setListaControleLancamento(
			List<ControleLancamento> listaControleLancamento) {
		this.listaControleLancamento = listaControleLancamento;
	}

	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}

	public int getTamanhoPagina() {
		return tamanhoPagina;
	}

	public void setTamanhoPagina(int tamanhoPagina) {
		this.tamanhoPagina = tamanhoPagina;
	}

	public int getTotalElements() {
		return totalElements;
	}

	public void setTotalElements(int totalElements) {
		this.totalElements = totalElements;
	}
	
}





