package com.lct;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MainApp {
  public static void main(String[] args) {
    ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");

    EmployeeDao edao = (EmployeeDao) ac.getBean("edao");
    List<Employee> list = edao.getAllEmployeesRowMapper();
    for (Employee e : list)
      System.out.println(e);

     /*  EmployeeDaoExtractor edaoextractor=(EmployeeDaoExtractor) ac.getBean("edaoextractor");
    List<Employee> list1 = edaoextractor.getAllEmployees();
    for (Employee e:list1){
      System.out.println(e);
    }*/
  }
}
