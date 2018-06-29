import model.User;
import model.Vehicle;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Setup {

	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFuctory(){
		if (sessionFactory != null) return sessionFactory;

		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
				.configure() // configures settings from hibernate.cfg.xml
				.build();

		sessionFactory = new MetadataSources( registry )
					.addAnnotatedClass(Vehicle.class)
					.addAnnotatedClass(User.class)
					.buildMetadata().buildSessionFactory();

		return sessionFactory;
	}
}
