
package ppt.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para partida complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="partida"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="j1" type="{http://ws.ppt/}jugador" minOccurs="0"/&gt;
 *         &lt;element name="j2" type="{http://ws.ppt/}jugador" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "partida", propOrder = {
    "id",
    "j1",
    "j2"
})
public class Partida {

    protected String id;
    protected Jugador j1;
    protected Jugador j2;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad j1.
     * 
     * @return
     *     possible object is
     *     {@link Jugador }
     *     
     */
    public Jugador getJ1() {
        return j1;
    }

    /**
     * Define el valor de la propiedad j1.
     * 
     * @param value
     *     allowed object is
     *     {@link Jugador }
     *     
     */
    public void setJ1(Jugador value) {
        this.j1 = value;
    }

    /**
     * Obtiene el valor de la propiedad j2.
     * 
     * @return
     *     possible object is
     *     {@link Jugador }
     *     
     */
    public Jugador getJ2() {
        return j2;
    }

    /**
     * Define el valor de la propiedad j2.
     * 
     * @param value
     *     allowed object is
     *     {@link Jugador }
     *     
     */
    public void setJ2(Jugador value) {
        this.j2 = value;
    }

}
