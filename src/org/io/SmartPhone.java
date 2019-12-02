/*
Use:
Author:Amaru
Time:2019-12-02 23:24:20
Detail:
*/

package org.io;

import java.io.Serializable;

class SmartPhone implements Serializable, Runnable {
  private double price;
  private String brand;
  private Thread t;
  private Thread tx;

  private SmartPhone() {
    super();
  }

  private SmartPhone(double price, String brand, Thread t, Thread tx) {
    this.brand = brand;
    this.price = price;
    this.t = t;
    this.tx = tx;
  }
private  void start(){
  t.start();
  tx.start();
}
  public String toString() {
    return (price + "," + brand + t.getName());
  }

  public static void main(String[] args) {
    Thread t1 = new Thread(() -> {
      System.out.println(Thread.currentThread().getName() + "打印工作一次！");
    });
    Thread t2 = new Thread(new SmartPhone());
    SmartPhone smartPhone = new SmartPhone(1500, "Samsung", t1, t2);
    Thread t3 = new Thread(smartPhone);
    t1.setName("t1线程");
    t2.setName("t2线程");
    t3.setName("t3线程");
    smartPhone.start();
    t3.start();

  }

  @Override
  public  void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println(Thread.currentThread().getName() + "第" + i + " 次打印：我是你爸！");
    }
    System.out.println(Thread.currentThread().getName()+"执行完毕！");
  }
}


