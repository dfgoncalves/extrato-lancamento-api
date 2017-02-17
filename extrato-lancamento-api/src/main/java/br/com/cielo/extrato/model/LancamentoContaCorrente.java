package br.com.cielo.extrato.model;

import java.util.List;

public class LancamentoContaCorrente {

	private long numeroRemessaBanco;
	private List<Object> dadosAnaliticoLancamentoFinanceiroCliente;
	private String nomeSituacaoRemessa;
	private ContaCorrente dadosDomicilioBancario;
	private String nomeTipoOperacao;

	public LancamentoContaCorrente(long numeroRemessaBanco,
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

	public long getNumeroRemessaBanco() {
		return numeroRemessaBanco;
	}

	public void setNumeroRemessaBanco(long numeroRemessaBanco) {
		this.numeroRemessaBanco = numeroRemessaBanco;
	}

	public List<Object> getDadosAnaliticoLancamentoFinanceiroCliente() {
		return dadosAnaliticoLancamentoFinanceiroCliente;
	}

	public void setDadosAnaliticoLancamentoFinanceiroCliente(
			List<Object> dadosAnaliticoLancamentoFinanceiroCliente) {
		this.dadosAnaliticoLancamentoFinanceiroCliente = dadosAnaliticoLancamentoFinanceiroCliente;
	}

	public String getNomeSituacaoRemessa() {
		return nomeSituacaoRemessa;
	}

	public void setNomeSituacaoRemessa(String nomeSituacaoRemessa) {
		this.nomeSituacaoRemessa = nomeSituacaoRemessa;
	}

	public ContaCorrente getDadosDomicilioBancario() {
		return dadosDomicilioBancario;
	}

	public void setDadosDomicilioBancario(ContaCorrente dadosDomicilioBancario) {
		this.dadosDomicilioBancario = dadosDomicilioBancario;
	}

	public String getNomeTipoOperacao() {
		return nomeTipoOperacao;
	}

	public void setNomeTipoOperacao(String nomeTipoOperacao) {
		this.nomeTipoOperacao = nomeTipoOperacao;
	}

}
