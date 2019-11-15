/*
Usage:Calling parameterized constructor from default constructor:
Author:Amaru
Time:2019-11-15 21:15:11
Detail:
*/

package com.this_;

public class This1 {
  private This1() {
    this(5);
    System.out.println("Hello,a");
  }

  private This1(int x) {
    System.out.println(x);
  }

  public static void main(String[] args) {
    This1 a = new This1();
  }
}