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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Employee employee = (Employee) o;
    return id == employee.id &&
            Objects.equals(name, employee.name) &&
            Objects.equals(salary, employee.salary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, salary);
  }
}
