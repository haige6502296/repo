package com.lct;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;


public class MainApp {
  public static void main(String[] args) {
    Configuration cfg=new Configuration();
    cfg.configure("hibernate.cfg.xml");
    SessionFactory factory;
    Session session=null;
    Transaction t=null;

    ArrayList<String> arrayList1=new ArrayList<>();
    arrayList1.add("Java is a programming language");
    arrayList1.add("Java is a platform");

    ArrayList<String> arrayList2=new ArrayList<>();
    arrayList2.add("Servlet is an Interface");
    arrayList2.add("Servlet is an API");

    Question question1=new Question();
    question1.setQname("What is Java?");
    question1.setAnswers(arrayList1);

    Question question2=new Question();
    question2.setQname("What is Servlet?");
    question2.setAnswers(arrayList2);

    try {
      factory=cfg.buildSessionFactory();
      session=factory.openSession();
      t=session.beginTransaction();

      session.persist(question1);
      session.persist(question2);

      t.commit();
      System.out.println("数据更新成功！");
    } catch (HibernateException e) {
      if (t != null) {
        t.rollback();
        System.out.println("数据更新失败！");
      }
    } finally {
      if (session != null) {
        session.close();
      }
    }
  }
}
