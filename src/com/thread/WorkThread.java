/*
Use:Thread pool
Author:Amaru
Time:2019-11-27 18:32:41
Detail:It's more  faster to finish a job when using multiThread than using single thread
*/

package com.thread;

class WorkerThread implements Runnable {
  private String message;

  WorkerThread(String s) {
    this.message = s;
  }

  public void run() {
    System.out.println(Thread.currentThread().getName() + " (Start) message = " + message);
    processmessage();//call processmessage method that sleeps the thread for 2 seconds
    System.out.println(Thread.currentThread().getName() + " (End)");//prints thread name
  }

  private void processmessage() {
    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      e.printStackTrace(); }
  }
}
