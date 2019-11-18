/*
Usage:Real scenario of abstract class
Author:Amaru
Time:2019-11-18 18:46:31
Detail:Mostly, we don't know about the implementation class (which is hidden to the end user), and an object of the implementation class is provided by the factory method.
Rule: If there is an abstract method in a class, that class must be abstract.
*/

package com.abstract_;
abstract class Shape{
  abstract void draw();
}
class Rectangle extends Shape{
  @Override
  void draw(){
    System.out.println("Draw a rectangle!");
  }
}
class Circle extends Shape{

  @Override
  void draw() {
    System.out.println("Draw a circle!");
  }
}
class Abstract2 {
  public static void main(String[] args) {
    Shape shape=new Circle();//In a real scenario, object is provided through method, e.g., getShape() method
    shape.draw();
  }
}
