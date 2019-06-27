package test;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.StudentDemo;

public class ClientDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Configuration cfg=new Configuration();
cfg.configure("hibernate.cfg.xml");
SessionFactory sf=cfg.buildSessionFactory();
 Session s=sf.openSession();
 Transaction t=s.beginTransaction();
 
 String hql="delete studentdemo where id=666";
 
Query q= s.createQuery(hql);
int i=q.executeUpdate();
t.commit();
s.close();
sf.close();

System.out.println(i);
 
 /*Transaction t=s.beginTransaction();
 
 StudentDemo sd=new StudentDemo(666,"ffff","fff@gmail.com");
 
     int i=(int)s.save(sd);
     t.commit();
     s.close();
     sf.close();
     
     System.out.println(i);*/

	}

}
