package com.lct;

import com.lct.Employee;
import org.hibernate.*;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class MainApp {
  public static void main( String[] args )
  {
    StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
    Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
    SessionFactory factory = meta.getSessionFactoryBuilder().build();
    Session session = factory.openSession();
    Transaction t = session.beginTransaction();

    Employee e=new Employee();
    e.setId(3);
    e.setName("Alice");
    e.setSalary(28000);

    session.save(e);
    t.commit();
    System.out.println("successfully saved");
    factory.close();
    session.close();
  }
}

