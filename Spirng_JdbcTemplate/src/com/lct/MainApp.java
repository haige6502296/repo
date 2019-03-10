package com.lct;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
  public static void main(String[] args) {
    ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
    Dao dao = ac.getBean("dao", Dao.class);
    System.out.println();
    System.out.println("执行数据库操作:");
    System.out.println();

 //调用方法

//  插入:
    try {
      int status = dao.insertData(new Employee(1, "amau", 180000));
      System.out.println(status + "插入成功!");
    } catch (Exception e) {
      System.out.println("插入失败,id值重复!");
    }

//  修改:
    Employee employee = new Employee();
    employee.setId(2);
    dao.updateData(employee);
    System.out.println("修改成功!");


//  删除:
    Employee e = new Employee();
    e.setId(108);
    dao.deleteData(e);
    System.out.println("删除成功!");

  }
}
