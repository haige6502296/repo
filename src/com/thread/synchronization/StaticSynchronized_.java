/*
Use:synchronized static
Author:Amaru
Time:2019-11-29 19:20:31
Detail:
*/

package com.thread.synchronization;

class Commonality {
  synchronized static void printNumber(int n) {
    for (int i = 1; i < 5; i++) {
      System.out.println(Thread.currentThread().getName() + "执行打印........................" + n * i);
      if (i == 4) {
        System.out.println(Thread.currentThread().getName() + "执行打印........................" + n * i);
        System.out.println(Thread.currentThread().getName() + "执行完毕！");
      }
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

class Myclass1 extends Thread {
  /*  private Commonality c;
    Myclass1(Commonality c){
      this.c=c;
    }*/
  public void run() {
    Commonality.printNumber(10);

  }
}

class Myclass2 extends Thread {
  /*  private Commonality c;
    Myclass2(Commonality c){
      this.c=c;
    }*/
  public void run() {
    Commonality.printNumber(20);

  }
}

class Myclass3 extends Thread {
  /*  private Commonality c;
    Myclass3(Commonality c){
      this.c=c;
    }*/
  public void run() {
    Commonality.printNumber(30);

  }
}

class Myclass4 extends Thread {
  /*  private Commonality c;
    Myclass4(Commonality c){
      this.c=c;
    }*/
  public void run() {
    Commonality.printNumber(40);

  }
}

class StaticSynchronized_ {
  public static void main(String[] args) {
    Commonality c = new Commonality();

    Myclass1 myclass1 = new Myclass1();
    Myclass2 myclass2 = new Myclass2();
    Myclass3 myclass3 = new Myclass3();
    Myclass4 myclass4 = new Myclass4();

    myclass1.setName("线程A");
    myclass2.setName("线程B");
    myclass3.setName("线程C");
    myclass4.setName("线程D");

    myclass1.start();
    myclass2.start();
    myclass3.start();
    myclass4.start();
  }
}
