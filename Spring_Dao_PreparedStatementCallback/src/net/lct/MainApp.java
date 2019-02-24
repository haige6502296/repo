package net.lct;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
  public static void main(String[] args) {
    ApplicationContext ac=new ClassPathXmlApplicationContext("spring-config.xml");
    EmployeeDao edao=(EmployeeDao)ac.getBean("edao");

    /*调用dao的方法*/
    edao.saveData(new Employee(100,"Jack",35000));
    System.out.println("数据插入成功" );
  }
}
