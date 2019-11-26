/*
Use:
Author:Amaru
Time:2019-11-26 22:53:15
Detail:
*/

package com.thread;

class SetterAndGetter extends Thread {
  public void run(){
    System.out.println("Thread is running......");
  }

  public static void main(String[] args) {
    SetterAndGetter sag_t1=new SetterAndGetter();
    SetterAndGetter sag_t2=new SetterAndGetter();

    System.out.println("Name of sag_t1: "+sag_t1.getName());
    System.out.println("Name of sag_t2: "+sag_t2.getName());
    System.out.println("ID of sag_t1: "+sag_t1.getId());
    System.out.println("ID of sag_t2: "+sag_t2.getId());

    sag_t1.start();
    sag_t2.start();
    sag_t1.setName("线程1");
    sag_t2.setName("线程2");
    System.out.println("After changing name of sag_t1:"+sag_t1.getName());
    System.out.println("After changing name of sag_t2:"+sag_t2.getName());
  }
}
