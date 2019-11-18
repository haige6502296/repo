/*super keywords
Usage:
Author:Amaru
Time:2019-11-16 21:56:52
Detail:super used to invoke parent class instance variable
*/

package com.super_;

class Animal {
  String color="white";
}
class Dog extends Animal{
  void showColor(){
    String color = "black";
    System.out.println(color);
    System.out.println(super.color);;
  }
}

class TestSuper1 {
  public static void main(String[] args) {
    Dog dog=new Dog();
    dog.showColor();
  }
}
