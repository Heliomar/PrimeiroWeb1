/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworksjsf2;

import javax.faces.bean.ManagedBean;
import javax.faces.component.html.HtmlCommandButton;
import javax.faces.component.html.HtmlInputText;

/**
 *
 * @author Helio
 */
@ManagedBean

public class TesteBean {
    private HtmlInputText campo;
    private HtmlCommandButton botao;

    /**
     * @return the campo
     */
    public HtmlInputText getCampo() {
        return campo;
    }

    /**
     * @param campo the campo to set
     */
    public void setCampo(HtmlInputText campo) {
        this.campo = campo;
    }

    /**
     * @return the botao
     */
    public HtmlCommandButton getBotao() {
        return botao;
    }

    /**
     * @param botao the botao to set
     */
    public void setBotao(HtmlCommandButton botao) {
        this.botao = botao;
    }
    public void testar(){
        if (this.campo.isDisabled()) {
            this.campo.setDisabled(false);
            this.botao.setStyle("");
        } else {
            this.campo.setDisabled(true);
            this.botao.setStyle("background-color: red; color: white");
      }
    }
    
    
}
