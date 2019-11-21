/*
Use:sum of 1->n
Author:Amaru
Time:2019-11-20 20:58:45
Detail:
*/

package com.recursion;

class Recursion {

  //方法一：
  /*  private static int recursionMethod(int n){
    if(n==0)
      return  0;
    else
      return (n+recursionMethod(n-1));
  }
  public static void main(String[] args) {
    System.out.println(recursionMethod(36));
  }*/
  //方法二：
  private static int recursionMethod(int n) {
    if (n % 2 == 0) {
      return (n + 1) * n / 2;
    } else if (n % 2 == 1) {
      return (((int) (n / 2)) * (n + 1)) + (((int) (n / 2)) + 1);
    } else return 0;
  }
  public static void main(String[] args) {
    System.out.println(recursionMethod(36));
  }
}