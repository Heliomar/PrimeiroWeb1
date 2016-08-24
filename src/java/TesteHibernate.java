
import com.algaworksjsf2.financeiro.model.Lancamento;
import com.algaworksjsf2.financeiro.model.Pessoa;
import com.algaworksjsf2.financeiro .util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;


/**
 *
 * importor g.hibernate.*;
   
  public class HibernateUtil {
   
  private static final SessionFactory sessionFactory = buildSessionFactory();
   
  private static SessionFactory buildSessionFactory(){     
         try{
         Configuration cfg = new Configuration();
         cfg.configure("hibernate.cfg.xml");
         return cfg.buildSessionFactory();
         }catch (Throwablee){
           System.out.println("Erro:" + e);
            throw new ExceptionIn InitializerError(e);
         }
    } 
   
    public static SessionFactory getSessionFactory(){
         return sessionFactory;
  }
}
 * @author Helio
 */
public class TesteHibernate {
    
    public static void main(String[] args){
         
      Session session =  HibernateUtil.getSession();
     List<Pessoa> pessoas = session.createCriteria(Pessoa.class).list();  //.addOrder(Order.asc("nome")).list();  //add(Restrictions.gt("nome", 3)).lis();
              //.list();
      //Session session = HibernateUtil.getSession();

// openSession().createCriteria(Pessoa.class).list();// createCriteria(Pessoa.class).list();//createCriteria(Pessoa.class).list();
       for (Pessoa p : pessoas) {
           System.out.println(p.getCodigo()+ " - " +p.getNome());
        }
        
          List<Lancamento> lancamentos = session.createCriteria(Lancamento.class).list(); //addOrder(Order.desc("codigo")).list();//  addOrder(Order.asc("nome")).list();
          
       for(Lancamento l : lancamentos){
        
            System.out.println(l.getValor()+" - "+l.getPessoa()+" - " +l.getDescricao()+" - "+l.getDataPagamento()+" -  "+l.getDataVencimento()+" - "
                    +" - "+l.isPago()+" - "+l.getCodigo()+" - "+l.getTipo());
        }
    session.close();
    }
}
