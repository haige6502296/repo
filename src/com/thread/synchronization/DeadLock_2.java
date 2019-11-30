/*
Use:
Author:Amaru
Time:2019-11-29 22:51:56
Detail:
*/

package com.thread.synchronization;

class CircleDeadLock implements Runnable {
  private final Object ob1;
  private final Object ob2;

  CircleDeadLock(Object ob1, Object ob2) {
    this.ob1 = ob1;
    this.ob2 = ob2;
  }

  @Override
  public void run() {
    String name = Thread.currentThread().getName();
    synchronized (ob1) {
      System.out.println(name + " acquired locke on " + ob1);
      this.work();
      synchronized (ob2) {
        System.out.println("After, " + name + " acquired lock on " + ob2);
        work();//可要可不要this
      }
      System.out.println(name + " released lock on " + ob2);
    }
    System.out.println(name + " released lock on " + ob1);
    System.out.println(name + " finished execution.");
  }

  private void work() {
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}

class DeadLock_2 {
  public static void main(String[] args) throws InterruptedException {
    Object ob1 = new Object();
    Object ob2 = new Object();
    Object ob3 = new Object();

    Thread t1 = new Thread(new CircleDeadLock(ob1, ob2), "t1");
    Thread t2 = new Thread(new CircleDeadLock(ob2, ob3), "t2");
    Thread t3 = new Thread(new CircleDeadLock(ob3, ob1), "t3");

    t1.start();
    Thread.sleep(1000);
    t2.start();
    Thread.sleep(1000);
    t3.start();
  }
}
