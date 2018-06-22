package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class SimpleDaoImpl implements SimpleDao {
	private SessionFactory sessionFactory;

	public SimpleDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public <T> void save(T entity) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(entity);
		tx.commit();
	}

	public <T> void delete(T entity) {

	}

	public <T> void update(T entity) {

	}

	public <T> void get(T entity) {

	}
}
