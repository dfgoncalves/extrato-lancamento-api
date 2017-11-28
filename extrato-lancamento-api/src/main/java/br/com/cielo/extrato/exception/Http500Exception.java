package br.com.cielo.extrato.exception;

/**
 * 
 * @author Diogo Ferreira Gonçalves
 *
 */
@SuppressWarnings("serial")
public class Http500Exception extends Exception{
	
	private String mensagem;
	
	/**
	 * 
	 * @param mensagem
	 */
	public Http500Exception(String mensagem){
		this.mensagem = mensagem;
	}
	
	/**
	 * 
	 */
	public Http500Exception(){
	}
	
	/**
	 * 
	 * @return
	 */
	public String getMensagem(){
		return this.mensagem;
	}
}
