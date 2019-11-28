/*
Use:Thread.currentThread().getName()
Author:Amaru
Time:2019-11-26 23:14:02
Detail:
*/

package com.thread;

class CurrentThread extends Thread {
  public void run(){
    for (int i = 0; i < 5; i++) {
/*      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }*/
      System.out.println(Thread.currentThread().getName()+": "+i+",优先级为："+Thread.currentThread().getPriority());
    }
  }

  public static void main(String[] args) {
    CurrentThread ct1=new CurrentThread();
    CurrentThread ct2=new CurrentThread();
    CurrentThread ct3=new CurrentThread();
    ct1.setName("线程A");
    ct2.setName("线程B");
    ct3.setName("线程C");
    ct1.setPriority(Thread.MAX_PRIORITY);
    ct2.setPriority(Thread.NORM_PRIORITY);
    ct3.setPriority(Thread.MIN_PRIORITY);
    ct1.start();
    ct2.start();
    ct3.start();

  }
}
