/*
Use:Anonymous inner class
Author:Amaru
Time:2019-11-25 21:17:38
Detail:Person p = new Person() {
      @Override
      void eat() {
        System.out.println("very delicious");
      }
    };
    p.eat();
*/

package com.innerClass;

abstract class Person {
  abstract void eat();
}

abstract class AnonymousClass {
  public static void main(String[] args) {
    Person p = new Person() {
      @Override
      void eat() {
        System.out.println("very delicious");
      }
    };
    p.eat();
  }
}
