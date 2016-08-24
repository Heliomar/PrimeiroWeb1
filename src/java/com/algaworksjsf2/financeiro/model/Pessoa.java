

package com.algaworksjsf2.financeiro.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Helio
 */

@Entity
@Table(name="Pessoa")
public class Pessoa implements Serializable{
   
  
  
  private Integer codigo;
  private String nome;
    
    /**
     * @return the codigo
     */
  
    public Pessoa(){
    
    }
   // @Id
    public Pessoa(String nome, Integer codigo){
     this.codigo= codigo;
     this.nome= nome;
    }
    
    @Id
    @GeneratedValue
    @Column(name="Pessoa_id")
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
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
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
            if (other.codigo != null)
                return false;
        }else if (!codigo.equals(other.codigo))
            return false;
        return true;
    }

   

   
}
