
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
 *         &lt;element name="IdC" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NombreC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DirC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TelC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoC" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "idC",
    "nombreC",
    "dirC",
    "telC",
    "emailC",
    "tipoC"
})
@XmlRootElement(name = "ClientesADD")
public class ClientesADD {

    @XmlElement(name = "IdC")
    protected int idC;
    @XmlElement(name = "NombreC")
    protected String nombreC;
    @XmlElement(name = "DirC")
    protected String dirC;
    @XmlElement(name = "TelC")
    protected String telC;
    @XmlElement(name = "EmailC")
    protected String emailC;
    protected int tipoC;

    /**
     * Obtiene el valor de la propiedad idC.
     * 
     */
    public int getIdC() {
        return idC;
    }

    /**
     * Define el valor de la propiedad idC.
     * 
     */
    public void setIdC(int value) {
        this.idC = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreC.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreC() {
        return nombreC;
    }

    /**
     * Define el valor de la propiedad nombreC.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreC(String value) {
        this.nombreC = value;
    }

    /**
     * Obtiene el valor de la propiedad dirC.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirC() {
        return dirC;
    }

    /**
     * Define el valor de la propiedad dirC.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirC(String value) {
        this.dirC = value;
    }

    /**
     * Obtiene el valor de la propiedad telC.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelC() {
        return telC;
    }

    /**
     * Define el valor de la propiedad telC.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelC(String value) {
        this.telC = value;
    }

    /**
     * Obtiene el valor de la propiedad emailC.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailC() {
        return emailC;
    }

    /**
     * Define el valor de la propiedad emailC.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailC(String value) {
        this.emailC = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoC.
     * 
     */
    public int getTipoC() {
        return tipoC;
    }

    /**
     * Define el valor de la propiedad tipoC.
     * 
     */
    public void setTipoC(int value) {
        this.tipoC = value;
    }

}
