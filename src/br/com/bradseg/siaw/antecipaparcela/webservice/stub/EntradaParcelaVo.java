
package br.com.bradseg.siaw.antecipaparcela.webservice.stub;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de entradaParcelaVo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="entradaParcelaVo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="apolice" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cia" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dataPagamento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataVencimento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="endosso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numeroPrestacao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="percentualJuros" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ramo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sucursal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tipoCobranca" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="valorAdicionalFracionamento" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="valorIOF" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="valorParcela" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "entradaParcelaVo", propOrder = {
    "apolice",
    "cia",
    "dataPagamento",
    "dataVencimento",
    "endosso",
    "item",
    "numeroPrestacao",
    "percentualJuros",
    "ramo",
    "sucursal",
    "tipoCobranca",
    "valorAdicionalFracionamento",
    "valorIOF",
    "valorParcela"
})
public class EntradaParcelaVo {

    protected Integer apolice;
    protected Integer cia;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataPagamento;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataVencimento;
    protected Integer endosso;
    protected Integer item;
    protected Integer numeroPrestacao;
    protected BigDecimal percentualJuros;
    protected Integer ramo;
    protected Integer sucursal;
    protected Integer tipoCobranca;
    protected BigDecimal valorAdicionalFracionamento;
    protected BigDecimal valorIOF;
    protected BigDecimal valorParcela;

    /**
     * Obtém o valor da propriedade apolice.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getApolice() {
        return apolice;
    }

    /**
     * Define o valor da propriedade apolice.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setApolice(Integer value) {
        this.apolice = value;
    }

    /**
     * Obtém o valor da propriedade cia.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCia() {
        return cia;
    }

    /**
     * Define o valor da propriedade cia.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCia(Integer value) {
        this.cia = value;
    }

    /**
     * Obtém o valor da propriedade dataPagamento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataPagamento() {
        return dataPagamento;
    }

    /**
     * Define o valor da propriedade dataPagamento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataPagamento(XMLGregorianCalendar value) {
        this.dataPagamento = value;
    }

    /**
     * Obtém o valor da propriedade dataVencimento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataVencimento() {
        return dataVencimento;
    }

    /**
     * Define o valor da propriedade dataVencimento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataVencimento(XMLGregorianCalendar value) {
        this.dataVencimento = value;
    }

    /**
     * Obtém o valor da propriedade endosso.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEndosso() {
        return endosso;
    }

    /**
     * Define o valor da propriedade endosso.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEndosso(Integer value) {
        this.endosso = value;
    }

    /**
     * Obtém o valor da propriedade item.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getItem() {
        return item;
    }

    /**
     * Define o valor da propriedade item.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setItem(Integer value) {
        this.item = value;
    }

    /**
     * Obtém o valor da propriedade numeroPrestacao.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroPrestacao() {
        return numeroPrestacao;
    }

    /**
     * Define o valor da propriedade numeroPrestacao.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroPrestacao(Integer value) {
        this.numeroPrestacao = value;
    }

    /**
     * Obtém o valor da propriedade percentualJuros.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentualJuros() {
        return percentualJuros;
    }

    /**
     * Define o valor da propriedade percentualJuros.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentualJuros(BigDecimal value) {
        this.percentualJuros = value;
    }

    /**
     * Obtém o valor da propriedade ramo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRamo() {
        return ramo;
    }

    /**
     * Define o valor da propriedade ramo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRamo(Integer value) {
        this.ramo = value;
    }

    /**
     * Obtém o valor da propriedade sucursal.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSucursal() {
        return sucursal;
    }

    /**
     * Define o valor da propriedade sucursal.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSucursal(Integer value) {
        this.sucursal = value;
    }

    /**
     * Obtém o valor da propriedade tipoCobranca.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTipoCobranca() {
        return tipoCobranca;
    }

    /**
     * Define o valor da propriedade tipoCobranca.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTipoCobranca(Integer value) {
        this.tipoCobranca = value;
    }

    /**
     * Obtém o valor da propriedade valorAdicionalFracionamento.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorAdicionalFracionamento() {
        return valorAdicionalFracionamento;
    }

    /**
     * Define o valor da propriedade valorAdicionalFracionamento.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorAdicionalFracionamento(BigDecimal value) {
        this.valorAdicionalFracionamento = value;
    }

    /**
     * Obtém o valor da propriedade valorIOF.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorIOF() {
        return valorIOF;
    }

    /**
     * Define o valor da propriedade valorIOF.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorIOF(BigDecimal value) {
        this.valorIOF = value;
    }

    /**
     * Obtém o valor da propriedade valorParcela.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorParcela() {
        return valorParcela;
    }

    /**
     * Define o valor da propriedade valorParcela.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorParcela(BigDecimal value) {
        this.valorParcela = value;
    }

}
