package test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import beans.EmployeeDetails;

public class HQL_1column_Select {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
		String hql="Select name from employeedemo";
		
		Query q=s.createQuery(hql);
		List<String> lists=q.list();
		 for(String names:lists){
			 System.out.println(names);
		 }
		
		t.commit();
		s.close();
		sf.close();

		
	}
}
