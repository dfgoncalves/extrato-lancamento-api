package br.com.cielo.extrato.exception;

public class Http404Exception extends Exception {
	private String mensagem;
	
	public Http404Exception(String mensagem){
		this.mensagem = mensagem;
	}
	
	public Http404Exception(){
	}
	
	public String getMensagem(){
		return this.mensagem;
	}
}
