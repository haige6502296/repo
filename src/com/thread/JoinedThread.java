/*
Use:
Author:Amaru
Time:2019-11-26 22:25:23
Detail:In the above example,when t1 is completes its task for 2500 miliseconds(5 times) then t2 and t3 starts executing.
*/

package com.thread;

class JoinedThread extends  Thread {
  public void run(){
    for (int i = 1; i <6 ; i++) {
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        System.out.println(e);
      }
      System.out.println(i+"Thread is running...");
    }
  }

  public static void main(String[] args) {
    JoinedThread t1=new JoinedThread();
    JoinedThread t2=new JoinedThread();
    JoinedThread t3=new JoinedThread();

    t1.start();
    try {
      t1.join(2500);
    } catch (InterruptedException e) {
      System.out.println(e);
    }
    t2.start();
    t3.start();
  }
}
