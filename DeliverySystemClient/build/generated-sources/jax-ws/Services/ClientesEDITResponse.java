
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
 *         &lt;element name="ClientesEDITResult" type="{http://tempuri.org/}Customer" minOccurs="0"/>
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
    "clientesEDITResult"
})
@XmlRootElement(name = "ClientesEDITResponse")
public class ClientesEDITResponse {

    @XmlElement(name = "ClientesEDITResult")
    protected Customer clientesEDITResult;

    /**
     * Obtiene el valor de la propiedad clientesEDITResult.
     * 
     * @return
     *     possible object is
     *     {@link Customer }
     *     
     */
    public Customer getClientesEDITResult() {
        return clientesEDITResult;
    }

    /**
     * Define el valor de la propiedad clientesEDITResult.
     * 
     * @param value
     *     allowed object is
     *     {@link Customer }
     *     
     */
    public void setClientesEDITResult(Customer value) {
        this.clientesEDITResult = value;
    }

}
