/*
Use:Handing Exception
Author:Amaru
Time:2019-11-24 17:27:22
Detail:
*/

package com.Exception;

class ExceptionTest {
  public static void main(String[] args) {
    try {
      String s="a";
//      int data=100/0;
      System.out.println(Integer.parseInt(s));//NumberFormatException
    } catch (ArithmeticException | NumberFormatException e) {
      System.out.println(e);
    }
    //rest code of the program
   finally {
      System.out.println("other code……");
    }
  }
}
