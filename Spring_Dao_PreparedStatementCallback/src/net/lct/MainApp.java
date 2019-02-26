package net.lct;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
  public static void main(String[] args) {
    ApplicationContext ac=new ClassPathXmlApplicationContext("spring-config.xml");
    EmployeeDao edao=(EmployeeDao)ac.getBean("edao");

    /*调用dao的方法*/
    System.out.println();
    try {
      edao.insertData(new Employee(2,"Bush",35000));
      System.out.println("数据插入成功!");
    } catch (Exception e) {
      System.out.println("数据插入失败,id重复!" );
    }
//数据修改
edao.updateData(new Employee(107,"Marry",7200));
    System.out.println("数据修改成功!");
//数据删除
    Employee e=new Employee();
    e.setId(107);
  }
}
