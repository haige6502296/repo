/*
Use:No synchronized keywords
Author:Amaru
Time:2019-11-28 22:54:39
Detail:本来希望把每一个msg用[]框起来
*/

package com.thread.synchronization;

class Callme {

  /* synchronized */void call(String msg) {
    System.out.print("[" + msg);
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      System.out.println("Interrupted");
    }
    System.out.print("]");
  }
}

class Caller implements Runnable {
  private String msg;
  private final Callme callme;
  Thread t;

  Caller(Callme callme, String msg) {
    this.callme = callme;
    this.msg = msg;
    t = new Thread(this);
    t.start();
  }

  @Override
  public void run() {
  /*  synchronized (callme) {*/
      callme.call(msg);
   /* }*///线程启动后执行run(),调用Callme的call()方法
  }
}

class NoSynchronization2 {
  public static void main(String[] args) {
    Callme callme = new Callme();

    Caller caller1 = new Caller(callme, "Hello");//每次创建一个Caller对象将会执行其构造方法，并创建线程，而且启动线程
    Caller caller2 = new Caller(callme, "Synchronized");
    Caller caller3 = new Caller(callme, "World");
    Caller caller4 = new Caller(callme, "I");
    Caller caller5 = new Caller(callme, "Love");
    Caller caller6 = new Caller(callme, "You");

    try {
      caller1.t.join();
      caller2.t.join();
      caller3.t.join();
      caller4.t.join();
      caller5.t.join();
      caller6.t.join();
    } catch (InterruptedException e) {
      System.out.println("Interrupted");
    }
  }
}
