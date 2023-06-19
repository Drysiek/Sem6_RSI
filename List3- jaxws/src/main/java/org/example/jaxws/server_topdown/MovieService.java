
package org.example.jaxws.server_topdown;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.2
 * Generated source version: 3.0
 * 
 */
@WebService(name = "MovieService", targetNamespace = "http://example.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MovieService {


    /**
     * 
     * @param arg0
     * @return
     *     returns org.example.jaxws.server_topdown.Movie
     * @throws MovieNotFoundEx_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getMovie", targetNamespace = "http://example.org/", className = "org.example.jaxws.server_topdown.GetMovie")
    @ResponseWrapper(localName = "getMovieResponse", targetNamespace = "http://example.org/", className = "org.example.jaxws.server_topdown.GetMovieResponse")
    public Movie getMovie(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0)
        throws MovieNotFoundEx_Exception
    ;

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg4
     * @param arg1
     * @param arg0
     * @return
     *     returns org.example.jaxws.server_topdown.Movie
     * @throws MovieExistsEx_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addMovie", targetNamespace = "http://example.org/", className = "org.example.jaxws.server_topdown.AddMovie")
    @ResponseWrapper(localName = "addMovieResponse", targetNamespace = "http://example.org/", className = "org.example.jaxws.server_topdown.AddMovieResponse")
    public Movie addMovie(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        boolean arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        double arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        Genre arg4)
        throws MovieExistsEx_Exception
    ;

    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "countMovie", targetNamespace = "http://example.org/", className = "org.example.jaxws.server_topdown.CountMovie")
    @ResponseWrapper(localName = "countMovieResponse", targetNamespace = "http://example.org/", className = "org.example.jaxws.server_topdown.CountMovieResponse")
    public int countMovie();

    /**
     * 
     * @return
     *     returns java.util.List<org.example.jaxws.server_topdown.Movie>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllMovies", targetNamespace = "http://example.org/", className = "org.example.jaxws.server_topdown.GetAllMovies")
    @ResponseWrapper(localName = "getAllMoviesResponse", targetNamespace = "http://example.org/", className = "org.example.jaxws.server_topdown.GetAllMoviesResponse")
    public List<Movie> getAllMovies();

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     * @throws MovieNotFoundEx_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteMovie", targetNamespace = "http://example.org/", className = "org.example.jaxws.server_topdown.DeleteMovie")
    @ResponseWrapper(localName = "deleteMovieResponse", targetNamespace = "http://example.org/", className = "org.example.jaxws.server_topdown.DeleteMovieResponse")
    public boolean deleteMovie(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0)
        throws MovieNotFoundEx_Exception
    ;

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg4
     * @param arg1
     * @param arg0
     * @return
     *     returns org.example.jaxws.server_topdown.Movie
     * @throws MovieNotFoundEx_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateMovie", targetNamespace = "http://example.org/", className = "org.example.jaxws.server_topdown.UpdateMovie")
    @ResponseWrapper(localName = "updateMovieResponse", targetNamespace = "http://example.org/", className = "org.example.jaxws.server_topdown.UpdateMovieResponse")
    public Movie updateMovie(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        boolean arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        double arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        Genre arg4)
        throws MovieNotFoundEx_Exception
    ;

}