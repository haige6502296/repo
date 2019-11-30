/*
Use:
Author:Amaru
Time:2019-11-29 22:18:39
Detail:
*/

package com.thread.synchronization;

class DeadLock_ implements Runnable {
  private static final Object ob1 = new Object();
  private static final Object ob2 = new Object();
  private boolean flag;

  DeadLock_(boolean flage) {
    this.flag = flage;
  }

  @Override
  public void run() {

    String name = Thread.currentThread().getName();
    System.out.println(name + " 开始运行");
    if (flag) {
      synchronized (ob1) {
        System.out.println(name + "已经锁住ob1");
        sleep_();
        synchronized (ob2) {
          //无法执行到这里
          System.out.println("1秒钟后，" + name + "锁住obj2");
        }
      }
    } else {
      synchronized (ob2) {
        System.out.println(name + "已经锁住ob2");
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        synchronized (ob1) {
          //无法执行到这里
          System.out.println(name + "已经锁住ob1");
        }
      }
    }
  }
  public void sleep_(){
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}

class DeadLockTest {
  public static void main(String[] args) {
    Thread t1 = new Thread(new DeadLock_(true), "线程1");
    Thread t2 = new Thread(new DeadLock_(false), "线程2");

    t1.start();
    t2.start();
  }
}