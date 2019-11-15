/*
Usage:Program of counter by static variable
Author:Amaru
Time:2019-11-14 23:42:32
Detail:As we have mentioned above, static variable will get the memory only once, if any object changes the value of the static variable, it will retain its value.
*/

package com.lct;

public class StaticTest2 {
  private static int count = 0;

  private  StaticTest2() {
    count++;
    System.out.println(count);
  }

  public static void main(String[] args) {
    new StaticTest2();
    new StaticTest2();
    new StaticTest2();
  }
}