/*
Usage:Another real scenario of abstract class
Author:Amaru
Time:2019-11-18 19:02:59
Detail:The abstract class can also be used to provide some implementation of the interface. In such case, the end user may not be forced to override all the methods of the interface.
*/

package com.abstract_;
interface A_{
  default void  paint(){
    System.out.println("paint method i.e default method in interface since java 8");//Since Java 8, we can have method body in interface. But we need to make it default method. Let's see an example:
  }
  void a_();
  void b_();
  void c_();
  void d_();
}
abstract class B_ implements A_{
public void a_(){
    System.out.println("I'm a_");
  }
}
class M_ extends B_{

  @Override
  public void b_() {
    System.out.println("I'm b_");
  }

  @Override
  public void c_() {
    System.out.println("I'm c_");
  }

  @Override
  public void d_() {
    System.out.println("I'm d_");
  }
}
class Abstract3 {
  public static void main(String[] args) {
    A_ a=new M_();
    a.paint();
    a.a_();
    a.b_();
    a.c_();
    a.d_();
  }
}
