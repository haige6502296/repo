/*
Use:建立线程的另一种方式
Author:Amaru
Time:2019-11-26 23:49:05
Detail:优先级越高，没有发现什么用处
*/

package com.thread;

class RunnableThread {
  public static void main(String[] args) {
    Thread t1 = new Thread(new Runnable() {
      /**
       * When an object implementing interface <code>Runnable</code> is used
       * to create a thread, starting the thread causes the object's
       * <code>run</code> method to be called in that separately executing
       * thread.
       * <p>
       * The general contract of the method <code>run</code> is that it may
       * take any action whatsoever.
       *
       * @see Thread#run()
       */
      @Override
      public void run() {
        for (int i = 0; i < 10; i++) {
          try {
            Thread.sleep(500);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
          System.out.println("a");
        }
        System.out.println("线程t1执行完毕！");
      }
    }, "t1");

    Thread t2 = new Thread(new Runnable() {
      /**
       * When an object implementing interface <code>Runnable</code> is used
       * to create a thread, starting the thread causes the object's
       * <code>run</code> method to be called in that separately executing
       * thread.
       * <p>
       * The general contract of the method <code>run</code> is that it may
       * take any action whatsoever.
       *
       * @see Thread#run()
       */
      @Override
      public void run() {
        for (int i = 0; i < 10; i++) {
          try {
            Thread.sleep(500);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
          System.out.println("b");
        }
        System.out.println("线程t2执行完毕！");
      }
    }, "t2");
    t1.setPriority(Thread.MIN_PRIORITY);
    t2.setPriority(Thread.MAX_PRIORITY);
    t1.start();
    t2.start();
  }
}
