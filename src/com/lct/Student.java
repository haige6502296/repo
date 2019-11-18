/*
Usage:
Author:Amaru
Time:2019-11-18 21:45:50
Detail:
*/

package com.lct;

//定义了一个Student类，并没有创建内存空间，因为对象还没有
public class Student {
  private int rolando;
  private String name;

public void insertRecord(int r, String n) {
    rolando = r;
    name = n;
  }

 public void displayInformation() {System.out.println(rolando + " " + name);}
}
