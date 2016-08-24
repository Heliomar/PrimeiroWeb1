/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworksjsf.visao;

import java.awt.event.ActionEvent;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.event.ValueChangeEvent;
import javax.faces.event.ValueChangeListener;
import javax.faces.component.UIComponent;

/**
 *
 * @author Helio
 */
@ManagedBean
@ApplicationScoped





public class GestaoProdutosBean implements Serializable{
    
    private String nomePesquisa;
    private List<Produto> produtos;
    private Produto produto;
    private Produto produtoSelecionado;
    private List<Produto> produtosFiltrados;
 
 public GestaoProdutosBean(){
 
     this.produtos = new ArrayList<Produto>();
     this.produto = new Produto();
     this.produtosFiltrados = new ArrayList<Produto>();
   }
 public String obterAjuda(){
     
        if (this.produtos.isEmpty()) {
            return "Recuperar?faces-redirect=true";
        } else {
            return "Recuperar?faces-redirect=true";
        }
    }
 public void verificarInclusao(ActionEvent event){
     
 System.out.println("verificando.....");
 if("".equals(this.produto.getFabricante())){
     this.produto.setFabricante("sem fabricante");
 }
 }

    /**
     * @return the produtoSelecionado
     */
    public Produto getProdutoSelecionado() {
        return produtoSelecionado;
    }

    /**
     * @param produtoSelecionado the produtoSelecionado to set
     */
    public void setProdutoSelecionado(Produto produtoSelecionado) {
        this.produtoSelecionado = produtoSelecionado;
    }
 
 public void excluir(){
 
    this.produtos.remove(this.produtoSelecionado);
 
 }
 
    public void incluir(){
    System.out.println("incluindo.....");
    this.produtos.add(this.produto);
    this.produto = new Produto();
        
    this.refazer();
    }
    
    
    @PostConstruct
    public void inicializar(){
    
    System.out.println("inicializzou bem");
    }
    
    @PreDestroy
    public void finalizar(){
    
        System.out.println("finalizou bem");
    }
    /**
     * @return the produto
     */
    public Produto getProduto() {
        return produto;
    }

    /**
     * @return the produtos
     */
    public List<Produto> getProdutos() {
        return produtos;
    }

    /**
     * @return the fabricantePesquisa
     */
    public String getNomePesquisa() {
        return nomePesquisa;
    }

    
    public void setNomePesquisa(String nomePesquisa) {
        this.nomePesquisa = nomePesquisa;
    }
    
    public void nomePesquisaAlterado(ValueChangeEvent event) {
        System.out.println("evento de mudanca de valor....D");

        System.out.println("valor atual: " + this.nomePesquisa);
        System.out.println("Novo valor: " + event.getNewValue());

        this.produtosFiltrados.clear();

        for (Produto produto : this.produtos) {
            if (produto.getNome()!=null && produto.getNome().toLowerCase().
                    startsWith(event.getNewValue().toString().toLowerCase())) {
                this.produtosFiltrados.add(produto);
            }
        }
    }

    /**
     * @return the produtosFiltrados
     */
    public List<Produto> getProdutosFiltrados() {
        return produtosFiltrados;
    }
    
    public void refazer() {
    
        this.produtosFiltrados.clear();
          for (Produto produto : this.produtos) {
            
                this.produtosFiltrados.add(produto);
         }
    
    }
}
