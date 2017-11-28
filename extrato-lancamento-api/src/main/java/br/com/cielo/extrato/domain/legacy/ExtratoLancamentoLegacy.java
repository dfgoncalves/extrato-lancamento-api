package br.com.cielo.extrato.domain.legacy;

import java.util.ArrayList;
import java.util.List;

import br.com.cielo.extrato.domain.ContaCorrente;
import br.com.cielo.extrato.domain.TotalizadorLancamento;

public class ExtratoLancamentoLegacy {

	private TotalizadorLancamento totalControleLancamento;
	private List<ControleLancamentoLegacy> listaControleLancamento;
	private int indice;
	private int tamanhoPagina;
	private int totalElements;

	public ExtratoLancamentoLegacy(TotalizadorLancamento totalControleLancamento,
			List<ControleLancamentoLegacy> listaControleLancamento, int indice,
			int tamanhoPagina, int totalElements) {
		super();
		this.totalControleLancamento = totalControleLancamento;
		this.listaControleLancamento = listaControleLancamento;
		this.indice = indice;
		this.tamanhoPagina = tamanhoPagina;
		this.totalElements = totalElements;
	}
	
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
	

	public TotalizadorLancamento getTotalControleLancamento() {
		return totalControleLancamento;
	}

	public void setTotalControleLancamento(
			TotalizadorLancamento totalControleLancamento) {
		this.totalControleLancamento = totalControleLancamento;
	}

	public List<ControleLancamentoLegacy> getListaControleLancamento() {
		return listaControleLancamento;
	}

	public void setListaControleLancamento(
			List<ControleLancamentoLegacy> listaControleLancamento) {
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





