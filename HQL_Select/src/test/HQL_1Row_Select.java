package test;

import java.io.Closeable;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.EmployeeDetails;

public class HQL_1Row_Select {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
		String hql="from employeedemo where id=999";
		
		Query q=s.createQuery(hql);
		EmployeeDetails emp=(EmployeeDetails)q.uniqueResult();
		
		System.out.println(emp.getId());
		System.out.println(emp.getEmail());
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
		
		t.commit();
		s.close();
		sf.close();

		
	}
}
