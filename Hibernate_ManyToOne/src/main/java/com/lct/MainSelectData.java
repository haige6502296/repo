package com.lct;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.TypedQuery;
import java.util.List;

public class MainSelectData {
  public static void main(String[] args) {
    Configuration cfg=new Configuration();
    cfg.configure("hibernate.cfg.xml");
    SessionFactory factory=cfg.buildSessionFactory();
    Session session=factory.openSession();
    TypedQuery query=session.createQuery("from Employee e");

    List listO=query.getResultList();
    for (Object o : listO) {
      Employee emp=(Employee)o;//将将普通对象转换为Employee对象，因为事先知道该普通对象其实就是Employee对象，可以直接List<Employee> list=query.getResultList，就不需要这一步转换，那样IDE会报警。
      System.out.println(emp.getEid() + " " + emp.getName() + " " + emp.getEmail());
      Address address = emp.getAddress();
      System.out.println(address.getAddressLine() + " " + address.getCity() + " " +
              address.getStatus() + " " + address.getCountry() + " " + address.getPincode());
    }
    session.close();
    System.out.println("查询成功！");
  }
}
