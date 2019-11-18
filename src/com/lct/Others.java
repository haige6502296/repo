/*
Usage:
Author:Amaru
Time:2019-11-18 22:53:33
Detail:
*/

package com.lct;
class  OthersParents{
  protected void show(){
    System.out.println("Parents protect method");
  }
}
class Others  extends  OthersParents{
protected void show(){
  System.out.println("Child method");
}

  public static void main(String[] args) {
    Others others=new Others();
    others.show();
  }
}
