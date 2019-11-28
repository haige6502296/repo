/*
Use:activeGroupCount
Author:Amaru
Time:2019-11-27 23:59:52
Detail:The activeGroupCount() method of ThreadGroup class returns an estimate of the number of active groups in this thread group and its subgroups. The returned value is only an estimate because the number of thread groups may change dynamically while this method traverses internal data structures.
*/

package com.thread.group;

class A_NewThred extends Thread {
  A_NewThred(ThreadGroup tg, String threadName) {
    super(tg, threadName);
  }

  public void run() {
    for (int i = 0; i < 10; i++) {
      try {
        Thread.sleep(10);
        System.out.println(Thread.currentThread().getName()+" 执行任务："+i);
      } catch (InterruptedException e) {
        System.out.println(Thread.currentThread().getName() + " interrupted");
      }
    }
    System.out.println(Thread.currentThread().getName()+" completed executing");
  }
}

class ActiveGroupCount {
  public static void main(String[] args) {
    // creating the thread group
    ThreadGroup tg1 = new ThreadGroup("parent thread group");
    ThreadGroup tg2 = new ThreadGroup(tg1, "first child threadGroup");
    ThreadGroup tg3 = new ThreadGroup(tg1, "second child threadGroup");
    A_NewThred t1=new A_NewThred(tg1,"线程1");
    A_NewThred t2=new A_NewThred(tg2, "线程2");


    System.out.println(t1.getName()+" starts:");
    //this will call run() method
    t1.start();
    t2.start();
    tg1.checkAccess();//如果没有权限将会抛出异常
    System.out.println(tg1.getName()+" has accessed");
    //check the number of active thread group
    System.out.println("Number of parent active group(including its child group): "+tg1.activeGroupCount()+"。名称"+Thread.currentThread().getName());//2
    System.out.println("Number of first  child active thread group(including its child group): "+tg2.activeGroupCount()+"。名称"+Thread.currentThread().getName());//估算，不一定准确
    System.out.println("Number of second child thread group:"+tg3.activeGroupCount()+"。名称"+Thread.currentThread().getName());//0

  }
}
