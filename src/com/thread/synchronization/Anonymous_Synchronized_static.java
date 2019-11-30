/*
Use:Anonymous_Synchronized_static
Author:Amaru
Time:2019-11-29 20:44:59
Detail:
*/

package com.thread.synchronization;

class Commonatlity_{
  synchronized static void printNumber(int n) {
    for (int i = 1; i < 5; i++) {
      System.out.println(Thread.currentThread().getName() + "执行打印........................" + n * i);
      if (i == 4) {
        System.out.println(Thread.currentThread().getName() + "执行打印........................" + n * i);
        System.out.println(Thread.currentThread().getName() + "执行完毕！");
      }
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

class Anonymous_Synchronized_static {
  public static void main(String[] args) {
    Thread t1=new Thread(()->Commonatlity_.printNumber(10));
    Thread t2=new Thread(()->Commonatlity_.printNumber(20));
    Thread t3=new Thread(()->Commonatlity_.printNumber(30));
    Thread t4=new Thread(()->Commonatlity_.printNumber(40));

    t1.setName("线程A");
    t2.setName("线程B");
    t3.setName("线程C");
    t4.setName("线程D");

    t1.start();
    t2.start();
    t3.start();
    t4.start();
  }
}
