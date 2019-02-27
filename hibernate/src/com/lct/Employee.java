package com.lct;

import java.util.Objects;

public class Employee {

  private int id;
  private String name;
  private float salary;

  public int getId() {
    return id;
  }

  public Employee setId(int id) {
    this.id = id;
    return this;
  }

  public String getName() {
    return name;
  }

  public Employee setName(String name) {
    this.name = name;
    return this;
  }

  public float getSalary() {
    return salary;
  }

  public Employee setSalary(float salary) {
    this.salary = salary;
    return this;
  }
}
