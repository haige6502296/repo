/*
Usage:this keywords
Author:Amaru
Time:2019-11-15 20:55:01
Detail:You may invoke the method of the current class by using the this keyword. If you don't use the this keyword, compiler automatically adds this keyword while invoking the method. Let's see the example
*/

package com.this_;

class This6 {
  private void m() {System.out.println("hello m");}

  void n() {
    System.out.println("hello n");
//m();//same as this.m()
    this.m();//this is one of the instance of the A class
  }


  public static void main(String[] args) {
    This6 a = new This6();
    a.n();
  }
}
