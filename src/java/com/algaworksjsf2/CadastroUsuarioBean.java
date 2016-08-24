/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworksjsf2;

import java.util.Calendar;
import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/**
 *
 * @author Helio
 */
@ManagedBean

public class CadastroUsuarioBean {
    private String nome;
    private String email;
    private String senha;

    /**
     * @return the nome
     */
    public void cadastrar(){
     if(this.getNome()== null || this.getNome().length()< 5){
         this.adicionarMensagem("frm:nome", FacesMessage.SEVERITY_ERROR,"Nome incompleto.",
                 "Favor Informar seu nome completo");
     }
     if(hojehEDiadeDescanso()){
     this.adicionarMensagem(null, FacesMessage.SEVERITY_WARN,"hoje é dia de Descanso",
             "voce não pode adicionar usuario hoje");
     }
    
     FacesContext context = FacesContext.getCurrentInstance();
     if(!context.getMessages().hasNext()){
         //aqui cadastra usuario no banco de dados
         this.adicionarMensagem(null, FacesMessage.SEVERITY_INFO,"Usuario cadastrado.",
                 " O usuario cadastrado com sucesso!");
     }
    }
    private boolean hojehEDiadeDescanso(){
        //If(!Calendar.getInstance().get(Calendar.TUESDAY)){ //DAY_OF_WEEK)== Calendar.THURSDAY))
   
     return Calendar.getInstance().get(Calendar.DAY_OF_WEEK)== Calendar.SUNDAY;
      // }
    }
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

   /* private void adicionarMensagem(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
*/
    private void adicionarMensagem(String clienteId, Severity severity, String sumary, String detail) {
       
FacesContext context = FacesContext.getCurrentInstance();
FacesMessage message = new FacesMessage(severity,sumary,detail);

context.addMessage(clienteId, message);

    }

    
}
