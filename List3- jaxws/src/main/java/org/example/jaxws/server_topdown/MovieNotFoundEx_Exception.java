
package org.example.jaxws.server_topdown;

import jakarta.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.2
 * Generated source version: 3.0
 * 
 */
@WebFault(name = "MovieNotFoundEx", targetNamespace = "http://example.org/")
public class MovieNotFoundEx_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private MovieNotFoundEx faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public MovieNotFoundEx_Exception(String message, MovieNotFoundEx faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public MovieNotFoundEx_Exception(String message, MovieNotFoundEx faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: org.example.jaxws.server_topdown.MovieNotFoundEx
     */
    public MovieNotFoundEx getFaultInfo() {
        return faultInfo;
    }

}
