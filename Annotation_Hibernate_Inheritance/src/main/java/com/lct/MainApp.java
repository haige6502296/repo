package com.lct;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class MainApp{

    public static void main(String[] args)
    {


        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory fct=cfg.buildSessionFactory();
        Session ss=fct.openSession();
        Transaction tran=ss.beginTransaction();


        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

        SessionFactory factory=meta.getSessionFactoryBuilder().build();
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