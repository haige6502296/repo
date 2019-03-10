package com.lct;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
  public static void main(String[] args) {
    ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
    EmployeeDao dao = (EmployeeDao) ac.getBean("dao");
    Employee e = new Employee();
    e.setId(1);
    e.setName("varun");
    e.setSalary(50000);
    dao.updateEmployee(e);
    System.out.println("数据更新成功！");
  }
}
