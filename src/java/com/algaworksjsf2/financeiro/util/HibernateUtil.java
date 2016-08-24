
package com.algaworksjsf2.financeiro.util;



import org.hibernate.cfg.Configuration;
//import org.hibernate.service.ServiceRegistryBuilder;//   ServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.service.ServiceRegistryBuilder;
       


 //* @author Helio
 
public class HibernateUtil {
        
  
    private static final SessionFactory sessionFactory;
    
    
  static
  {
      
        try 
          {
        Configuration configuration = new Configuration();
        configuration.configure();// configure();// configure("hibernat.cfg.xml");
        //configuration.buildSessionFactory("service.registry") ;
        
        ServiceRegistry serviceRegistry = new  ServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
              //  ./*buildServiceRegistry*/();//.build().getParentServiceRegistry(); 
       // ServiceRegistry serviceRegistry = new  ServiceRegistryBuilder.applySettings(configuration.getProperties().buildServiceRegistry()); //ServiceRegistryBuilder()
                //.applySettings(configuration.getProperties()).build().getParentServiceRegistry();
                
      //  ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).build();// buildServiceRegistry(serviceRegistry);
              sessionFactory = configuration.buildSessionFactory(serviceRegistry).openSession().getSessionFactory();//addSessionFactory;//.openSession().getSessionFactory();// buildSessionFactory(serviceRegistry);// .buildSessionFactory(serviceRegistry);
        
           }catch(Throwable e){
               
               
              
                throw new ExceptionInInitializerError(e);     
           }
 }

    public static Session getSession(){
     
       //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return sessionFactory.openSession();
    
      
  }
}