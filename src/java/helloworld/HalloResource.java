/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package helloworld;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;

import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 *
 * @author michelet
 */
@Stateless
@Path("/hallo")
public class HalloResource {
    @GET
    @Produces("text/json")
    public String getHallo(){
     return "{id:\"002\",mensagem:\"hallo\"};";
    }
    
   
}
