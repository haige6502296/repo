/*
Usage:to pass as argument in the constructor call
Author:Amaru
Time:2019-11-15 22:00:33
Detail:We can pass the this keyword in the constructor also. It is useful if we have to use one object in multiple classes.
*/

package com.this_;

class This_A{
  private This5 obj;
  This_A(This5 obj){
  this.obj=obj;
  }
  void display(){
    System.out.println(obj.data);//using data member of This5  class
  }
}

class This5 {
  int data=10;
  private This5(){
   This_A this_a=new This_A(this);
   this_a.display();
  }
  public static void main(String[] args) {
    new This5();
  }
}
