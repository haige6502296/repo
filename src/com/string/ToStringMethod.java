/*
Use:
Author:Amaru
Time:2019-11-23 20:43:29
Detail:
*/

package com.string;

class ToStringMethod {
  int rollno;
  String name;
  String city;

  private ToStringMethod(int rollno, String name, String city){
    this.rollno=rollno;
    this.name=name;
    this.city=city;
  }
/*@Override
  public String toString(){//重写Object的toString()方法后，打印对象就会打印出重写后的结果
    return rollno+" ,"+name+" ,"+city;
  }*/


  public static void main(String[] args) {
    ToStringMethod toStringMethod=new ToStringMethod(10, "Jack", "Tokyo");
    ToStringMethod toStringMethod1=new ToStringMethod(20, "Lihua", "Beijing");

    System.out.println(toStringMethod);//默认调用Object的toString(),打印出哈希值
    System.out.println(toStringMethod1);//默认调用Object的toString(),打印出哈希值

  }
}
