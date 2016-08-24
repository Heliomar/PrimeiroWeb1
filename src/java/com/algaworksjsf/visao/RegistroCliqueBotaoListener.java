
package com.algaworksjsf.visao;

import javax.faces.bean.ManagedBean;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;
import javax.faces.component.UIComponent;
/**
 *
 * @author Helio
 */
@ManagedBean
public class RegistroCliqueBotaoListener implements ActionListener {
             

    @Override
    public void processAction(ActionEvent event) throws AbortProcessingException {
        System.out.println("Clicando no Botao"+event.getComponent().getId());
    }
    
}
