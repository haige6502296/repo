package com.lct;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.TypedQuery;
import java.util.List;

public class MainSelect {
  public static void main(String[] args) {
    Configuration cfg = new Configuration();
    cfg.configure("hibernate.cfg.xml");
    SessionFactory sessionFactory = cfg.buildSessionFactory();
    Session session = sessionFactory.openSession();

    TypedQuery query=session.getNamedQuery("findEmployeeByLastName");
    query.setParameter("byLastName", "Adanth");
    List list=query.getResultList();
    for(Object o:list){
      Employee e=(Employee)o;
      System.out.println(e);

    }
    System.out.println("查询成功！");
    session.close();
  }
}
