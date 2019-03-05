package com.lct;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import javax.persistence.TypedQuery;
import java.util.List;



public class MainAPP {
  public static void main(String[] args) {
    Configuration cfg = new Configuration();
    cfg.configure("hibernate.cfg.xml");
    SessionFactory sessionFactory = cfg.buildSessionFactory();
    Session session = sessionFactory.openSession();
    //Hibernate Named Query
    TypedQuery query = session.getNamedQuery("findEmployeeByName");
    query.setParameter("name", "amau");

    List<Employee> employees = query.getResultList();
    for (Employee e : employees) {
      System.out.println(e);
    }

    TypedQuery q=session.createQuery("from Employee e where  e.id=2");
    List<Employee>em=q.getResultList();
    for (Employee x:em){
      System.out.println(x);
    }
    session.close();
  }
}
