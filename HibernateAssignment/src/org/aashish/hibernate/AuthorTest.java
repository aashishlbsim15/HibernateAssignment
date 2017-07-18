package org.aashish.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.hibernate.bean.*;

import java.util.*;


public class AuthorTest
{
	public static void main(String[] args) {

		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction t=session.beginTransaction();


		Author a=new Author();

        List<String> sublist1=new ArrayList<>();
		List<String> sublist2=new ArrayList<>();
   	Author a1=new Author();     
Book b=new Book();
b.setBookName("harry potter");
b.setId(1);
Book b1=new Book();
b1.setBookName("2 states");
b1.setId(2);
b1.getAuthor().add(a1);
b1.getAuthor().add(a);
   Book b2=new Book();
   b2.setId(3);
   b2.setBookName("prisoner of akzaban");
   b2.getAuthor().add(a);
   Book b3=new Book();
   b3.setId(4);
       b3.setBookName("can love happen twice");
       b3.getAuthor().add(a);
       b3.getAuthor().add(a1);





		sublist1.add("Maths");
		sublist1.add("Physics");
		sublist1.add("Chemistry");

        sublist2.add("English");
		sublist2.add("Hindi");
		sublist2.add("Social Science");

		a.setId(1);
		a.setFirstName("aashish");
		a.setLastName("mishra");
		a.setAge("25");
		a.setSubjects(sublist1);
		a.getBook().add(b);
		a.getBook().add(b1);

Calendar calendar=new GregorianCalendar();
calendar.set(Calendar.YEAR,1992);
calendar.set(Calendar.MONTH,05);
calendar.set(Calendar.DATE,23);
a.setDob(calendar);

		Calendar calendar1=new GregorianCalendar();
		calendar1.set(Calendar.YEAR,1994);
		calendar1.set(Calendar.MONTH,10);
		calendar1.set(Calendar.DATE,22);
a1.setDob(calendar1);
		a1.setAge("24");
		a1.setLastName("Kumar");
		a1.setFirstName("Randhir");
		a1.setId(2);
		a1.setSubjects(sublist2);
		a1.getBook().add(b2);
		a1.getBook().add(b3);

session.save(b);
session.save(b1);
session.save(b2);
session.save(b3);
session.save(a);
session.save(a1);
		t.commit();
		session.close();
		sessionFactory.close();
	}
}