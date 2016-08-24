
package com.algaworksjfs2.converter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javafx.scene.input.DataFormat;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Helio
 */


@FacesConverter("com.algaworksjfs2.SmartDate")

public class SmartDateConverter implements Converter {
    
     private static final DateFormat formatador = new SimpleDateFormat("dd/mm/yyyy");
    
     private Date getDataHoje(){
     Calendar dataHoje = Calendar.getInstance();
     dataHoje.set(Calendar.HOUR_OF_DAY,0);
     dataHoje.set(Calendar.MINUTE, 0);
     dataHoje.set(Calendar.SECOND, 0);
     dataHoje.set(Calendar.MILLISECOND, 0);
         return dataHoje.getTime();
     }

    @Override
    public Object getAsObject(FacesContext context, UIComponent uic, String value) {
         Date dataConvertida = null;
        if(value!= null && value.equals("")){
          if(value.equalsIgnoreCase("hoje")){
          dataConvertida = getDataHoje();
          }else{
           try{
              dataConvertida = formatador.parse(value);
           }catch(ParseException e){
               FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Data Incoreta.","Informe uma Data correta.");               
             // throw new ConverterException(msg):
            
           throw new ConverterException(msg);
          }
          }
        }
        return dataConvertida;
        
    }

    @Override
    public String getAsString(FacesContext context, UIComponent uic, Object value) {
         
        if(this.getDataHoje().equals(value)){
              return "hoje";
        }
        return formatador.format((Date) value);
        
    }
}
