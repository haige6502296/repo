/*
Usage:super is used to invoke parent class constructor.
Author:Amaru
Time:2019-11-16 22:20:55
Detail:The super keyword can also be used to invoke the parent class constructor. Let's see a simple example:
Note: super() is added in each class constructor automatically by compiler if there is no super() or this().
*/

package com.super_;
class Animal3{
  Animal3(){
    System.out.println("animal is created!");
  }
}
class Dog3 extends  Animal3{
  Dog3(){
    super();
    System.out.println("dog is created!");
  }
}
class TestSuper3 {
  public static void main(String[] args) {
    new Dog3();
  }
}
