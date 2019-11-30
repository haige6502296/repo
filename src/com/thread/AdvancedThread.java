/*
Use:
Author:Amaru
Time:2019-11-30 00:30:45
Detail:
*/

package com.thread;

import java.util.concurrent.Semaphore;

class AdvancedThread {
  public static void main(String[] args) {
    Semaphore sem = new Semaphore(1);
    new InThread(sem, "Thread A");
    new DecThread(sem, "Thread B");
  }
}

//A  shared resource.
class Shared {
  static int count = 0;
}

//A thread of execution that increments count.
class InThread implements Runnable {
  private String name;
  private Semaphore sem;

  InThread(Semaphore sem, String name) {
    this.sem = sem;
    this.name = name;
    new Thread(this).start();
  }

  @Override
  public void run() {
    System.out.println("Starting " + name);

    try {
      //First,get a permit.
      System.out.println(name + " is waiting for a permit.");

      sem.acquire();

      System.out.println(name + " get a permit");

      //Now, access shared resource.
      for (int i = 0; i < 5; i++) {
        Shared.count++;
        System.out.println(name + ":"+Shared.count);

        //Now,allow a context switch -- if possible.
        Thread.sleep(10);
      }
    } catch (InterruptedException exc) {System.out.println(exc);}
    //Now,release the permit
    System.out.println(name+" release the permit.");
    sem.release();
  }
}

//A thread of execution that decrements count.
class DecThread implements Runnable{
  private String name;
  private Semaphore sem;
DecThread(Semaphore sem,String name){
  this.sem=sem;
  this.name=name;
  new Thread(this).start();
}
  @Override
  public void run() {
    System.out.println("Starting "+name);

    try {
      //First,get a permit.
      System.out.println(name+" is waiting for a permit.");
      sem.acquire();
      System.out.println(name+" gets a permit.");


    //Now,access shared resource.
    for (int i = 0; i < 5; i++) {
      Shared.count--;
      System.out.println(name+":"+Shared.count);

      //Now,allow a context switch -- if possible.
      Thread.sleep(10);
    }
  } catch (InterruptedException exc) {System.out.println(exc);}
  //Now,release the permit
    System.out.println(name+" release the permit.");
    sem.release();
  }
}