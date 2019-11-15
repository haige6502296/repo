/*
Usage:
Author:Amaru
Time:2019-11-15 21:02:03
Detail:The this() constructor call can be used to invoke the current class constructor. It is used to reuse the constructor. In other words, it is used for constructor chaining.
Calling default constructor from parameterized constructor:
*/

package com.this_;

class This4 {
  private This4() {System.out.println("Hello b");}

  private This4(int x) {
  this();//调用了上面无参的构造函数
    System.out.println(x);
  }

  public static void main(String[] args) {
    This4 this4 = new This4(10);
  }
}
