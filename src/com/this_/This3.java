/*
Usage:this: to pass as an argument in the method
Author:Amaru
Time:2019-11-15 21:41:46
Detail:The this keyword can also be passed as an argument in the method. It is mainly used in the event handling. Let's see the example:
*/

package com.this_;

class This3 {
  private void show(This3 t3) {
    System.out.println("show() method is invoked");
  }

  void show2() {
    show(this);
  }

  public static void main(String[] args) {
    This3 t_3=new This3();
    t_3.show2();
  }
}
