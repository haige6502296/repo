/*
Use:Java Local inner class
Author:Amaru
Time:2019-11-25 21:29:01
Detail:A class i.e. created inside a method is called local inner class in java. If you want to invoke the methods of local inner class, you must instantiate this class inside the method.
*/

package com.innerClass;

class LocalInnerClass {
  double data = 30d;

  void detail() {
    System.out.println("detail()方法内部：");
    class Inner {
      private void msg() {
        System.out.println("本地内部类的msg()方法内部：");
        float data = 25;
        System.out.println(LocalInnerClass.class);
        System.out.println(LocalInnerClass.this);
        System.out.println();
        System.out.println("外部类的实例变量double data:" + new LocalInnerClass().data);
        System.out.println("本地内部类的局部变量float data:" + data);
        System.out.println("本地内部类的实例变量int data:" + this.data);
      }

      private int data = 68;//本地内部类的实例变量；
    }
    Inner inner = new Inner();
    inner.msg();
  }

  public static void main(String[] args) {
    LocalInnerClass localInnerClass = new LocalInnerClass();
    System.out.println("主类的detail()方法：");
    localInnerClass.detail();
    System.out.println();
    System.out.println("所有非main()方法调用完毕。");
  }
}
