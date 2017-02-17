package br.com.cielo.extrato.exception;

public class Http500Exception extends Exception{
	
	private String mensagem;
	
	public Http500Exception(String mensagem){
		this.mensagem = mensagem;
	}
	
	public Http500Exception(){
	}
	
	public String getMensagem(){
		return this.mensagem;
	}
}
