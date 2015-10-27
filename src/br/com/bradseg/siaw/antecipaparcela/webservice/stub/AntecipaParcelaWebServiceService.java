package br.com.bradseg.siaw.antecipaparcela.webservice.stub;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.10
 * 2015-10-20T12:02:05.209-02:00
 * Generated source version: 2.7.10
 * 
 */
@WebServiceClient(name = "AntecipaParcelaWebServiceService", 
                  wsdlLocation = "http://localhost:9081/SIAW-AntecipaParcela/service/AntecipaParcelaWebService?wsdl",
                  targetNamespace = "http://webservice.antecipaparcela.siaw.bradseg.com.br/") 
public class AntecipaParcelaWebServiceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://webservice.antecipaparcela.siaw.bradseg.com.br/", "AntecipaParcelaWebServiceService");
    public final static QName AntecipaParcelaWebServicePort = new QName("http://webservice.antecipaparcela.siaw.bradseg.com.br/", "AntecipaParcelaWebServicePort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:9081/SIAW-AntecipaParcela/service/AntecipaParcelaWebService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(AntecipaParcelaWebServiceService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:9081/SIAW-AntecipaParcela/service/AntecipaParcelaWebService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public AntecipaParcelaWebServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public AntecipaParcelaWebServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AntecipaParcelaWebServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public AntecipaParcelaWebServiceService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public AntecipaParcelaWebServiceService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public AntecipaParcelaWebServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns AntecipaParcelaWebService
     */
    @WebEndpoint(name = "AntecipaParcelaWebServicePort")
    public AntecipaParcelaWebService getAntecipaParcelaWebServicePort() {
        return super.getPort(AntecipaParcelaWebServicePort, AntecipaParcelaWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AntecipaParcelaWebService
     */
    @WebEndpoint(name = "AntecipaParcelaWebServicePort")
    public AntecipaParcelaWebService getAntecipaParcelaWebServicePort(WebServiceFeature... features) {
        return super.getPort(AntecipaParcelaWebServicePort, AntecipaParcelaWebService.class, features);
    }

}
