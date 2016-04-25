package restful;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;

/**
 * REST Web Service
 *
 * @author mor
 * @version 110416
 */
@Path("salutacio")
public class SalutacioREST {

    public static String cadena = "Olakease";
    
    @Context
    private UriInfo context;

    /**
     * Creates a new instance of SalutacioREST
     */
    public SalutacioREST() {
    }

    /**
     * Retrieves representation of an instance of restful.SalutacioREST
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(javax.ws.rs.core.MediaType.TEXT_PLAIN)
    public String getText() {
        return cadena;
    }

    /**
     * PUT method for updating or creating an instance of SalutacioREST
     * @param content representation for the resource
     */
    @PUT
    @Consumes(javax.ws.rs.core.MediaType.TEXT_PLAIN)
    public void putText(String content) {
        cadena="PUT";
    }
}
