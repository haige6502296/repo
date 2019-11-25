/*
Use:
Author:Amaru
Time:2019-11-24 19:41:54
Detail:
*/

package com.Exception;

class NestedException {
  public static void main(String args[]) {

    try {
      System.out.println("going to divide");
      int b = 39 / 0;
    } catch (ArithmeticException e) {System.out.println(e);}

    try {
      int a[] = new int[5];
      a[5] = 4;
    } catch (ArrayIndexOutOfBoundsException e) {System.out.println(e);}

    System.out.println("other statement");
  }
}
