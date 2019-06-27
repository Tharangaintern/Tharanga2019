package test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HQL_2Coulmn_select {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session s=sf.openSession();
	Transaction t=s.beginTransaction();
	
	String hql="Select name,email from employeedemo";
	
	Query q=s.createQuery(hql);
	List<Object> lists=q.list();
	 for(Object names:lists){
		 
		 Object o[]=(Object[])names;
		 System.out.println(o[0]);
		 System.out.println(o[1]);
		 
	 }
	
	t.commit();
	s.close();
	sf.close();

}
}
