/*
Use:sequenceInputStream,无法使用bufferedReader来读取多个含中文的流
Author:Amaru
Time:2019-12-02 04:42:48
Detail:
*/

package org.io;

import java.io.*;

class ReadMultipleFile {
  public static void main(String[] args) {
    FileInputStream fileInputStream_a;
    BufferedInputStream bufferedInputStream_a;
    InputStreamReader inputStreamReader_a;
    BufferedReader bufferedReader_a;
    StringBuilder stringBuilder_a;

    try {
      fileInputStream_a=new FileInputStream("D:/workspace/ideaworkspace/test/代码.java");
      bufferedInputStream_a=new BufferedInputStream(fileInputStream_a);
      inputStreamReader_a=new InputStreamReader(bufferedInputStream_a);
      bufferedReader_a=new BufferedReader(inputStreamReader_a);
      stringBuilder_a=new StringBuilder();

      while(bufferedReader_a.ready()){
        stringBuilder_a.append((char)bufferedReader_a.read());
      }
      System.out.println(stringBuilder_a.toString());

      bufferedReader_a.close();
      inputStreamReader_a.close();
      fileInputStream_a.close();
    } catch (IOException e) {
      System.out.println("操作失败！");
    }
  }
}
