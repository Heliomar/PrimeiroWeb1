/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworksjsf.visao;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Helio
 */
@ManagedBean

public class Produto implements Serializable{
    
    private String nome;
    private String Fabricante;
    private String categoria;

    
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public String getFabricante() {
        return Fabricante;
    }

    
    public void setFabricante(String Fabricante) {
        this.Fabricante = Fabricante;
    }

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
}
