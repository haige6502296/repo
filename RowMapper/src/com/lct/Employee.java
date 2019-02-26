package com.lct;

public class Employee {
  private int id;
  private String name;
  private float salary;

  Employee() {
  }

  Employee(int id, String name, float salary) {
    super();
    this.id = id;
    this.name = name;
    this.salary = salary;
  }
  /*int getId(){
    return id;
  }
   String getName(){
    return name;
   }
   float getSalary(){
    return salary;
   }*/
   void setId(int id){
    this.id=id;
   }
   void setName(String name){
    this.name=name;
   }
   void setSalary(float salary){
    this.salary=salary;
   }

  public String toString() {
    return id + "|" + name + "|" + salary;
  }
}
