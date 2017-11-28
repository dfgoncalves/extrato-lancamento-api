package br.com.cielo.extrato.domain;

/**
 * 
 * @author Diogo Ferreira Gonçalves
 *
 */
public class ContaCorrente {

	private int codigoBanco;
	private int numeroAgencia;
	private long numeroContaCorrente;

	/**
	 * 
	 * @param codigoBanco
	 * @param numeroAgencia
	 * @param numeroContaCorrente
	 */
	public ContaCorrente(int codigoBanco, int numeroAgencia,
			long numeroContaCorrente) {
		super();
		this.codigoBanco = codigoBanco;
		this.numeroAgencia = numeroAgencia;
		this.numeroContaCorrente = numeroContaCorrente;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getCodigoBanco() {
		return codigoBanco;
	}

	/**
	 * 
	 * @param codigoBanco
	 */
	public void setCodigoBanco(int codigoBanco) {
		this.codigoBanco = codigoBanco;
	}
	
	/**
	 * 
	 * @param contaCorrente
	 * @return
	 */
	public boolean equals(ContaCorrente contaCorrente){
		boolean retorno = false;
		if(this.codigoBanco == contaCorrente.codigoBanco 
				&& this.numeroAgencia == contaCorrente.numeroAgencia
				&& this.numeroContaCorrente == contaCorrente.numeroContaCorrente){
			retorno = true;
		} 
		return retorno;
	}

	/**
	 * 
	 * @return
	 */
	public int getNumeroAgencia() {
		return numeroAgencia;
	}

	/**
	 * 
	 * @param numeroAgencia
	 */
	public void setNumeroAgencia(int numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	/**
	 * 
	 * @return
	 */
	public long getNumeroContaCorrente() {
		return numeroContaCorrente;
	}

	/**
	 * 
	 * @param numeroContaCorrente
	 */
	public void setNumeroContaCorrente(long numeroContaCorrente) {
		this.numeroContaCorrente = numeroContaCorrente;
	}

}
