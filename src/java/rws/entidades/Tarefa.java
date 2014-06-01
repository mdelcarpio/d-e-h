/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rws.entidades;

import java.io.Serializable;
import java.util.Calendar;

/**
 *
 * @author michelet
 */
public class Tarefa implements Serializable{
    private String id;
    private Calendar data;
    private String descricao;
    public Tarefa(String id, String descricao){
        this.id = id;
        this.descricao = descricao;
        data = Calendar.getInstance();
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the data
     */
    public Calendar getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Calendar data) {
        this.data = data;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

       
}
