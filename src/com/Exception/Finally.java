/*
Use:
Author:Amaru
Time:2019-11-24 19:49:17
Detail:
*/

package com.Exception;

class Finally {
  public void finalize(){System.out.println("finalize called");}
  public static void main(String[] args){
    Finally f1=new Finally();
    Finally f2=new Finally();
    f1=null;
    f2=null;
    System.gc();
 /*   try{
      int data=25/0;
      System.out.println(data);
    }
    catch(NullPointerException e){System.out.println(e);}//ArithmeticException not been handled,so the blok "System.out.println("rest of the code...") won't execute.
    finally{System.out.println("finally block is always executed");}
    System.out.println("rest of the code...");*/

/*    try {
      int data = 25 / 0;
      System.out.println(data);
    } catch (ArithmeticException e) {System.out.println(e);}//Correct Exception must been handled,
    finally {System.out.println("finally block is always executed");}
    System.out.println("rest of the code...");*/



  }
}

