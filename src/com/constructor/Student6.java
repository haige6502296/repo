/*
Usage:constructor
Author:Amaru
Time:2019-11-14 23:10:43
Detail:overloading,copy
*/

package com.constructor;

public class Student6 {
  int id;
  String name;

  Student6(int id, String name) {
    this.id = id;
    this.name = name;
  }

  //constructor to initialize another object
  Student6(Student6 s) {
    id = s.id;
    name = s.name;
  }
  void display(){System.out.println(id+" "+name);}
  public static void main(String[] args) {
Student6 student6=new Student6(103,"Arin");
Student6 student61=new Student6(student6);
student6.display();
student61.display();
  }
}
