package cl.duoc.innovacion.smartshopp.services;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import cl.duoc.innovacion.smartshopp.persistence.CategoriaHome;
import cl.duoc.innovacion.smartshopp.persistence.exceptions.PersistenceException;

public interface IHome<T> {

	final String HB_CFG_PATH = "hibernate.cfg.xml";

	public static final Log log = LogFactory.getLog(CategoriaHome.class);

	default SessionFactory getSessionFactory() {
		SessionFactory sessionFactory = new Configuration().configure(HB_CFG_PATH).buildSessionFactory();
		return sessionFactory;
	}

	public List<T> getAll() throws PersistenceException;

	public T findById(int id) throws PersistenceException;

}
