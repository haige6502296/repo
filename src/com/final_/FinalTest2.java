/*
Usage:final keywords
Author:Amaru
Time:2019-11-17 01:02:56
Detail:what is final parameter?
*/

package com.final_;

class FinalTest2 {
/*  private int n = 0;

  private void cube(int n){
    this.n=n;
    int x=n*n*n;
    System.out.println(x);
  }

  private void show_volume() {
    for (int i = 0; i < 5; i++) {
      n++;
      this.cube(n);
    }
  }

  public static void main(String[] args) {
    FinalTest2 finalTest2=new FinalTest2();
    finalTest2.show_volume();
  }*/

  private int cube(/*final */int n){
    n=n+2;//can't be changed as n is final
   return n*n*n;
  }
  public static void main(String []args){
    FinalTest2 b=new FinalTest2();
    System.out.println(b.cube(1));
  }
}

