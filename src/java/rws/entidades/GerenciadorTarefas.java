/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rws.entidades;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author michelet
 */
@Path("/tarefas")
@Produces(MediaType.TEXT_PLAIN)
@Consumes(MediaType.TEXT_PLAIN)
public class GerenciadorTarefas {
    private static final Logger log = Logger.getLogger(GerenciadorTarefas.class.getName());
    private static Map<String, Tarefa> tarefas = new LinkedHashMap<String,Tarefa>();
    
    static {
        Tarefa[] listaTarefas= new Tarefa[]{
            new Tarefa("1","Alimentar cachorro"),
            new Tarefa("2","Cozinhar"),
            new Tarefa("3","Comprar suco de laranja")
        };
        for(Tarefa t:listaTarefas){
            tarefas.put(t.getId(), t);
            
        }
    }
    @GET
    @Path("/ls")
    public Collection <Tarefa> getTarefas(){
        Collection<Tarefa> resultado = tarefas.values();
        log.info("getTarefas "+resultado);
        return resultado;
    }
    @GET
    @Path("/tarefa/{id}")
    public Tarefa getTarefa(@PathParam("id") String id){
        Tarefa resultado = tarefas.get(id);
        log.info("getTarefa "+ resultado);
        return resultado;
    }
    @PUT
    @Path("/tarefa/{id}")
    public Tarefa addTarefa(@PathParam("id")String id, @QueryParam("descricao") String descricao){
       Tarefa t = new Tarefa(id,descricao);
       log.info("addTarefa: "+t);
       tarefas.put(id, t);
       return t;
    }
    @POST
    @Path("/tarefa/{id}")
    public Tarefa updateBook(@PathParam("id") String id, String descricao){
        Tarefa t = tarefas.get(id);
        if(t != null)
            t.setDescricao(descricao);
        log.info("updateBook: "+t);
        return t;       
    }
    @DELETE
    @Path("/tarefa/{id}")
    public Tarefa removeTarefa(@PathParam("id") String id){
        Tarefa t = tarefas.remove(id);
        log.info("removeTarefa: "+t);
        return t;
    }
    
}
