/*
Usage:super can be used to invoke parent class method
Author:Amaru
Time:2019-11-16 22:08:06
Detail:The super keyword can also be used to invoke parent class method. It should be used if subclass contains the same method as parent class. In other words, it is used if method is overridden.
*/

package com.super_;
class Animal2{
  void  eating(){
    System.out.println("eating...!");
  }
}
class Dog2 extends Animal2{
  void eating(){
    super.eating();
    System.out.println("I'm eating bread!");
  }
}
class TestSuper2 {
  public static void main(String[] args) {
    Dog2 dog2=new Dog2();
    dog2.eating();
  }
}
