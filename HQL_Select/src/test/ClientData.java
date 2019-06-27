package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.EmployeeDetails;

public class ClientData {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure();
	SessionFactory sf=cfg.buildSessionFactory();
	Session s=sf.openSession();
	Transaction t=s.beginTransaction();
	
	EmployeeDetails ed=new EmployeeDetails(999,"kavitha","k@gmail.com",1000);
	EmployeeDetails ed1=new EmployeeDetails(111,"swathi","k@gmail.com",1000);
	EmployeeDetails ed2=new EmployeeDetails(222,"prem","k@gmail.com",1000);
	EmployeeDetails ed3=new EmployeeDetails(333,"keerthi","k@gmail.com",1000);
	
	s.save(ed);
	s.save(ed1);
	s.save(ed2);
	s.save(ed3);
	t.commit();
	s.close();
	sf.close();
	System.out.println("success");
}
}
