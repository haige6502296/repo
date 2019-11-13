package com.lct;


class Employee {
  private int id;
  private String name;
  private float salary;

  void insert(int id, String name, float salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
  }

  void display() {
    System.out.println(id + " " + name + " " + salary);
  }
}

public class TestEmployee {
  public static void main(String[] args) {
    Employee employee1=new Employee();
    Employee employee2=new Employee();
    Employee employee3=new Employee();
    employee1.insert(101, "Tom",25000);
    employee2.insert(102, "Henry", 28000);
    employee3.insert(103, "Jack", 37000);
    employee1.display();
    employee2.display();
    employee3.display();
  }
}
