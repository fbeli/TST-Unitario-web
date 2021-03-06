
package br.com.bradseg.siaw.antecipaparcela.webservice.stub;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.bradseg.siaw.antecipaparcela.webservice.stub package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ConsultarParcela_QNAME = new QName("http://webservice.antecipaparcela.siaw.bradseg.com.br/", "consultarParcela");
    private final static QName _BusinessException_QNAME = new QName("http://webservice.antecipaparcela.siaw.bradseg.com.br/", "BusinessException");
    private final static QName _IntegrationException_QNAME = new QName("http://webservice.antecipaparcela.siaw.bradseg.com.br/", "IntegrationException");
    private final static QName _ConsultarParcelaResponse_QNAME = new QName("http://webservice.antecipaparcela.siaw.bradseg.com.br/", "consultarParcelaResponse");
    private final static QName _IntegrationExceptionMessage_QNAME = new QName("", "message");
    private final static QName _IntegrationExceptionRequestId_QNAME = new QName("", "requestId");
    private final static QName _IntegrationExceptionMessages_QNAME = new QName("", "messages");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.bradseg.siaw.antecipaparcela.webservice.stub
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BusinessException }
     * 
     */
    public BusinessException createBusinessException() {
        return new BusinessException();
    }

    /**
     * Create an instance of {@link ConsultarParcela }
     * 
     */
    public ConsultarParcela createConsultarParcela() {
        return new ConsultarParcela();
    }

    /**
     * Create an instance of {@link ConsultarParcelaResponse }
     * 
     */
    public ConsultarParcelaResponse createConsultarParcelaResponse() {
        return new ConsultarParcelaResponse();
    }

    /**
     * Create an instance of {@link IntegrationException }
     * 
     */
    public IntegrationException createIntegrationException() {
        return new IntegrationException();
    }

    /**
     * Create an instance of {@link Message }
     * 
     */
    public Message createMessage() {
        return new Message();
    }

    /**
     * Create an instance of {@link RetornoErroVo }
     * 
     */
    public RetornoErroVo createRetornoErroVo() {
        return new RetornoErroVo();
    }

    /**
     * Create an instance of {@link SaidaParcelaVo }
     * 
     */
    public SaidaParcelaVo createSaidaParcelaVo() {
        return new SaidaParcelaVo();
    }

    /**
     * Create an instance of {@link EntradaParcelaVo }
     * 
     */
    public EntradaParcelaVo createEntradaParcelaVo() {
        return new EntradaParcelaVo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarParcela }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.antecipaparcela.siaw.bradseg.com.br/", name = "consultarParcela")
    public JAXBElement<ConsultarParcela> createConsultarParcela(ConsultarParcela value) {
        return new JAXBElement<ConsultarParcela>(_ConsultarParcela_QNAME, ConsultarParcela.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.antecipaparcela.siaw.bradseg.com.br/", name = "BusinessException")
    public JAXBElement<BusinessException> createBusinessException(BusinessException value) {
        return new JAXBElement<BusinessException>(_BusinessException_QNAME, BusinessException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntegrationException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.antecipaparcela.siaw.bradseg.com.br/", name = "IntegrationException")
    public JAXBElement<IntegrationException> createIntegrationException(IntegrationException value) {
        return new JAXBElement<IntegrationException>(_IntegrationException_QNAME, IntegrationException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarParcelaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.antecipaparcela.siaw.bradseg.com.br/", name = "consultarParcelaResponse")
    public JAXBElement<ConsultarParcelaResponse> createConsultarParcelaResponse(ConsultarParcelaResponse value) {
        return new JAXBElement<ConsultarParcelaResponse>(_ConsultarParcelaResponse_QNAME, ConsultarParcelaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "message", scope = IntegrationException.class)
    public JAXBElement<String> createIntegrationExceptionMessage(String value) {
        return new JAXBElement<String>(_IntegrationExceptionMessage_QNAME, String.class, IntegrationException.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestId", scope = IntegrationException.class)
    public JAXBElement<String> createIntegrationExceptionRequestId(String value) {
        return new JAXBElement<String>(_IntegrationExceptionRequestId_QNAME, String.class, IntegrationException.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Message }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "messages", scope = IntegrationException.class)
    public JAXBElement<Message> createIntegrationExceptionMessages(Message value) {
        return new JAXBElement<Message>(_IntegrationExceptionMessages_QNAME, Message.class, IntegrationException.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "message", scope = BusinessException.class)
    public JAXBElement<String> createBusinessExceptionMessage(String value) {
        return new JAXBElement<String>(_IntegrationExceptionMessage_QNAME, String.class, BusinessException.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestId", scope = BusinessException.class)
    public JAXBElement<String> createBusinessExceptionRequestId(String value) {
        return new JAXBElement<String>(_IntegrationExceptionRequestId_QNAME, String.class, BusinessException.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Message }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "messages", scope = BusinessException.class)
    public JAXBElement<Message> createBusinessExceptionMessages(Message value) {
        return new JAXBElement<Message>(_IntegrationExceptionMessages_QNAME, Message.class, BusinessException.class, value);
    }

}
