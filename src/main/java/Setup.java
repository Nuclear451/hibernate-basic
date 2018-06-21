import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Setup {
	private static SessionFactory sessionFactory;

	private static void configure(){
		if (sessionFactory != null) return;

		Configuration cgf = new Configuration();
		cgf.configure();

		ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(cgf.getProperties()).build();

		sessionFactory = cgf.buildSessionFactory(sr);
	}
}
