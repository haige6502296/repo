/*
Use:There is only one instance of java.lang.Runtime_ class is available for one java application.
Author:Amaru
Time:2019-11-28 20:55:37
Detail:The Runtime_.getRuntime() method returns the singleton instance of Runtime_ class.
*/

package com.thread;

import java.io.IOException;

class Runtime_ {
  public static void main(String[] args) throws IOException {
    Runtime r=Runtime.getRuntime();
    //r.exec("notepad");//打开记事本

    System.out.println(r.availableProcessors());//返回硬件CPU处理器的数量
    System.out.println("总内存："+r.totalMemory()/(1024*1024)+"MB");//虚拟机

    for (int i = 0; i <10000 ; i++) {
      new Runtime_();
    }
    System.out.println("剩余内存："+r.freeMemory()/(1024*1024)+"MB");//虚拟机
    System.gc();
    System.out.println("总内存："+r.totalMemory()/(1024*1024)+"MB");//虚拟机
    System.out.println("剩余内存："+r.freeMemory()/(1024*1024)+"MB");//虚拟机
  }
}
