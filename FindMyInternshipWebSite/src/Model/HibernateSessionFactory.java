package Model;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

@SuppressWarnings("deprecation")
public class HibernateSessionFactory {
private static final SessionFactory sessionFactory;
public static final ThreadLocal<Session> session = new ThreadLocal<Session>();
static
{
	
	try
	{
		// Crée l’objet SessionFactory à partir de hibernate.cfg.xml
		sessionFactory = new Configuration().configure().buildSessionFactory();
	} 
	catch (Throwable ex) 
	{
		System.err.println("Initial SessionFactory creation failed." + ex);
		throw new ExceptionInInitializerError(ex);
	}
	}

	public static SessionFactory getSessionFactory() 
	{
		return sessionFactory;
	}
	
	public static Session currentSession() throws HibernateException {
		
		
		   Session s = session.get();
		 
		   // Ouvre une nouvelle Session, si ce Thread n'en a aucune
		   if (s == null || !s.isOpen()) {
		   s = sessionFactory.openSession();
		   session.set(s);
		   }
		   return s;
		   }
		 
		public static void closeSession() throws HibernateException {
			   Session s = session.get();
			   session.set(null);
			   if (s != null)
			   s.close();
		 }
	
}
