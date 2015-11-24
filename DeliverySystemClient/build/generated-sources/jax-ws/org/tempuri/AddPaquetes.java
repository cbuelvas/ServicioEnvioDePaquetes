
package org.tempuri;

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
 *         &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Departamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodPosRemitente" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CodPosDestinatario" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Peso" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="CostoPorGramos" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "codigo",
    "nombre",
    "direccion",
    "pais",
    "departamento",
    "codPosRemitente",
    "codPosDestinatario",
    "peso",
    "costoPorGramos"
})
@XmlRootElement(name = "addPaquetes")
public class AddPaquetes {

    @XmlElement(name = "Codigo")
    protected int codigo;
    @XmlElement(name = "Nombre")
    protected String nombre;
    @XmlElement(name = "Direccion")
    protected String direccion;
    @XmlElement(name = "Pais")
    protected String pais;
    @XmlElement(name = "Departamento")
    protected String departamento;
    @XmlElement(name = "CodPosRemitente")
    protected int codPosRemitente;
    @XmlElement(name = "CodPosDestinatario")
    protected int codPosDestinatario;
    @XmlElement(name = "Peso")
    protected double peso;
    @XmlElement(name = "CostoPorGramos")
    protected double costoPorGramos;

    /**
     * Obtiene el valor de la propiedad codigo.
     * 
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Define el valor de la propiedad codigo.
     * 
     */
    public void setCodigo(int value) {
        this.codigo = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad direccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Define el valor de la propiedad direccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccion(String value) {
        this.direccion = value;
    }

    /**
     * Obtiene el valor de la propiedad pais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPais() {
        return pais;
    }

    /**
     * Define el valor de la propiedad pais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPais(String value) {
        this.pais = value;
    }

    /**
     * Obtiene el valor de la propiedad departamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * Define el valor de la propiedad departamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartamento(String value) {
        this.departamento = value;
    }

    /**
     * Obtiene el valor de la propiedad codPosRemitente.
     * 
     */
    public int getCodPosRemitente() {
        return codPosRemitente;
    }

    /**
     * Define el valor de la propiedad codPosRemitente.
     * 
     */
    public void setCodPosRemitente(int value) {
        this.codPosRemitente = value;
    }

    /**
     * Obtiene el valor de la propiedad codPosDestinatario.
     * 
     */
    public int getCodPosDestinatario() {
        return codPosDestinatario;
    }

    /**
     * Define el valor de la propiedad codPosDestinatario.
     * 
     */
    public void setCodPosDestinatario(int value) {
        this.codPosDestinatario = value;
    }

    /**
     * Obtiene el valor de la propiedad peso.
     * 
     */
    public double getPeso() {
        return peso;
    }

    /**
     * Define el valor de la propiedad peso.
     * 
     */
    public void setPeso(double value) {
        this.peso = value;
    }

    /**
     * Obtiene el valor de la propiedad costoPorGramos.
     * 
     */
    public double getCostoPorGramos() {
        return costoPorGramos;
    }

    /**
     * Define el valor de la propiedad costoPorGramos.
     * 
     */
    public void setCostoPorGramos(double value) {
        this.costoPorGramos = value;
    }

}
