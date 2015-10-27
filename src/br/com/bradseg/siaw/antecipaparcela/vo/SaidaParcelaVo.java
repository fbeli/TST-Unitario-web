package br.com.bradseg.siaw.antecipaparcela.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SaidaParcelaVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8982379007739692126L;
	
	private BigDecimal valorParcelaCalculado;
		private BigDecimal valorIOFCalculado;
	private Date dataVencimentoBoleto;
	private RetornoErroVo erro = new RetornoErroVo();
	
	public SaidaParcelaVo() {
		super();
	}

	
	public SaidaParcelaVo(BigDecimal valorParcelaCalculado,
			BigDecimal valorIOFCalculado, Date dataVencimentoBoleto,
			RetornoErroVo erro) {
		super();
		this.valorParcelaCalculado = valorParcelaCalculado;
		this.valorIOFCalculado = valorIOFCalculado;
		this.dataVencimentoBoleto = dataVencimentoBoleto;
		this.erro = erro;
	}
	
	
	
	
	/**
	 * @return valorParcelaCalculado
	 */
	public BigDecimal getValorParcelaCalculado() {
		return valorParcelaCalculado;
	}

	/**
	 * @param valorParcelaCalculado BigDecimal
	 */
	public void setValorParcelaCalculado(BigDecimal valorParcelaCalculado) {
		this.valorParcelaCalculado = valorParcelaCalculado;
	}

	/**
	 * @return valorIOFCalculado
	 */
	public BigDecimal getValorIOFCalculado() {
		return valorIOFCalculado;
	}

	/**
	 * @param valorIOFCalculado BigDecimal
	 */
	public void setValorIOFCalculado(BigDecimal valorIOFCalculado) {
		this.valorIOFCalculado = valorIOFCalculado;
	}

	/**
	 * @return dataVencimentoBoleto
	 */
	public Date getDataVencimentoBoleto() {
		return dataVencimentoBoleto;
	}

	/**
	 * @param dataVencimentoBoleto Date
	 */
	public void setDataVencimentoBoleto(Date dataVencimentoBoleto) {
		this.dataVencimentoBoleto = dataVencimentoBoleto;
	}

	/**
	 * @return erro
	 */
	public RetornoErroVo getErro() {
		return erro;
	}

	/**
	 * @param erro RetornoErroVo
	 */
	public void setErro(RetornoErroVo erro) {
		this.erro = erro;
	}
	
}
