
package Services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClientesTYPESEARCHResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientesTYPESEARCHResult"
})
@XmlRootElement(name = "ClientesTYPESEARCHResponse")
public class ClientesTYPESEARCHResponse {

    @XmlElement(name = "ClientesTYPESEARCHResult")
    protected String clientesTYPESEARCHResult;

    /**
     * Obtiene el valor de la propiedad clientesTYPESEARCHResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientesTYPESEARCHResult() {
        return clientesTYPESEARCHResult;
    }

    /**
     * Define el valor de la propiedad clientesTYPESEARCHResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientesTYPESEARCHResult(String value) {
        this.clientesTYPESEARCHResult = value;
    }

}
