/*
Usage:如何访问嵌套类
Author:Amaru
Time:2019-11-18 22:20:04
Detail:
*/

package com.lct;

class Outer {
  private int x = 10;

  class Inner {
    int x = 8;
    void test() {
      int x = 6;
      System.out.println(x);//test方法内的局部变量x
      System.out.println(this.x);//Inner 的实例变量x
      System.out.println(Outer.this.x);//Outer的实例变量x
    }
  }

  public static void main(String[] args) {
    Outer outer = new Outer();
    Outer.Inner inner = outer.new Inner();
    inner.test();
  }
}


