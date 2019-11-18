/*
Usage:Understanding Real use of instanceof in java
Author:Amaru
Time:2019-11-17 21:59:50
Detail:Let's see the real use of instanceof keyword by the example given below.
*/

package com.instanceof_;

interface Printable {}

class PrintableOne implements Printable {
  void showPrintable() {
    System.out.println("PrintableOne method");
  }
}

class PrintableTwo implements Printable {
  void showPrintable() {
    System.out.println("PrintableTwo method");
  }
}

class Call {
  void invoke(Printable p) {//upcasting
    if (p instanceof PrintableOne) {
      PrintableOne printableOne = (PrintableOne) p;//Downcasting
      printableOne.showPrintable();
    }
   else if (p instanceof PrintableTwo) {
      PrintableTwo printableTwo = (PrintableTwo) p;
      printableTwo.showPrintable();
    }
  }
}

class InstanceofTest {
  public static void main(String[] args) {
    Printable pll=new PrintableTwo();
    Call call=new Call();
    call.invoke(pll);
  }
}
