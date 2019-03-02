package com.lct;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App {
    public static void main(String[] args) {
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();

        Transaction t=session.beginTransaction();

        Stuff s=new Stuff();
        s.setName("Gaurav Chawla");

        Regular_Stuff rs=new Regular_Stuff();
        rs.setName("Vivek Kumar");
        rs.setSalary(50000);
        rs.setBonus(5);

        Contract_Stuff cs=new Contract_Stuff();
        cs.setName("Arjun Kumar");
        cs.setPay_per_hour(1000);
        cs.setContract_duration("15 hours");

        session.persist(s);
        session.persist(rs);
        session.persist(cs);

        t.commit();
        session.close();
        System.out.println("success");
    }
}