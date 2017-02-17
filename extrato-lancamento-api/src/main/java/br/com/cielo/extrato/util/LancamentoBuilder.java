package br.com.cielo.extrato.util;

import br.com.cielo.extrato.model.Lancamento;

public class LancamentoBuilder {
	private String descricao;
	private long numero;
	private String situacao;
	private String dataLancamento;
	private String dataConfirmacaoLancamento;
	private int banco;
	private int agencia;
	private String contaCorrente;
	private double valorFinal;
	
	public LancamentoBuilder comDescricao(String descricao){
		this.descricao = descricao;
		return this;
	}
	
	public LancamentoBuilder comNumero(long numero){
		this.numero = numero;
		return this;
	}
	
	public LancamentoBuilder comSituacao(String situacao){
		this.situacao = situacao;
		return this;
	}
	
	public LancamentoBuilder comLancamentoEm(String dataLancamento){
		this.dataLancamento = dataLancamento;
		return this;
	}
	
	public LancamentoBuilder comConfirmacaoEm(String dataConfirmacao){
		this.dataConfirmacaoLancamento = dataConfirmacao;
		return this;
	}
	
	public LancamentoBuilder noBanco(int banco){
		this.banco = banco;
		return this;
	}
	
	public LancamentoBuilder naAgencia(int agencia){
		this.agencia = agencia;
		return this;
	}
	
	public LancamentoBuilder naContaCorrente(String contaCorrente){
		this.contaCorrente = contaCorrente;
		return this;
	}
	
	public LancamentoBuilder comValorFinalDe(double valorFinal){
		this.valorFinal = valorFinal;
		return this;
	}
	
	public Lancamento build(){
		return new Lancamento(descricao, numero, situacao, dataLancamento, dataConfirmacaoLancamento, banco, agencia, contaCorrente, valorFinal);
	}
}
