package com.lct;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="emp500")//新取一个名称,会报错,但可以正常编译,会将数据录入新表格选择对应的数据库表报错消失,
public class Employee {
  @Id
  private int id;
  private String name;
  private float salary;

  public Employee() {
  }

  public Employee(int id, String name, float salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public float getSalary() {
    return salary;
  }

  public void setSalary(float salary) {
    this.salary = salary;
  }
}
