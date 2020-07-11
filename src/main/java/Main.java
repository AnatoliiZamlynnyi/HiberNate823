import model.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtil;

public class Main {
    public static void main(String[] args){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();

        User user = new User("Slavic",18);
        Transaction tx1 = session.beginTransaction();
        session.save(user);
        tx1.commit();

        System.out.println("Hello maven");
    }
}
