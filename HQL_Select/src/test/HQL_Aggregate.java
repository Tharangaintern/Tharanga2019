package test;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HQL_Aggregate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
		String hql="Select avg(salary) from employeedemo";

		Query q=s.createQuery(hql);
		double avg=(Double)q.uniqueResult();
		System.out.println("avg salary"+avg);
		
		t.commit();
		s.close();
		sf.close();

		
	}

}
