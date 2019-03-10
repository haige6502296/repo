package com.lct;


import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.persistence.TypedQuery;

import java.util.List;


public class MainApp2 {
  public static void main(String[] args) {
    Configuration cfg = new Configuration();
    cfg.configure("hibernate.cfg.xml");
    SessionFactory factory = cfg.buildSessionFactory();
    Session session = factory.openSession();
    Transaction transaction=session.beginTransaction();
    TypedQuery tquery = session.createQuery("from Question");
    List list = tquery.getResultList();
    for (Object o : list) {
      Question q = (Question) o;
      System.out.println("Question Name: " + q.getQname());

      //printing answers
      List<String> list2 = q.getAnswers();
      for (String s : list2) {
        System.out.println(s);
      }
    }
    transaction.commit();
    session.close();
  }
}