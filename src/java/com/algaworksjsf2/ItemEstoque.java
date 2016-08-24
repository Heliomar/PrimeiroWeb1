/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworksjsf2;

import java.math.BigDecimal;
import java.util.Date;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Helio
 */
@ManagedBean
@ApplicationScoped

public class ItemEstoque {
    
    private String descricao;
    private BigDecimal valorUnitario;
    private Short quantidade;
    private Integer codigoProduto;
    private Date dataChecagem;

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

    /**
     * @return the valorUnitario
     */
    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    /**
     * @param valorUnitario the valorUnitario to set
     */
    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    /**
     * @return the quantidade
     */
    public Short getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(Short quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the codigoProduto
     */
    public Integer getCodigoProduto() {
        return codigoProduto;
    }

    /**
     * @param codigoProduto the codigoProduto to set
     */
    public void setCodigoProduto(Integer codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    /**
     * @return the dataChecagem
     */
    public Date getDataChecagem() {
        return dataChecagem;
    }

    /**
     * @param dataChecagem the dataChecagem to set
     */
    public void setDataChecagem(Date dataChecagem) {
        this.dataChecagem = dataChecagem;
    }
    
    
    
}
