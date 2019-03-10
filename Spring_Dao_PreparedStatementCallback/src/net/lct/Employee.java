package net.lct;

public class Employee {
  private int id;
  private String name;
  private  float salary;
  Employee(){}
  Employee (int id,String name,float salary){
    super();
    this.id=id;
    this.name=name;
    this.salary=salary;
  }
  int getId(){
    return id;
  }
  void setId(int id){
    this.id=id;
  }
  String getName(){
    return name;
  }
  void setName(String name){
    this.name=name;
  }
  float getSalary(){
    return salary;
  }
  void setSalary(float salary){
    this.salary=salary;
  }
}
