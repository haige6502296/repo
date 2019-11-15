/*
Usage:static method
Author:Amaru
Time:2019-11-15 20:13:05
Detail:If you apply static keyword with any method, it is known as static method.
           A static method belongs to the class rather than the object of a class.
           A static method can be invoked without the need for creating an instance of a class.
           A static method can access static data member and can change the value of it.
*/

package com.static_;

public class StaticMethod {
private int num;
private String name;
private static String college="ITS";
//constructor initialize the variable
private StaticMethod(int num, String name){
    this.num=num;
    this.name=name;
  }
  private static void change(){
    college="BBDIT";
  }
  private void display(){
    System.out.println(num+" "+name+" "+college);
  }

  public static void main(String[] args) {

  //college未调用之前
  System.out.println(college);

  //用静态的方法（方法调用只能用静态的调用）调用静态的变量
    StaticMethod.change();
    StaticMethod sm1=new StaticMethod(100, "Jerry");
    StaticMethod sm2=new StaticMethod(101, "Henry");
    StaticMethod sm3=new StaticMethod(102, "Karo");
    sm1.display();
    sm2.display();
    sm3.display();
  }
}
