
package br.com.bradseg.siaw.antecipaparcela.webservice.stub;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de IntegrationException complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="IntegrationException">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="requestId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="messages" type="{http://webservice.antecipaparcela.siaw.bradseg.com.br/}message" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntegrationException", propOrder = {
    "content"
})
public class IntegrationException {

    @XmlElementRefs({
        @XmlElementRef(name = "message", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "requestId", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "messages", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> content;

    /**
     * Obt�m o restante do modelo do conte�do. 
     * 
     * <p>
     * Voc� est� obtendo esta propriedade "catch-all" pelo seguinte motivo: 
     * O nome do campo "Message" � usado por duas partes diferentes de um esquema. Consulte: 
     * linha 62 de http://localhost:9081/SIAW-AntecipaParcela/service/AntecipaParcelaWebService?wsdl
     * linha 59 de http://localhost:9081/SIAW-AntecipaParcela/service/AntecipaParcelaWebService?wsdl
     * <p>
     * Para eliminar esta propriedade, aplique uma personaliza��o de propriedade a uma 
     * das seguintes declara��es, a fim de alterar seus nomes: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Message }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<?>>();
        }
        return this.content;
    }

}
