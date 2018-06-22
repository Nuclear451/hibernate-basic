import dao.SimpleDao;
import dao.SimpleDaoImpl;
import model.User;
import model.Vehicle;


public class App {
	private final static SimpleDao simpleDao = new SimpleDaoImpl(Setup.getSessionFuctory());

	public static void main(String[] args) {
		User user = new User();
		user.setName("Jake");

		//simpleDao.save(vehicle);

		System.exit(0);
	}
}
