package br.com.cielo.extrato.domain;

public class ContaCorrente {
	private int codigoBanco;
	private int numeroAgencia;
	private String numeroContaCorrente;

	public ContaCorrente(int codigoBanco, int numeroAgencia,
			String numeroContaCorrente) {
		super();
		this.codigoBanco = codigoBanco;
		this.numeroAgencia = numeroAgencia;
		this.numeroContaCorrente = numeroContaCorrente;
	}

	public int getCodigoBanco() {
		return codigoBanco;
	}

	public void setCodigoBanco(int codigoBanco) {
		this.codigoBanco = codigoBanco;
	}
	
	
	public boolean equals(ContaCorrente contaCorrente){
		boolean retorno = false;
		if(this.codigoBanco == contaCorrente.codigoBanco 
				&& this.numeroAgencia == contaCorrente.numeroAgencia
				&& this.numeroContaCorrente.equalsIgnoreCase(contaCorrente.numeroContaCorrente)){
			retorno = true;
		} 
		return retorno;
	}

	public int getNumeroAgencia() {
		return numeroAgencia;
	}

	public void setNumeroAgencia(int numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	public String getNumeroContaCorrente() {
		return numeroContaCorrente;
	}

	public void setNumeroContaCorrente(String numeroContaCorrente) {
		this.numeroContaCorrente = numeroContaCorrente;
	}

}
