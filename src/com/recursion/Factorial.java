/*
Use:
Author:Amaru
Time:2019-11-20 20:41:50
Detail:
*/

package com.recursion;

class Factorial {
  int factorialMethod(int n) {
    if (n == 1)
      return 1;
    else
      return (n * factorialMethod(n - 1));
  }
}
class FactorialTest {
  public static void main(String[] args) {
    Factorial factorial=new Factorial();
    int n=factorial.factorialMethod(4);
    System.out.println(n);
  }
}

