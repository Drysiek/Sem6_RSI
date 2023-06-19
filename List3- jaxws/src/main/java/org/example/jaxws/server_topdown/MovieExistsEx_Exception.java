
package org.example.jaxws.server_topdown;

import jakarta.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.2
 * Generated source version: 3.0
 * 
 */
@WebFault(name = "MovieExistsEx", targetNamespace = "http://example.org/")
public class MovieExistsEx_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private MovieExistsEx faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public MovieExistsEx_Exception(String message, MovieExistsEx faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public MovieExistsEx_Exception(String message, MovieExistsEx faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: org.example.jaxws.server_topdown.MovieExistsEx
     */
    public MovieExistsEx getFaultInfo() {
        return faultInfo;
    }

}
