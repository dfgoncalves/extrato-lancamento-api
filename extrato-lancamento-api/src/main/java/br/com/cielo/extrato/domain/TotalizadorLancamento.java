package br.com.cielo.extrato.domain;

public class TotalizadorLancamento {
	private int quantidadeLancamentos;
	private int quantidadeRemessas;
	private double valorLancamentos;

	public TotalizadorLancamento(int quantidadeLancamentos,
			int quantidadeRemessas, double valorLancamentos, int indice,
			int tamanhoPagina, int totalElements) {
		super();
		this.quantidadeLancamentos = quantidadeLancamentos;
		this.quantidadeRemessas = quantidadeRemessas;
		this.valorLancamentos = valorLancamentos;
	}

	public int getQuantidadeLancamentos() {
		return quantidadeLancamentos;
	}

	public void setQuantidadeLancamentos(int quantidadeLancamentos) {
		this.quantidadeLancamentos = quantidadeLancamentos;
	}

	public int getQuantidadeRemessas() {
		return quantidadeRemessas;
	}

	public void setQuantidadeRemessas(int quantidadeRemessas) {
		this.quantidadeRemessas = quantidadeRemessas;
	}

	public double getValorLancamentos() {
		return valorLancamentos;
	}

	public void setValorLancamentos(double valorLancamentos) {
		this.valorLancamentos = valorLancamentos;
	}

}

