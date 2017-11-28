package br.com.cielo.extrato.domain;

/**
 * 
 * @author Diogo Ferreira Gonçalves
 *
 */
public class LancamentoBuilder {
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
	 * @return
	 */
	public LancamentoBuilder comDescricao(String descricao){
		this.descricao = descricao;
		return this;
	}
	
	/**
	 * 
	 * @param numero
	 * @return
	 */
	public LancamentoBuilder comNumero(long numero){
		this.numero = numero;
		return this;
	}
	
	/**
	 * 
	 * @param situacao
	 * @return
	 */
	public LancamentoBuilder comSituacao(String situacao){
		this.situacao = situacao;
		return this;
	}
	
	/**
	 * 
	 * @param dataLancamento
	 * @return
	 */
	public LancamentoBuilder comLancamentoEm(String dataLancamento){
		this.dataLancamento = dataLancamento;
		return this;
	}
	
	/**
	 * 
	 * @param dataConfirmacao
	 * @return
	 */
	public LancamentoBuilder comConfirmacaoEm(String dataConfirmacao){
		this.dataConfirmacaoLancamento = dataConfirmacao;
		return this;
	}
	
	/**
	 * 
	 * @param banco
	 * @return
	 */
	public LancamentoBuilder noBanco(int banco){
		this.banco = banco;
		return this;
	}
	
	/**
	 * 
	 * @param agencia
	 * @return
	 */
	public LancamentoBuilder naAgencia(int agencia){
		this.agencia = agencia;
		return this;
	}
	
	/**
	 * 
	 * @param contaCorrente
	 * @return
	 */
	public LancamentoBuilder naContaCorrente(long contaCorrente){
		this.contaCorrente = contaCorrente;
		return this;
	}
	
	/**
	 * 
	 * @param valorFinal
	 * @return
	 */
	public LancamentoBuilder comValorFinalDe(double valorFinal){
		this.valorFinal = valorFinal;
		return this;
	}
	
	/**
	 * 
	 * @return
	 */
	public Lancamento build(){
		return new Lancamento(descricao, numero, situacao, dataLancamento, dataConfirmacaoLancamento, banco, agencia, contaCorrente, valorFinal);
	}
}
