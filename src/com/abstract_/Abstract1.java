/*
Usage:abstract
Author:Amaru
Time:2019-11-17 23:03:10
Detail:override abstract method must be override
*/

package com.abstract_;

class Child_Abstract1 extends Abstract1 {
  @Override
  void show() {
    System.out.println("调用重写父类的抽象方法");
  }
}

abstract class Abstract1 {
  private void eating() {
    System.out.println("call no-abstract method of abstract class:调用抽象类的非抽象方法！ ");
  }
  abstract void show();

  public static void main(String[] args) {
    Abstract1 abstract1 = new Child_Abstract1();
    abstract1.eating();
    abstract1.show();
  }
}
