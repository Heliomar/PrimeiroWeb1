/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworksjsf.visao;

import com.algaworksjsf2.financeiro.model.Lancamento;
import com.algaworksjsf2.financeiro.model.Pessoa;
import com.algaworksjsf2.financeiro.model.TipoLancamento;
import com.algaworksjsf2.financeiro.util.HibernateUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.persistence.criteria.Order;
import org.hibernate.Session;
import org.hibernate.Transaction;
//import org.hibernate.criterion.Order;

/**
 *
 * @author Helio
 */
//@PostConstruct
@ManagedBean
@ViewScoped
public class CadastroLancamentoBean implements Serializable{
      
    private List<Pessoa> pessoas = new ArrayList<Pessoa>();
    private Lancamento lancamento = new Lancamento();
    
   
    public void cadastrar(){
        
        Session session = HibernateUtil.getSession();
        Transaction trx = session.beginTransaction();
                
        session.merge(this.lancamento);
        trx.commit();
         session.close();
    
        /*System.out.println("Tipo:" +this.getLancamento().getTipo());
        System.out.println("Pessoa:" +this.getLancamento().getPessoa().getNome());
        System.out.println("Descrição:" +this.getLancamento().getDescricao());
        System.out.println("Valor:" +this.getLancamento().getValor());
        System.out.println("Data vencimento:" +this.getLancamento().getDataVencimento());
        System.out.println("Conta pago:" +this.getLancamento().isPago());
        System.out.println("data pagamento:" +this.getLancamento().getDataPagamento());
    */
        this.lancamento = new Lancamento();
        
        String msg = "Cadastro efetuado com sucesso !";
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,msg,msg));
       
    }

    /**
     * @return the lancamento
     */
    public TipoLancamento[] getTiposlancamentos(){
    return TipoLancamento.values();
    }
    public Lancamento getLancamento() {
        return lancamento;
    }
}
