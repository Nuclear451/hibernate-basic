package dao;

public interface SimpleDao {
	public<T> void save(T entity);
	public<T> void delete(T entity);
	public<T> void update(T entity);
	public<T> void get(T entity);
}
