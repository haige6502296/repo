/*polymorphism
Usage:
Author:Amaru
Time:2019-11-17 19:03:39
Detail:
*/

package com.polymorphism;

class Animal1{
  void eating(){
    System.out.println("Animal must eat food");
  }
}
class Dog1 extends Animal1{
  void eating(){
    System.out.println("Dog likes eating bones");
  }
}
class Baby_dog extends Dog1{
 /* void eating (){                                                        //baby dog has no its own eating()method,so,a3.eating() will call Dog1's eating() method.
    System.out.println("baby dog drinks milk");
  }*/
}
class Polymorphism2 {
  public static void main(String[] args) {
    Animal1 a1,a2,a3;
    a1=new Animal1();
    a2=new Dog1();

    a3=new Baby_dog();
    a1.eating();
    a2.eating();
    a3.eating();
  }
}
