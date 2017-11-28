package br.com.cielo.extrato.domain.legacy;

/**
 * 
 * @author Diogo Ferreira Gonçalves
 *
 */
public class ControleLancamentoLegacy {
	private LancamentoLegacy lancamentoContaCorrenteCliente;
	private String dataEfetivaLancamento;
	private String dataLancamentoContaCorrenteCliente;
	private int numeroEvento;
	private String descricaoGrupoPagamento;
	private int codigoIdentificadorUnico;
	private String nomeBanco;
	private int quantidadeLancamentoRemessa;
	private String numeroRaizCNPJ;
	private String numeroSufixoCNPJ;
	private double valorLancamentoRemessa;
	private long dateLancamentoContaCorrenteCliente;
	private long dateEfetivaLancamento;

	/**
	 * 
	 * @param lancamentoContaCorrenteCliente
	 * @param dataEfetivaLancamento
	 * @param dataLancamentoContaCorrenteCliente
	 * @param numeroEvento
	 * @param descricaoGrupoPagamento
	 * @param codigoIdentificadorUnico
	 * @param nomeBanco
	 * @param quantidadeLancamentoRemessa
	 * @param numeroRaizCNPJ
	 * @param numeroSufixoCNPJ
	 * @param valorLancamentoRemessa
	 * @param dateLancamentoContaCorrenteCliente
	 * @param dateEfetivaLancamento
	 */
	public ControleLancamentoLegacy(LancamentoLegacy lancamentoContaCorrenteCliente,
			String dataEfetivaLancamento,
			String dataLancamentoContaCorrenteCliente, int numeroEvento,
			String descricaoGrupoPagamento, int codigoIdentificadorUnico,
			String nomeBanco, int quantidadeLancamentoRemessa,
			String numeroRaizCNPJ, String numeroSufixoCNPJ,
			double valorLancamentoRemessa,
			long dateLancamentoContaCorrenteCliente, long dateEfetivaLancamento) {
		super();
		this.lancamentoContaCorrenteCliente = lancamentoContaCorrenteCliente;
		this.dataEfetivaLancamento = dataEfetivaLancamento;
		this.dataLancamentoContaCorrenteCliente = dataLancamentoContaCorrenteCliente;
		this.numeroEvento = numeroEvento;
		this.descricaoGrupoPagamento = descricaoGrupoPagamento;
		this.codigoIdentificadorUnico = codigoIdentificadorUnico;
		this.nomeBanco = nomeBanco;
		this.quantidadeLancamentoRemessa = quantidadeLancamentoRemessa;
		this.numeroRaizCNPJ = numeroRaizCNPJ;
		this.numeroSufixoCNPJ = numeroSufixoCNPJ;
		this.valorLancamentoRemessa = valorLancamentoRemessa;
		this.dateLancamentoContaCorrenteCliente = dateLancamentoContaCorrenteCliente;
		this.dateEfetivaLancamento = dateEfetivaLancamento;
	}

	/**
	 * 
	 * @return
	 */
	public LancamentoLegacy getLancamentoContaCorrenteCliente() {
		return lancamentoContaCorrenteCliente;
	}

	/**
	 * 
	 * @param lancamentoContaCorrenteCliente
	 */
	public void setLancamentoContaCorrenteCliente(
			LancamentoLegacy lancamentoContaCorrenteCliente) {
		this.lancamentoContaCorrenteCliente = lancamentoContaCorrenteCliente;
	}

	/**
	 * 
	 * @return
	 */
	public String getDataEfetivaLancamento() {
		return dataEfetivaLancamento;
	}

	/**
	 * 
	 * @param dataEfetivaLancamento
	 */
	public void setDataEfetivaLancamento(String dataEfetivaLancamento) {
		this.dataEfetivaLancamento = dataEfetivaLancamento;
	}

	/**
	 * 
	 * @return
	 */
	public String getDataLancamentoContaCorrenteCliente() {
		return dataLancamentoContaCorrenteCliente;
	}

	/**
	 * 
	 * @param dataLancamentoContaCorrenteCliente
	 */
	public void setDataLancamentoContaCorrenteCliente(
			String dataLancamentoContaCorrenteCliente) {
		this.dataLancamentoContaCorrenteCliente = dataLancamentoContaCorrenteCliente;
	}

	/**
	 * 
	 * @return
	 */
	public int getNumeroEvento() {
		return numeroEvento;
	}

	/**
	 * 
	 * @param numeroEvento
	 */
	public void setNumeroEvento(int numeroEvento) {
		this.numeroEvento = numeroEvento;
	}

	/**
	 * 
	 * @return
	 */
	public String getDescricaoGrupoPagamento() {
		return descricaoGrupoPagamento;
	}

	/**
	 * 
	 * @param descricaoGrupoPagamento
	 */
	public void setDescricaoGrupoPagamento(String descricaoGrupoPagamento) {
		this.descricaoGrupoPagamento = descricaoGrupoPagamento;
	}

	/**
	 * 
	 * @return
	 */
	public int getCodigoIdentificadorUnico() {
		return codigoIdentificadorUnico;
	}

	/**
	 * 
	 * @param codigoIdentificadorUnico
	 */
	public void setCodigoIdentificadorUnico(int codigoIdentificadorUnico) {
		this.codigoIdentificadorUnico = codigoIdentificadorUnico;
	}

	/**
	 * 
	 * @return
	 */
	public String getNomeBanco() {
		return nomeBanco;
	}

	/**
	 * 
	 * @param nomeBanco
	 */
	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}

	/**
	 * 
	 * @return
	 */
	public int getQuantidadeLancamentoRemessa() {
		return quantidadeLancamentoRemessa;
	}

	/**
	 * 
	 * @param quantidadeLancamentoRemessa
	 */
	public void setQuantidadeLancamentoRemessa(int quantidadeLancamentoRemessa) {
		this.quantidadeLancamentoRemessa = quantidadeLancamentoRemessa;
	}

	/**
	 * 
	 * @return
	 */
	public String getNumeroRaizCNPJ() {
		return numeroRaizCNPJ;
	}

	/**
	 * 
	 * @param numeroRaizCNPJ
	 */
	public void setNumeroRaizCNPJ(String numeroRaizCNPJ) {
		this.numeroRaizCNPJ = numeroRaizCNPJ;
	}

	/**
	 * 
	 * @return
	 */
	public String getNumeroSufixoCNPJ() {
		return numeroSufixoCNPJ;
	}

	/**
	 * 
	 * @param numeroSufixoCNPJ
	 */
	public void setNumeroSufixoCNPJ(String numeroSufixoCNPJ) {
		this.numeroSufixoCNPJ = numeroSufixoCNPJ;
	}

	/**
	 * 
	 * @return
	 */
	public double getValorLancamentoRemessa() {
		return valorLancamentoRemessa;
	}

	/**
	 * 
	 * @param valorLancamentoRemessa
	 */
	public void setValorLancamentoRemessa(double valorLancamentoRemessa) {
		this.valorLancamentoRemessa = valorLancamentoRemessa;
	}

	/**
	 * 
	 * @return
	 */
	public long getDateLancamentoContaCorrenteCliente() {
		return dateLancamentoContaCorrenteCliente;
	}

	/**
	 * 
	 * @param dateLancamentoContaCorrenteCliente
	 */
	public void setDateLancamentoContaCorrenteCliente(
			long dateLancamentoContaCorrenteCliente) {
		this.dateLancamentoContaCorrenteCliente = dateLancamentoContaCorrenteCliente;
	}

	/**
	 * 
	 * @return
	 */
	public long getDateEfetivaLancamento() {
		return dateEfetivaLancamento;
	}

	/**
	 * 
	 * @param dateEfetivaLancamento
	 */
	public void setDateEfetivaLancamento(long dateEfetivaLancamento) {
		this.dateEfetivaLancamento = dateEfetivaLancamento;
	}
}
