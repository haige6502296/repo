/*
Use:
Author:Amaru
Time:2019-11-28 19:23:25
Detail:
*/

package com.thread;

class ShutdownHook extends Thread {
  public void run() {
    System.out.println("Thread is running......");
  }

  public static void main(String[] args) {
    Runtime r = Runtime.getRuntime();
    r.addShutdownHook(new ShutdownHook());
    System.out.println("Now main sleeping... press ctrl+c to exit");
    try {Thread.sleep(3000);} catch (Exception ignored) {}
  }
}
