/*
Usage:
Author:Amaru
Time:2019-11-15 22:49:56
Detail:
*/

package com.inheritance;

class P_inheritanc1{
   float salary=40000;
}

public class Inheritance1 extends P_inheritanc1 {
private float bonus=30000;

private void sum(){
  float sum=this.salary+this.bonus;
  System.out.println("工资总额为："+sum);
}
  public static void main(String[] args) {
    Inheritance1 inheritance1=new Inheritance1();
    System.out.println(inheritance1.salary);
    System.out.println(inheritance1.bonus);
    inheritance1.sum();
  }
}
