/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworksjsf2.financeiro.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/**

 * @author Helio
 */

@ManagedBean
@Entity
@Table(name="Lancamento")
public class Lancamento implements Serializable{
    
    private Integer codigo;
    private TipoLancamento tipo;
    private Pessoa pessoa;
    private String descricao;
    private BigDecimal valor;
    private Date dataVencimento;
    private boolean pago;
    private Date dataPagamento;

    /**
     * @return the codigo
     */
    
    @GeneratedValue
    public Integer getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the tipo
     */
    @Enumerated(EnumType.STRING)
    public TipoLancamento getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(TipoLancamento tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the pessoa
     */
    @Id
    @ManyToOne
    @JoinColumn(name="codigo_pessoa")
    public Pessoa getPessoa() {
        return pessoa;
    }

    /**
     * @param pessoa the pessoa to set
     */
   
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
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

    /**
     * @return the valor
     */
    public BigDecimal getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    /**
     * @return the dataVencimento
     */
    @Column(name="Data_Vencimento")
    public Date getDataVencimento() {
        return dataVencimento;
    }

    /**
     * @param dataVencimento the dataVencimento to set
     */
    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    /**
     * @return the pago
     */
    public boolean isPago() {
        return pago;
    }

    /**
     * @param pago the pago to set
     */
    public void setPago(boolean pago) {
        this.pago = pago;
    }

    /**
     * @return the dataPagamento
     */
    @Column(name="Data_Pagamento")
    public Date getDataPagamento() {
        return dataPagamento;
    }

    /**
     * @param dataPagamento the dataPagamento to set
     */
    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
    
    @Override
    public int hashCode(){
        final int prime =31;
        int result = 1;
        result = prime* result +((codigo== null)? 0 : codigo.hashCode());
        return result;
    
    }
    @Override
    public boolean equals(Object obj){
        if(this ==obj)
        return true;
        if(obj == null)
        return false;
        if(getClass() != obj.getClass())
            return false;
        Pessoa other = (Pessoa)obj;
        if(codigo == null ){
            if (other.getCodigo().equals(this.codigo))
                return false;
        }else if (!codigo.equals(other.getCodigo()))
            return false;
        return true;
    }

   
}
