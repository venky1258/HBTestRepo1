
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Insert {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {		
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		Employee employee=new Employee();
		employee.setName("Welcome");
		session.save(employee);
		transaction.commit();
		session.close();
		sessionFactory.close();
	}

}
