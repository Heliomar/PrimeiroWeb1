/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworksjsf.visao;

import com.algaworksjsf2.financeiro.model.Lancamento;
import com.algaworksjsf2.financeiro.util.HibernateUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

/**
 *
 * @author Helio
 */
@ManagedBean
public class ConsultaLancamentoBean implements Serializable {
    
     private List<Lancamento> lancamentos = new ArrayList<Lancamento>();
    
    @PostConstruct
    public void inicializar(){
    
       
        
        Session session = HibernateUtil.getSession();
        this.lancamentos = (List<Lancamento>) session.createCriteria(Lancamento.class).list();//.addOrder(Order.desc("dataVencimento"));
        //session.createCriteria(Pessoa.class).list();
        
        session.close();
    }
    /**
     * @return the lancamentos
     */
    public List<Lancamento> getLancamentos() {
        return lancamentos;
    }
    
  }

    
 

