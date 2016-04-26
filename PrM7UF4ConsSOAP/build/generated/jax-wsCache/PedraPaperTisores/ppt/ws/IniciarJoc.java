
package ppt.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para iniciarJoc complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="iniciarJoc"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codiPartida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iniciarJoc", propOrder = {
    "codiPartida"
})
public class IniciarJoc {

    protected String codiPartida;

    /**
     * Obtiene el valor de la propiedad codiPartida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiPartida() {
        return codiPartida;
    }

    /**
     * Define el valor de la propiedad codiPartida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiPartida(String value) {
        this.codiPartida = value;
    }

}
