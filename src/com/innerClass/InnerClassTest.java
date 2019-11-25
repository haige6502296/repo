/*
Use:
Author:Amaru
Time:2019-11-25 19:23:25
Detail:
*/

package com.innerClass;

class InnerClassTest {
  private int DATA=30;
  class Inner{
    void displayDATA(){
      System.out.println("DATA:"+DATA);
    }
  }

  public static void main(String[] args) {
    InnerClassTest  obj=new InnerClassTest();
    InnerClassTest.Inner inner=obj.new Inner();
    inner.displayDATA();
  }
}
