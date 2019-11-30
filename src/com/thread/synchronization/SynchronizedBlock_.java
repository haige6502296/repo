/*
Use:Synchronized block
Author:Amaru
Time:2019-11-29 00:06:57
Detail:Synchronized block can be used to perform synchronization on any specific resource of the method.
Suppose you have 50 lines of code in your method, but you want to synchronize only 5 lines, you can use synchronized block.
If you put all the codes of the method in the synchronized block, it will work same as the synchronized method.
*/

package com.thread.synchronization;

class Table_ {

  void printTable(int n) {
    synchronized (this) {//synchronized block
      for (int i = 1; i <= 5; i++) {
        System.out.println(Thread.currentThread().getName() + ".................. :      " + (n * i));
        try {
          Thread.sleep(400);
        } catch (Exception e) {System.out.println(e);}
      }
    }
  }//end of the method
}

class MyThread1 extends Thread {
  private Table_ t;

  MyThread1(Table_ t) {
    this.t = t;
  }

  public void run() {
    t.printTable(5);
  }

}

class MyThread2 extends Thread{
  private Table_ t;
  MyThread2(Table_ t){
    this.t=t;
  }
  public void run(){
    t.printTable(100);
  }
}
class SynchronizedBlock_ {
  public static void main(String[] args) {
    Table_ obj = new Table_();//only one object
    MyThread1 t1=new MyThread1(obj);
    MyThread2 t2=new MyThread2(obj);

    t1.setName("线程A");
    t2.setName("线程B");
    t1.start();
    t2.start();
  }
}
