/*
Use:
Author:Amaru
Time:2019-11-28 20:21:57
Detail:
*/

package com.thread;

class Task1 extends Thread{
  public void run(){
    System.out.println("task one");
  }
}
class Task2 extends  Thread{
  public void run(){
    System.out.println("task two");
  }
}
class MultipleTask_MultipleThread {
  public static void main(String[] args) {
    Task1 t1=new Task1();
    Task2 t2=new Task2();
    t1.start();
    t2.start();
  }
}
