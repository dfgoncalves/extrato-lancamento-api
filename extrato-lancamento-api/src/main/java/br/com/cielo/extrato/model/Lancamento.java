package br.com.cielo.extrato.model;

public class Lancamento {
	private String descricao;
	private long numero;
	private String situacao;
	private String dataLancamento;
	private String dataConfirmacaoLancamento;
	private int banco;
	private int agencia;
	private String contaCorrente;
	private double valorFinal;

	public Lancamento(String descricao, long numero, String situacao,
			String dataLancamento, String dataConfirmacaoLancamento, int banco,
			int agencia, String contaCorrente, double valorFinal) {
		super();
		this.descricao = descricao;
		this.numero = numero;
		this.situacao = situacao;
		this.dataLancamento = dataLancamento;
		this.dataConfirmacaoLancamento = dataConfirmacaoLancamento;
		this.banco = banco;
		this.agencia = agencia;
		this.contaCorrente = contaCorrente;
		this.valorFinal = valorFinal;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public String getDataConfirmacaoLancamento() {
		return dataConfirmacaoLancamento;
	}

	public void setDataConfirmacaoLancamento(String dataConfirmacaoLancamento) {
		this.dataConfirmacaoLancamento = dataConfirmacaoLancamento;
	}

	public int getBanco() {
		return banco;
	}

	public void setBanco(int banco) {
		this.banco = banco;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public String getContacorrente() {
		return contaCorrente;
	}

	public void setContacorrente(String contaCorrente) {
		this.contaCorrente = contaCorrente;
	}

	public String getContaCorrente() {
		return contaCorrente;
	}

	public void setContaCorrente(String contaCorrente) {
		this.contaCorrente = contaCorrente;
	}

	public double getValorFinal() {
		return valorFinal;
	}

	public void setValorFinal(double valorFinal) {
		this.valorFinal = valorFinal;
	}
}
