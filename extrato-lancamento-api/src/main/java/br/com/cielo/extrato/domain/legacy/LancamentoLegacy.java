package br.com.cielo.extrato.domain.legacy;

import java.util.List;

import br.com.cielo.extrato.domain.ContaCorrente;

/**
 * 
 * @author Diogo Ferreira Gonçalves
 *
 */
public class LancamentoLegacy {

	private long numeroRemessaBanco;
	private List<Object> dadosAnaliticoLancamentoFinanceiroCliente;
	private String nomeSituacaoRemessa;
	private ContaCorrente dadosDomicilioBancario;
	private String nomeTipoOperacao;

	/**
	 * 
	 * @param numeroRemessaBanco
	 * @param dadosAnaliticoLancamentoFinanceiroCliente
	 * @param nomeSituacaoRemessa
	 * @param dadosDomicilioBancario
	 * @param nomeTipoOperacao
	 */
	public LancamentoLegacy(long numeroRemessaBanco,
			List<Object> dadosAnaliticoLancamentoFinanceiroCliente,
			String nomeSituacaoRemessa, ContaCorrente dadosDomicilioBancario,
			String nomeTipoOperacao) {
		super();
		this.numeroRemessaBanco = numeroRemessaBanco;
		this.dadosAnaliticoLancamentoFinanceiroCliente = dadosAnaliticoLancamentoFinanceiroCliente;
		this.nomeSituacaoRemessa = nomeSituacaoRemessa;
		this.dadosDomicilioBancario = dadosDomicilioBancario;
		this.nomeTipoOperacao = nomeTipoOperacao;
	}

	/**
	 * 
	 * @return
	 */
	public long getNumeroRemessaBanco() {
		return numeroRemessaBanco;
	}

	/**
	 * 
	 * @param numeroRemessaBanco
	 */
	public void setNumeroRemessaBanco(long numeroRemessaBanco) {
		this.numeroRemessaBanco = numeroRemessaBanco;
	}

	/**
	 * 
	 * @return
	 */
	public List<Object> getDadosAnaliticoLancamentoFinanceiroCliente() {
		return dadosAnaliticoLancamentoFinanceiroCliente;
	}

	/**
	 * 
	 * @param dadosAnaliticoLancamentoFinanceiroCliente
	 */
	public void setDadosAnaliticoLancamentoFinanceiroCliente(
			List<Object> dadosAnaliticoLancamentoFinanceiroCliente) {
		this.dadosAnaliticoLancamentoFinanceiroCliente = dadosAnaliticoLancamentoFinanceiroCliente;
	}

	/**
	 * 
	 * @return
	 */
	public String getNomeSituacaoRemessa() {
		return nomeSituacaoRemessa;
	}

	/**
	 * 
	 * @param nomeSituacaoRemessa
	 */
	public void setNomeSituacaoRemessa(String nomeSituacaoRemessa) {
		this.nomeSituacaoRemessa = nomeSituacaoRemessa;
	}

	/**
	 * 
	 * @return
	 */
	public ContaCorrente getDadosDomicilioBancario() {
		return dadosDomicilioBancario;
	}

	/**
	 * 
	 * @param dadosDomicilioBancario
	 */
	public void setDadosDomicilioBancario(ContaCorrente dadosDomicilioBancario) {
		this.dadosDomicilioBancario = dadosDomicilioBancario;
	}

	/**
	 * 
	 * @return
	 */
	public String getNomeTipoOperacao() {
		return nomeTipoOperacao;
	}

	/**
	 * 
	 * @param nomeTipoOperacao
	 */
	public void setNomeTipoOperacao(String nomeTipoOperacao) {
		this.nomeTipoOperacao = nomeTipoOperacao;
	}

}
