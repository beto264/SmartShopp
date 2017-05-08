package cl.duoc.innovacion.smartshopp.persistence;
// Generated 06-05-2017 15:38:00 by Hibernate Tools 5.2.1.Final

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import cl.duoc.innovacion.smartshopp.persistence.exceptions.PersistenceException;
import cl.duoc.innovacion.smartshopp.services.Constants;
import cl.duoc.innovacion.smartshopp.services.IHome;

/**
 * Home object for domain model class Categoria.
 * 
 * @see cl.duoc.innovacion.smartshopp.persistence.Categoria
 * @author Hibernate Tools
 */
public class CategoriaHome implements IHome<Categoria> {

	private static final String CLASS_PATH = "cl.duoc.innovacion.smartshopp.persistence.Categoria";

	public Categoria findById(int id) throws PersistenceException {
		Categoria categoria = null;
		try {
			log.debug("getting Categoria with id: " + id);
			Session session = getSessionFactory().getCurrentSession();
			session.beginTransaction();
			categoria = (Categoria) session.get(CLASS_PATH, id);

			if (null == categoria) {
				log.error("Data not found");
				throw new PersistenceException(Constants.DATA_NOT_FOUND_ID, Constants.DATA_NOT_FOUND);
			}

			session.getTransaction().commit();
			session.close();
		} catch (HibernateException e) {
			throw new PersistenceException(Constants.PERSISTENCE_ERROR_ID, Constants.PERSISTENCE_ERROR, e.getMessage());
		}
		return categoria;
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<Categoria> getAll() throws PersistenceException {
		List<Categoria> categorias = null;

		try {
			log.debug("finding all Categorias");
			Session session = getSessionFactory().getCurrentSession();
			session.beginTransaction();
			categorias = session.createCriteria(Categoria.class).list();

			if (null == categorias || categorias.isEmpty()) {
				throw new PersistenceException(Constants.DATA_NOT_FOUND_ID, Constants.DATA_NOT_FOUND);
			}

			session.getTransaction().commit();
			session.close();
		} catch (HibernateException e) {
			throw new PersistenceException(Constants.PERSISTENCE_ERROR_ID, Constants.PERSISTENCE_ERROR, e.getMessage());
		}

		return categorias;
	}
}
