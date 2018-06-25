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

		Stock stock = new Stock(333, "Coca-Cola");

		StockDetails stockDetails = new StockDetails(stock, "Coca-Cola Inc.", "An American corporation");

		SessionFactory sessionFactory = Setup.getSessionFuctory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		session.save(stock);
		session.save(stockDetails);

		tx.commit();

		System.exit(0);
	}
}
