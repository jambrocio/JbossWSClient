
package com.webservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para suma complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="suma">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="valorNumerico1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="valorNumerico2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "suma", propOrder = {
    "valorNumerico1",
    "valorNumerico2"
})
public class Suma {

    protected int valorNumerico1;
    protected int valorNumerico2;

    /**
     * Obtiene el valor de la propiedad valorNumerico1.
     * 
     */
    public int getValorNumerico1() {
        return valorNumerico1;
    }

    /**
     * Define el valor de la propiedad valorNumerico1.
     * 
     */
    public void setValorNumerico1(int value) {
        this.valorNumerico1 = value;
    }

    /**
     * Obtiene el valor de la propiedad valorNumerico2.
     * 
     */
    public int getValorNumerico2() {
        return valorNumerico2;
    }

    /**
     * Define el valor de la propiedad valorNumerico2.
     * 
     */
    public void setValorNumerico2(int value) {
        this.valorNumerico2 = value;
    }

}
