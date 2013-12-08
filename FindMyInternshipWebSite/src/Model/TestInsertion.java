package Model;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import Utils.HBUtils;

import Utils.HBUtils;

public class TestInsertion {

	public static void main(String[] args) {
		
		HBUtils myConection = new HBUtils();
		Student s = myConection.getStudentByID(8);
		if(s!=null)
			myConection.deleteStudent(s);
		else
			System.out.println("Pas d'étudiant !");
	}

}
