
package ppt.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para afegirJugador complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="afegirJugador"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codiPartida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jugador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "afegirJugador", propOrder = {
    "codiPartida",
    "jugador"
})
public class AfegirJugador {

    protected String codiPartida;
    protected String jugador;

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

    /**
     * Obtiene el valor de la propiedad jugador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJugador() {
        return jugador;
    }

    /**
     * Define el valor de la propiedad jugador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJugador(String value) {
        this.jugador = value;
    }

}
