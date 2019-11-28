/*
Use:Daemon Thread
Author:Amaru
Time:2019-11-27 00:21:36
Detail:The two methods of Daemon Thread:  public void setDaemon(boolean status)
                                                                             public boolean isDaemon()
*/

package com.thread;

class DaemonThread  extends  Thread{
  public void run(){
    if ( Thread.currentThread().isDaemon()) {//checking for daemon thread
      System.out.println("Daemon Thread is working!");
    }else {
      System.out.println("User Thread is working!");
    }
  }

  public static void main(String[] args) {
    DaemonThread t1=new DaemonThread();//creating thread
    DaemonThread t2=new DaemonThread();
    DaemonThread t3=new DaemonThread();

    t2.setDaemon(true);//now t2 is the daemon thread,if you wanna set t2 be a daemon thread,it must not be started otherwise it will throw IllegalThreadStateException
    t1.start();//starting threads
    //t1.setDaemon(true) or t1.setDaemon(false) must be set before t1.start() if you need to set t1 is the daemon thread
    //t1.setDaemon(false);
    t2.start();
    t3.start();
  }
}
