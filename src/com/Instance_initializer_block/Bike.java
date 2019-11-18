/*
Usage:Example of instance initializer block
Author:Amaru
Time:2019-11-16 23:44:21
Detail:Let's see the simple example of instance initializer block that performs initialization.
*/

package com.Instance_initializer_block;

class Bike {
private int speed;

  private Bike() {
    System.out.println("speed is: "+speed);
  }
  {speed=100;}

  public static void main(String[] args) {
    new Bike();
    new Bike();
  }
}
