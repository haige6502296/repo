package com.lct;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainApp2 {
  private static SessionFactory factory;

  public static void main(String[] args) {
    try {
      factory = new Configuration().configure().buildSessionFactory();
    } catch (Throwable ex) {
      System.err.println("Failed to create sessionFactory object." + ex);
      throw new ExceptionInInitializerError(ex);
    }
    MainApp2 m2 = new MainApp2();

    /* Add few employee records in database */
    Integer empID1 = m2.addEmployee(100, "Ali", 1000);
    Integer empID2 = m2.addEmployee(101, "Das", 5000);
    Integer empID3 = m2.addEmployee(102, "Paul", 10000);

    /* List down all the employees */
    m2.listEmployees();

    /* Update employee's records */
    m2.updateEmployee(empID1, 5000);

    /* Delete an employee from the database */
    m2.deleteEmployee(empID2);

    /* List down new list of the employees */
    m2.listEmployees();

  }

  /* Method to CREATE an employee in the database */
  private Integer addEmployee(int id, String name, float salary) {
    Session session = factory.openSession();
    Transaction tx = null;
    Integer employeeID = null;
    try {
      tx = session.beginTransaction();
      Employee employee = new Employee(id, name, salary);
      employeeID = (Integer) session.save(employee);
      tx.commit();
    } catch (HibernateException e) {
      if (tx != null) tx.rollback();
      e.printStackTrace();
    } finally {
      session.close();
    }
    return employeeID;
  }

  /* Method to  READ all the employees */
  private void listEmployees() {
    Session session = factory.openSession();
    Transaction tx = null;
    try {
      tx = session.beginTransaction();
      List employees = session.createQuery("FROM  Employee").list();
      System.out.println("ID----\t" +"Name-\t"+"Salary--\t");
      for (Object employee1 : employees) {
        Employee employee = (Employee) employee1;
        System.out.println( employee.getId()+"||"+ employee.getName()+"||"+employee.getSalary());

      }
      tx.commit();
    } catch (HibernateException e) {
      if (tx != null) tx.rollback();
      e.printStackTrace();
    } finally {
      session.close();
    }
  }

  /* Method to UPDATE salary for an employee */
  public void updateEmployee(Integer EmployeeID, float salary) {
    Session session = factory.openSession();
    Transaction tx = null;
    try {
      tx = session.beginTransaction();
      Employee employee = session.get(Employee.class, EmployeeID);
      employee.setSalary(salary);
      session.update(employee);
      tx.commit();
    } catch (HibernateException e) {
      if (tx != null) tx.rollback();
      e.printStackTrace();
    } finally {
      session.close();
    }
  }

  /* Method to DELETE an employee from the records */
  public void deleteEmployee(Integer EmployeeID) {
    Session session = factory.openSession();
    Transaction tx = null;
    try {
      tx = session.beginTransaction();
      Employee employee = session.get(Employee.class, EmployeeID);
      session.delete(employee);
      tx.commit();
    } catch (HibernateException e) {
      if (tx != null) tx.rollback();
      e.printStackTrace();
    } finally {
      session.close();
    }
  }
}