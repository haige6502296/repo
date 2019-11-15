/*
Usage: this keyword can be used to return current class instance
Author:Amaru
Time:2019-11-15 22:17:57
Detail:We can return this keyword as an statement from the method. In such case, return type of the method must be the class type (non-primitive). Let's see the example:
*/


//Example of this keyword that you return as a statement from the method
package com.this_;

class This_7 {
  This_7 getThis_7() {
    return this;
  }
  void msg() {
    System.out.println("Hello java");
  }
}

 class This7 {
  public static void main(String[] args) {

    new This_7().getThis_7().msg();
  }
}
