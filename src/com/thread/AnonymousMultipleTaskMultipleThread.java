/*
Use:
Author:Amaru
Time:2019-11-28 20:28:37
Detail:
*/

package com.thread;

class AnonymousMultipleTaskMultipleThread {
  public static void main(String[] args) {
    Thread t1 = new Thread(()-> System.out.println("task one")); /*{//
      public void run() {
        System.out.println("task one");
      }
    };*/
    Thread t2 = new Thread(() -> System.out.println("task two"));//
    t1.start();
    t2.start();
  }
}
