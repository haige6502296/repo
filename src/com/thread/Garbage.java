/*
Use:System.gc()
Author:Amaru
Time:2019-11-28 20:45:56
Detail:
*/

package com.thread;

class Garbage {
  @Override
public void finalize(){//before garbage collection,it will perform once.
  System.out.println("Object is garbage collected");
}

  public static void main(String[] args) {
    Garbage garbage1=new Garbage();
    Garbage garbage2=new Garbage();//will not be garbage collected
    new Garbage();//will be garbage collected
    garbage1=null;//will be garbage collected
    System.gc();
  }
}
