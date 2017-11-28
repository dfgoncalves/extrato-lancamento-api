package br.com.cielo.extrato.exception;

/**
 * 
 * @author Diogo Ferreira Gonçalves
 *
 */
@SuppressWarnings("serial")
public class Http404Exception extends Exception {
	private String mensagem;
	
	/**
	 * 
	 * @param mensagem
	 */
	public Http404Exception(String mensagem){
		this.mensagem = mensagem;
	}
	
	/**
	 * 
	 */
	public Http404Exception(){
	}

	/**
	 * 
	 * @return
	 */
	public String getMensagem(){
		return this.mensagem;
	}
}
