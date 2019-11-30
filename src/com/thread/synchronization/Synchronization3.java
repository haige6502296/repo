/*
Use:Anonymous
Author:Amaru
Time:2019-11-28 23:48:01
Detail:
*/

package com.thread.synchronization;

class Number_ {
  synchronized void printNum(int n) {
    for (int i = 2; i < 7; i++) {
      System.out.println(Thread.currentThread().getName() + ".................. :      " + (n * i));
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        System.out.println("Interrupted");
      }
    }
  }
}
class Synchronization3 {
  public static void main(String[] args) {
    Number_ num = new Number_();
    Thread t1 = new Thread(() -> num.printNum(7));//Anonymous class
    Thread t2 = new Thread(() -> num.printNum(20));//Anonymous class

    t1.setName("线程A");
    t2.setName("线程B");
    t1.start();
    t2.start();
  }
}
