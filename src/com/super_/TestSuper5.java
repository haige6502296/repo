/*
Usage:super example: real use
Author:Amaru
Time:2019-11-16 23:02:30
Detail:Let's see the real use of super keyword. Here, Emp class inherits Person class so all the properties of Person will be inherited to Emp by default. To initialize all the property, we are using parent class constructor from child class. In such way, we are reusing the parent class constructor.
*/

package com.super_;

class Person {
  String gender;//不能用private修饰，否则子类无法访问
  String name;//不能用private修饰，否则子类无法访问

  Person(String gender, String name) {
    this.gender = gender;
    this.name = name;
  }
}

class Emp extends Person {
  private int num;
  private float salary;

  Emp(int num, String gender, String name, float salary) {
    super(gender, name);//reusing parent constructor
    this.num = num;
    this.salary = salary;
  }

  void information() {
    System.out.println("工号：" + num + ",性别：" + gender + ",姓名：" + name + ",工资：" + salary);
  }
}

class TestSuper5 {
  public static void main(String[] args) {
    Emp emp = new Emp(101, "male", "amaru", 45999);
    emp.information();
  }
}
