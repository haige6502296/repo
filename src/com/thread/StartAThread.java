/*
Use:start(),sleep()
Author:Amaru
Time:2019-11-25 23:37:58
Detail:As you know well that at a time only one thread is executed. If you sleep a thread for the specified time,the thread shedular picks up another thread and so on.
*/

package com.thread;

class StartAThread extends  Thread {
  public void run(){
    for (int i = 0; i <5; i++) {
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        System.out.println(e);
      }
      System.out.println(i);
    }
  }

  public static void main(String[] args) {
    StartAThread thread1=new StartAThread();
    StartAThread thread2=new StartAThread();
    StartAThread thread3=new StartAThread();
    thread1.start();;
    thread2.start();
    thread3.start();
  }
}
