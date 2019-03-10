package com.lct;

import java.util.Objects;

public class Employee {

  private int id;
  private String name;
  private Double salary;

  public Employee(){}
 Employee(String name,Double salary){
    this.name=name;
    this.salary=salary;
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

  public Double getSalary() {
    return salary;
  }

  public void setSalary(Double salary) {
    this.salary = salary;
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
