/*
Use:
Author:Amaru
Time:2019-11-24 18:52:39
Detail:
*/

package com.Exception;

import java.io.PrintWriter;

class ExceptionTest2 {
  public static void main(String[] args) {

/*    PrintWriter pw;
    try {
      pw=new PrintWriter("aa.txt");
      pw.println("saved");
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("file saved successfully!");*/
/*    try {
      int a[] = new int[5];
      a[5] = 30 / 0;
    } catch (ArithmeticException e) {
      System.out.println("Arithmetic Exception occurs");
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("ArrayIndexOutOfBounds Exception occurs");
    } catch (Exception e) {
      System.out.println("Parent Exception occurs");
    }
    System.out.println("rest of the code");*/

/*    try {
      int a[] = new int[5];
      a[5] = 30 / 0;
      System.out.println(a[10]);
    } catch (ArithmeticException e) {
      System.out.println("Arithmetic Exception occurs");
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("ArrayIndexOutOfBounds Exception occurs");
    } catch (Exception e) {
      System.out.println("Parent Exception occurs");
    }
    System.out.println("rest of the code");*/

/*    try {
      String s = null;
      System.out.println(s.length());
    } catch (ArithmeticException e) {
      System.out.println("Arithmetic Exception occurs");
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("ArrayIndexOutOfBounds Exception occurs");
    } catch (Exception e) {
      System.out.println(e);
    }
    System.out.println("rest of the code");*/


// to handle the exception without maintaining the order of exceptions (i.e. from most specific to most general).
/*    try{
      int a[]=new int[5];
      a[5]=30/0;
    }
    catch(Exception e){System.out.println("common task completed");}
    catch(ArithmeticException e){System.out.println("task1 is completed");}
    catch(ArrayIndexOutOfBoundsException e){System.out.println("task 2 completed");}
    System.out.println("rest of the code...");*/
  }
}
