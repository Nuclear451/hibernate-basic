import dao.SimpleDao;
import dao.SimpleDaoImpl;
import model.Stock;
import model.StockDetails;
import model.User;
import model.Vehicle;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class App {
	private final static SimpleDao simpleDao = new SimpleDaoImpl(Setup.getSessionFuctory());

	public static void main(String[] args) {
//		User user = new User();
//		user.setName("George");
//
//		user.getVehicles().add(new Vehicle("car"));
//		user.getVehicles().add(new Vehicle("bike"));
//		user.getVehicles().add(new Vehicle("track"));
//		user.getVehicles().add(new Vehicle("vessel"));
//		user.getVehicles().add(new Vehicle("airplane"));

		SessionFactory sessionFactory = Setup.getSessionFuctory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		User user =  session.get(User.class, 16L);

		tx.commit();
		session.close();
		System.out.println(user.getVehicles());
		System.exit(0);
	}
}

