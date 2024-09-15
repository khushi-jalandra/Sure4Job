
package struts.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import sureForJob.User;

public class UserActionCode extends ActionSupport implements ModelDriven
{
    
    User user=new User();

    @Override
    public User getModel() {
        return user;
    }

    @Override
    public String execute() throws Exception {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx =session.beginTransaction();
        session.save(user);
        tx.commit();
        session.close();
        return SUCCESS;
    }
    
    public String checkLogin()
    {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx =session.beginTransaction();
        
        Criteria crit = session.createCriteria(User.class);
        crit.add(Restrictions.and(Restrictions.eq("id",user.getId()), Restrictions.eq("password",user.getPassword())));
        List<User> data = crit.list();
        if(data.isEmpty())
            return ERROR;
        else
            return SUCCESS;
    }
    
    public String updatePassword()
    {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx =session.beginTransaction();
        
        Criteria crit = session.createCriteria(User.class);
        crit.add(Restrictions.and(Restrictions.eq("id",user.getId()), Restrictions.eq("password",user.getPassword())));
        List<User> data = crit.list();
        if(data.isEmpty())
            return ERROR;
        else
        {
            if(user.getNewPassword().equals(user.getConfirmPassword()))
            {
            User us = (User) session.get(User.class,user.getId());
            us.setPassword(user.getNewPassword());
            session.update(us);
            tx.commit();
            session.close();
            }
        }
            return SUCCESS;
    }
    public String deleteAccount()
    {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx =session.beginTransaction();
        
        Criteria crit = session.createCriteria(User.class);
        crit.add(Restrictions.and(Restrictions.eq("id",user.getId()), Restrictions.eq("password",user.getPassword())));
        List<User> data = crit.list();
        if(data.isEmpty())
            return ERROR;
        else
        {
            User us = (User) session.get(User.class,user.getId());
            session.delete(us);
            tx.commit();
            session.close();
            
        }
           return SUCCESS;
    }
    
}
