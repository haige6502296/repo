/*
Usage:
Author:Amaru
Time:2019-11-17 02:47:11
Detail:
*/

package com.polymorphism;

class Person1{
  void eat(){
    System.out.println("吃东西");
  }
  void drink(){
    System.out.println("喝……");
  }
}

class Zhangsan extends Person1{
  void eat(){
    System.out.println("吃鸡腿");
  }
  void drink(){
    System.out.println("喝牛奶");
  }
  void gotoSchool(){
    System.out.println("上学");
  }
}

class Lifang extends Person1{
  void eat(){
      System.out.println("吃海鲜");
  }
  void drink(){
    System.out.println("喝可乐");
  }
}

class Polymorphism {
  public static void main(String[] args) {
    Person1 p1;
    p1=new Zhangsan();
    p1.eat();
    p1.drink();
   // p1.gotoschool();错误，不能直接调用子类的方法，必须通过方法的重写
    System.out.println();
    p1=new Lifang();
    p1.eat();
    p1.drink();
  }
}
