/*
Use:
Author:Amaru
Time:2019-11-28 22:28:52
Detail:
*/

package com.thread.synchronization;

class Table {
 synchronized void printTable(int n) {
    for (int i = 2; i < 7; i++) {
      System.out.println(Thread.currentThread().getName() + ".................. :      " + (n * i));
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

class ThreadOne extends Thread {
  private Table table;

  ThreadOne(Table table) {
    this.table = table;
  }

  public void run() {
    table.printTable(5);
    System.out.println(Thread.currentThread().getName() + " Thread is ended");
  }
}

class ThreadTwo extends Thread {
  private Table table;

  ThreadTwo(Table table) {
    this.table = table;
  }

  public void run() {
    table.printTable(20);
    System.out.println(Thread.currentThread().getName() + " Thread is ended");
  }
}


class NoSychronization {
  public static void main(String[] args) {
    Table table = new Table();
    ThreadOne t1 = new ThreadOne(table);
    ThreadTwo t2 = new ThreadTwo(table);
    t1.setName("线程A");
    t2.setName("线程B");
    t1.start();
    t2.start();
  }
}








