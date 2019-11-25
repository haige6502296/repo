/*
Use:String concat need more time,slower than StringBuffer
Author:Amaru
Time:2019-11-23 18:38:03
Detail:StringBuffer is more efficient than String,StringBuilder is  most efficient
*/

package com.string;

class StringVsStringBuffer {
  private static void concatWithString()    {
    String t = "xx";
    for (int i=0; i<15000; i++){
      t = t + "Tpoint";
    }
  }
  private static void concatWithStringBuffer(){
    StringBuffer sb = new StringBuffer("xx");
    for (int i=0; i<15000; i++){
      sb.append("Tpoint");
    }
  }

  private  static  void  concatWithStringBuilder(){
    StringBuilder stringBuilder=new StringBuilder("xx");
    for (int i = 0; i < 15000; i++) {
      stringBuilder.append("Tpoint");
    }
  }

  public static void main(String[] args) {
    long startTime = System.currentTimeMillis();
    concatWithString();
    System.out.println("Time taken by Concating with String: "+(System.currentTimeMillis()-startTime)+"ms");
    startTime = System.currentTimeMillis();
    concatWithStringBuffer();
    System.out.println("Time taken by Concating with  StringBuffer: "+(System.currentTimeMillis()-startTime)+"ms");

    startTime = System.currentTimeMillis();
    concatWithStringBuilder();
    System.out.println("Time taken by Concating with  StringBuilder: "+(System.currentTimeMillis()-startTime)+"ms");
  }
}
