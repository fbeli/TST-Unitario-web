
package br.com.bradseg.siaw.antecipaparcela.webservice.stub;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de saidaParcelaVo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="saidaParcelaVo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataVencimentoBoleto" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="erro" type="{http://webservice.antecipaparcela.siaw.bradseg.com.br/}retornoErroVo" minOccurs="0"/>
 *         &lt;element name="valorIOFCalculado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="valorParcelaCalculado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saidaParcelaVo", propOrder = {
    "dataVencimentoBoleto",
    "erro",
    "valorIOFCalculado",
    "valorParcelaCalculado"
})
public class SaidaParcelaVo {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataVencimentoBoleto;
    protected RetornoErroVo erro;
    protected BigDecimal valorIOFCalculado;
    protected BigDecimal valorParcelaCalculado;

    /**
     * Obtém o valor da propriedade dataVencimentoBoleto.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataVencimentoBoleto() {
        return dataVencimentoBoleto;
    }

    /**
     * Define o valor da propriedade dataVencimentoBoleto.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataVencimentoBoleto(XMLGregorianCalendar value) {
        this.dataVencimentoBoleto = value;
    }

    /**
     * Obtém o valor da propriedade erro.
     * 
     * @return
     *     possible object is
     *     {@link RetornoErroVo }
     *     
     */
    public RetornoErroVo getErro() {
        return erro;
    }

    /**
     * Define o valor da propriedade erro.
     * 
     * @param value
     *     allowed object is
     *     {@link RetornoErroVo }
     *     
     */
    public void setErro(RetornoErroVo value) {
        this.erro = value;
    }

    /**
     * Obtém o valor da propriedade valorIOFCalculado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorIOFCalculado() {
        return valorIOFCalculado;
    }

    /**
     * Define o valor da propriedade valorIOFCalculado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorIOFCalculado(BigDecimal value) {
        this.valorIOFCalculado = value;
    }

    /**
     * Obtém o valor da propriedade valorParcelaCalculado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorParcelaCalculado() {
        return valorParcelaCalculado;
    }

    /**
     * Define o valor da propriedade valorParcelaCalculado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorParcelaCalculado(BigDecimal value) {
        this.valorParcelaCalculado = value;
    }

}
