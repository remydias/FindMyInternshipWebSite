package Utils;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import Model.Company;
import Model.HibernateSessionFactory;
import Model.Student;

public class HBUtils {
	
	public void insertStudent(Student s)
	{
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.currentSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(s);
		
		System.out.println("Etudiant "+s.getLastName()+" bien inséré !");
		
		tx.commit();
		
		HibernateSessionFactory.closeSession();

	}
	
	public void deleteStudent(Student s)
	{
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.currentSession();
		
		Transaction tx = session.beginTransaction();
		
		session.delete(s);
		
		System.out.println("Etudiant "+s.getLastName()+" bien inséré !");
		
		tx.commit();
		
		
		HibernateSessionFactory.closeSession();

	}
	
	public List<Student> getStudentByName(String name)
	{
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.currentSession();
		
		Transaction tx = session.beginTransaction();
		
		List<Student> results = session.createQuery("from Student where LastName=?").setParameter(0,name).list();
		
		tx.commit();
						
		HibernateSessionFactory.closeSession();
		
		return results;

	}
	
	public List<Student> getStudentByMail(String mail)
	{
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.currentSession();
		
		Transaction tx = session.beginTransaction();
		
		List<Student> results = session.createSQLQuery("from Student where Email=?").setParameter(0,mail).list();
		
		tx.commit();
						
		HibernateSessionFactory.closeSession();
		
		return results;

	}
	
	public Student getStudentByID(int ID)
	{
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.currentSession();
		
		Transaction tx = session.beginTransaction();
		
		List<Student> results = session.createQuery("from Student where ID=?").setParameter(0,ID).list();
				
		tx.commit();
						
		HibernateSessionFactory.closeSession();
		
		if(results.size()==0)
		{
			System.out.println("Pas d'étudiant correspondant à l'ID");
			return null;
		}
	
		return  results.get(0);

	}
	
	public List<Company> getCompanyByName(String name)
	{
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.currentSession();
		
		Transaction tx = session.beginTransaction();
		
		List<Company> results = session.createQuery("from Company where Company=?").setParameter(0,name).list();
		
		tx.commit();
						
		HibernateSessionFactory.closeSession();
		
		return results;

	}
	
	public List<Company> getCompanyByMail(String mail)
	{
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.currentSession();
		
		Transaction tx = session.beginTransaction();
		
		List<Company> results = session.createSQLQuery("from Company where Email=?").setParameter(0,mail).list();
		
		tx.commit();
						
		HibernateSessionFactory.closeSession();
		
		return results;

	}
	
	public Company getCompanyByID(int ID)
	{
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.currentSession();
		
		Transaction tx = session.beginTransaction();
		
		List<Company> results = session.createSQLQuery("from Company where ID=?").setParameter(0,ID).list();
		
		tx.commit();
						
		HibernateSessionFactory.closeSession();
		
		return results.get(0);

	}
	
	
	public void insertCompany(Company s)
	{
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.currentSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(s);
		
		System.out.println("Company "+s.getCompany()+" bien insérée !");
		
		tx.commit();		
	
		HibernateSessionFactory.closeSession();

	}
	
	public void deleteCompany(Company s)
	{
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.currentSession();
		
		Transaction tx = session.beginTransaction();
		
		session.delete(s);
		
		System.out.println("Company "+s.getCompany()+" bien supprimée !");
		
		tx.commit();
	
		HibernateSessionFactory.closeSession();

	}

}
