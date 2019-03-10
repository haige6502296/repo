package com.lct;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
  public static void main(String[] args) {
    ApplicationContext ac=new ClassPathXmlApplicationContext("spring-config.xml");
    Dao dao=ac.getBean("dao",Dao.class);
    dao.insertData(new Employee(23, "Sonoo", 50000));
  }
}
