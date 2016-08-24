/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworksjsf2;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Helio
 */
@ManagedBean
@ApplicationScoped

public class EstoqueBean {
    private ItemEstoque itemEstoque = new ItemEstoque();
    private List<ItemEstoque> itensEstoque = new ArrayList<ItemEstoque>();

 public void incluir(){
 
     this.getItensEstoque().add(this.getItemEstoque());
 this.itemEstoque = new ItemEstoque();
 }
 public void limpar(){
 
 this.itensEstoque.clear();
 }

    /**
     * @return the itemEstoque
     */
    public ItemEstoque getItemEstoque() {
        return itemEstoque;
    }

    /**
     * @return the itensEstoque
     */
    public List<ItemEstoque> getItensEstoque() {
        return itensEstoque;
    }
}



