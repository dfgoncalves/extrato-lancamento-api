package br.com.cielo.extrato.domain;

/**
 * 
 * @author Diogo Ferreira Gonçalves
 *
 */
public class Lancamento {
	private String descricao;
	private long numero;
	private String situacao;
	private String dataLancamento;
	private String dataConfirmacaoLancamento;
	private int banco;
	private int agencia;
	private long contaCorrente;
	private double valorFinal;

	/**
	 * 
	 * @param descricao
	 * @param numero
	 * @param situacao
	 * @param dataLancamento
	 * @param dataConfirmacaoLancamento
	 * @param banco
	 * @param agencia
	 * @param contaCorrente
	 * @param valorFinal
	 */
	public Lancamento(String descricao, long numero, String situacao,
			String dataLancamento, String dataConfirmacaoLancamento, int banco,
			int agencia, long contaCorrente, double valorFinal) {
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

	/**
	 * 
	 * @return
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * 
	 * @param descricao
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * 
	 * @return
	 */
	public long getNumero() {
		return numero;
	}

	/**
	 * 
	 * @param numero
	 */
	public void setNumero(long numero) {
		this.numero = numero;
	}

	/**
	 * 
	 * @return
	 */
	public String getSituacao() {
		return situacao;
	}

	/**
	 * 
	 * @param situacao
	 */
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	/**
	 * 
	 * @return
	 */
	public String getDataLancamento() {
		return dataLancamento;
	}

	/**
	 * 
	 * @param dataLancamento
	 */
	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	/**
	 * 
	 * @return
	 */
	public String getDataConfirmacaoLancamento() {
		return dataConfirmacaoLancamento;
	}

	/**
	 * 
	 * @param dataConfirmacaoLancamento
	 */
	public void setDataConfirmacaoLancamento(String dataConfirmacaoLancamento) {
		this.dataConfirmacaoLancamento = dataConfirmacaoLancamento;
	}

	/**
	 * 
	 * @return
	 */
	public int getBanco() {
		return banco;
	}

	/**
	 * 
	 * @param banco
	 */
	public void setBanco(int banco) {
		this.banco = banco;
	}

	/**
	 * 
	 * @return
	 */
	public int getAgencia() {
		return agencia;
	}

	/**
	 * 
	 * @param agencia
	 */
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	/**
	 * 
	 * @return
	 */
	public long getContacorrente() {
		return contaCorrente;
	}

	/**
	 * 
	 * @param contaCorrente
	 */
	public void setContacorrente(long contaCorrente) {
		this.contaCorrente = contaCorrente;
	}

	/**
	 * 
	 * @return
	 */
	public double getValorFinal() {
		return valorFinal;
	}

	/**
	 * 
	 * @param valorFinal
	 */
	public void setValorFinal(double valorFinal) {
		this.valorFinal = valorFinal;
	}
}
