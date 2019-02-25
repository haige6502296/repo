package com.lct;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {
  public static void main(String[] args) {
    ApplicationContext ac=new ClassPathXmlApplicationContext("spring-config.xml");
    EmployeeDao edao=(EmployeeDao)ac.getBean("edao");
    EmployeeDao dao=(EmployeeDao)ac.getBean("edao");
    dao.saveData(new Employee(108,"Amit",35000));
  }
}
