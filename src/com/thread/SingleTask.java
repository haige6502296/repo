/*
Use:performing single task with multiple thread
Author:Amaru
Time:2019-11-28 20:15:48
Detail:
*/

package com.thread;

class SingleTask implements Runnable {
  public static void main(String[] args) {
    Thread t1 = new Thread(new SingleTask());
    Thread t2 = new Thread(new SingleTask());

    t1.start();
    t2.start();
  }

  @Override
  public void run() {
    System.out.println("task one");
  }
}
