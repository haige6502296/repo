/*
*Usage:Static binding
*Author:Amaru
*Time:2019-11-17 19:26:22
*Detail:The compiler know the type of bottle
            When type of the object is determined at compiled time(by the compiler), it is known as static binding.
             If there is any private, final or static method in a class, there is static binding.
*/

package com.polymorphism.bind;

class Bottle {
private void showColor(){
  System.out.println("It's blue.");
}

  public static void main(String[] args) {
    Bottle bottle=new Bottle();
    bottle.showColor();
  }
}
