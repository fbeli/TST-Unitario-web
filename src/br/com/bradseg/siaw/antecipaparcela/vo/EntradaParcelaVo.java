package br.com.bradseg.siaw.antecipaparcela.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


public class EntradaParcelaVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6428226745115483281L;
	
	private Integer sucursal;
	private Integer ramo;
	private Integer cia;
	private Integer apolice;
	private Integer item;
	private Integer endosso;
	private Integer numeroPrestacao;
	private BigDecimal valorParcela;
	private BigDecimal percentualJuros;
	private BigDecimal valorAdicionalFracionamento;
	private BigDecimal valorIOF;
	private Date dataVencimento;
	private Date dataPagamento;
	private Integer tipoCobranca;
	
	public EntradaParcelaVo() {
		super();
	}

	/**
	 * @return sucursal
	 */
	public Integer getSucursal() {
		return sucursal;
	}

	/**
	 * @param sucursal Integer
	 */
	public void setSucursal(Integer sucursal) {
		this.sucursal = sucursal;
	}

	/**
	 * @return ramo
	 */
	public Integer getRamo() {
		return ramo;
	}

	/**
	 * @param ramo Integer
	 */
	public void setRamo(Integer ramo) {
		this.ramo = ramo;
	}

	/**
	 * @return cia
	 */
	public Integer getCia() {
		return cia;
	}

	/**
	 * @param cia Integer
	 */
	public void setCia(Integer cia) {
		this.cia = cia;
	}

	/**
	 * @return apolice
	 */
	public Integer getApolice() {
		return apolice;
	}

	/**
	 * @param apolice Integer
	 */
	public void setApolice(Integer apolice) {
		this.apolice = apolice;
	}

	/**
	 * @return item
	 */
	public Integer getItem() {
		return item;
	}

	/**
	 * @param item Integer
	 */
	public void setItem(Integer item) {
		this.item = item;
	}

	/**
	 * @return endosso
	 */
	public Integer getEndosso() {
		return endosso;
	}

	/**
	 * @param endosso Integer
	 */
	public void setEndosso(Integer endosso) {
		this.endosso = endosso;
	}

	/**
	 * @return numeroPrestacao
	 */
	public Integer getNumeroPrestacao() {
		return numeroPrestacao;
	}

	/**
	 * @param numeroPrestacao Integer
	 */
	public void setNumeroPrestacao(Integer numeroPrestacao) {
		this.numeroPrestacao = numeroPrestacao;
	}

	/**
	 * @return valorParcela
	 */
	public BigDecimal getValorParcela() {
		return valorParcela;
	}

	/**
	 * @param valorParcela BigDecimal
	 */
	public void setValorParcela(BigDecimal valorParcela) {
		this.valorParcela = valorParcela;
	}

	/**
	 * @return percentualJuros
	 */
	public BigDecimal getPercentualJuros() {
		return percentualJuros;
	}

	/**
	 * @param percentualJuros BigDecimal
	 */
	public void setPercentualJuros(BigDecimal percentualJuros) {
		this.percentualJuros = percentualJuros;
	}

	/**
	 * @return valorAdicionalFracionamento
	 */
	public BigDecimal getValorAdicionalFracionamento() {
		return valorAdicionalFracionamento;
	}

	/**
	 * @param valorAdicionalFracionamento BigDecimal
	 */
	public void setValorAdicionalFracionamento(
			BigDecimal valorAdicionalFracionamento) {
		this.valorAdicionalFracionamento = valorAdicionalFracionamento;
	}

	/**
	 * @return valorIOF
	 */
	public BigDecimal getValorIOF() {
		return valorIOF;
	}

	/**
	 * @param valorIOF BigDecimal
	 */
	public void setValorIOF(BigDecimal valorIOF) {
		this.valorIOF = valorIOF;
	}

	/**
	 * @return dataVencimento
	 */
	public Date getDataVencimento() {
		return dataVencimento;
	}

	/**
	 * @param dataVencimento Date
	 */
	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	/**
	 * @return dataPagamento
	 */
	public Date getDataPagamento() {
		return dataPagamento;
	}

	/**
	 * @param dataPagamento Date
	 */
	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	/**
	 * @return tipoCobranca
	 */
	public Integer getTipoCobranca() {
		return tipoCobranca;
	}

	/**
	 * @param tipoCobranca Integer
	 */
	public void setTipoCobranca(Integer tipoCobranca) {
		this.tipoCobranca = tipoCobranca;
	}
	
}
