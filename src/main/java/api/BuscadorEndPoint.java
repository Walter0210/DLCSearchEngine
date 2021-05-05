/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api;

import entidades.Documento;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import negocio.ControladorBuscador;
import javax.inject.Inject;
import javax.ws.rs.Produces;
/**
 *
 * @author Lautarito
 */
@Path("/")
public class BuscadorEndPoint {
    
    
    @Inject private ControladorBuscador buscador;
    @GET
    public Response index(){
        return Response.ok("Funciona perro").build();
    }
    
    @GET
    @Path("/listado")
    @Produces("application/json")
    public Response listado(){
        
        List<Documento> todos = buscador.buscar("");
        return Response.ok(todos).build();
    }
    
    
}
