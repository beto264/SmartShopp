package cl.duoc.innovacion.smartshopp.persistence;
// Generated 06-05-2017 15:38:00 by Hibernate Tools 5.2.1.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class Oferta.
 * @see cl.duoc.innovacion.smartshopp.persistence.Oferta
 * @author Hibernate Tools
 */
public class OfertaHome {

	private static final Log log = LogFactory.getLog(OfertaHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Oferta transientInstance) {
		log.debug("persisting Oferta instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Oferta instance) {
		log.debug("attaching dirty Oferta instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Oferta instance) {
		log.debug("attaching clean Oferta instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Oferta persistentInstance) {
		log.debug("deleting Oferta instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Oferta merge(Oferta detachedInstance) {
		log.debug("merging Oferta instance");
		try {
			Oferta result = (Oferta) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Oferta findById(int id) {
		log.debug("getting Oferta instance with id: " + id);
		try {
			Oferta instance = (Oferta) sessionFactory.getCurrentSession().get("cl.duoc.innovacion.smartshopp.Oferta",
					id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Oferta instance) {
		log.debug("finding Oferta instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("cl.duoc.innovacion.smartshopp.Oferta")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
