package br.com.cielo.extrato.domain.legacy;

/**
 * 
 * @author Diogo Ferreira Gonçalves
 *
 */
public class TotalizadorLancamentoLegacy {

	private int quantidadeLancamentos;
	private int quantidadeRemessas;
	private double valorLancamentos;

	/**
	 * 
	 * @param quantidadeLancamentos
	 * @param quantidadeRemessas
	 * @param valorLancamentos
	 * @param indice
	 * @param tamanhoPagina
	 * @param totalElements
	 */
	public TotalizadorLancamentoLegacy(int quantidadeLancamentos,
			int quantidadeRemessas, double valorLancamentos, int indice,
			int tamanhoPagina, int totalElements) {
		super();
		this.quantidadeLancamentos = quantidadeLancamentos;
		this.quantidadeRemessas = quantidadeRemessas;
		this.valorLancamentos = valorLancamentos;
	}

	/**
	 * 
	 * @return
	 */
	public int getQuantidadeLancamentos() {
		return quantidadeLancamentos;
	}

	/**
	 * 
	 * @param quantidadeLancamentos
	 */
	public void setQuantidadeLancamentos(int quantidadeLancamentos) {
		this.quantidadeLancamentos = quantidadeLancamentos;
	}

	/**
	 * 
	 * @return
	 */
	public int getQuantidadeRemessas() {
		return quantidadeRemessas;
	}

	/**
	 * 
	 * @param quantidadeRemessas
	 */
	public void setQuantidadeRemessas(int quantidadeRemessas) {
		this.quantidadeRemessas = quantidadeRemessas;
	}

	/**
	 * 
	 * @return
	 */
	public double getValorLancamentos() {
		return valorLancamentos;
	}

	/**
	 * 
	 * @param valorLancamentos
	 */
	public void setValorLancamentos(double valorLancamentos) {
		this.valorLancamentos = valorLancamentos;
	}

}

