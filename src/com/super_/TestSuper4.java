/*
Usage:
Author:Amaru
Time:2019-11-16 22:56:43
Detail:
*/

package com.super_;

class Animal4{
  Animal4(){System.out.println("animal is created");}
}
class Dog4 extends Animal4{
  Dog4(){
    //super();//super keyword where super() is provided by the compiler implicitly.
    System.out.println("dog is created");
  }
}

class TestSuper4 {
  public static void main(String[] args) {
   new Dog4();
  }
}
