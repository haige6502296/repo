/*
Usage:Real usage of this() constructor call
Author:Amaru
Time:2019-11-15 21:21:30
Detail:The this() constructor call should be used to reuse the constructor from the constructor. It maintains the chain between the constructors i.e. it is used for constructor chaining. Let's see the example given below that displays the actual use of this keyword.
*/

package com.this_;

public class This2 {
  private int num;
  private String name, course;
  private float fee;

  private This2(int num, String name, String course) {
    this.num = num;
    this.name = name;
    this.course = course;
  }

  private This2(int num, String name, String course, float fee) {

    //Call to this() must be the first statement in constructor.
    this(num, name, course);
    this.fee = fee;
  }

  private void display() {
    System.out.println("编号：" + num + "       姓名：" + name + "       课程：" + course + "       费用：" + fee);
  }

  public static void main(String[] args) {
    This2 t1 = new This2(100, "Jow", "Java");
    This2 t2 = new This2(101, "Washington", "Python", 6000);

    t1.display();
    t2.display();
  }
}
