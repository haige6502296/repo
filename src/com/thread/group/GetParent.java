/*
Use:
Author:Amaru
Time:2019-11-28 18:56:53
Detail:
*/

package com.thread.group;

class GetParent extends Thread{
  GetParent(String name,ThreadGroup g){
    super(g,name);
  }
  public void run(){
    for (int i = 0; i <5; i++) {
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println(Thread.currentThread().getName()+" 正在执行："+i);
    }
    System.out.println(Thread.currentThread().getName()+" 执行完毕！");
  }

  public static void main(String[] args) {
    ThreadGroup g1=new ThreadGroup("parent");
    ThreadGroup g2=new ThreadGroup(g1,"child" );
    //create a new thread
    GetParent t1=new GetParent("thread-1", g1);
    //start thread
    t1.start();
    GetParent t2=new GetParent("thread-2", g2);
    t2.start();

    System.out.println(g1.getName()+" parent_thread group is "+g1.getParent().getName());
    System.out.println(g2.getName()+" parent_thread group is "+g2.getParent().getName());
    g1.list();
  }
}
