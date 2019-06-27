package test;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HqlUpdate {
	public static void main(String[] args){
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		String hql="update students set name='ddd',email='ddd@gamil.com' where id=111";
		
		Query q=s.createQuery(hql);
		int i=q.executeUpdate();
		t.commit();
		s.close();
		sf.close();
		System.out.println(i);
		
		System.out.println("update success");
		
		
}
}
