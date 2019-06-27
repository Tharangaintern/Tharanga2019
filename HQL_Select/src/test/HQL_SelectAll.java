package test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.EmployeeDetails;

public class HQL_SelectAll {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
		String hql="from employeedemo";
		
		Query q=s.createQuery(hql);
		List<EmployeeDetails> lists=q.list();
		 for(EmployeeDetails emp:lists){
			 
			 System.out.println("id:"+emp.getId());
			 System.out.println("name:"+emp.getName());
			 System.out.println("email:"+emp.getEmail());
			 System.out.println("salary:"+emp.getSalary());
			 
		 }
		
		t.commit();
		s.close();
		sf.close();

	}
}
