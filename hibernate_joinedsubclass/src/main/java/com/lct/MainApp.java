package com.lct;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {
  public static void main(String[] args) {
    SessionFactory factory = null;
    Session session = null;
    Transaction t = null;
    Configuration cfg = new Configuration();
    cfg.configure("hibernate.cfg.xml");
    try {
      factory = cfg.buildSessionFactory();
      session = factory.openSession();
      t = session.beginTransaction();

      Member m = new Member();
      Contract_Member cm = new Contract_Member();
      Regular_Member rm = new Regular_Member();
      m.setName("Victoria");

      cm.setName("Amau");
      cm.setPay_per_hour(150);
      cm.setContract_duration("21 days");
      rm.setName("Wuzhiwei");
      rm.setSalary(50000f);
      rm.setBonus(700);

      session.persist(m);
      session.persist(cm);
      session.persist(rm);
     t.commit();
      System.out.println("执行成功！");
    } catch (Exception e) {
      if (t != null) {
        t.rollback();
      }
    }
    finally {
      if (session != null) {
        session.close();
      }
    }
  }
}
