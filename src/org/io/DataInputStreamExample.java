/*
Use:
Author:Amaru
Time:2019-12-02 20:01:54
Detail:
*/

package org.io;

import java.io.*;


class DataInputStreamExample {
  public static void main(String[] args) {
    FileInputStream fileInputStream_e;
    DataInputStream dataInputStream_e;

    try {
      fileInputStream_e = new FileInputStream("D:/workspace/ideaworkspace/test/B.txt");
      dataInputStream_e = new DataInputStream(fileInputStream_e);
     int size=fileInputStream_e.available();
     byte[] bytes=new byte[size];
    dataInputStream_e.read(bytes);
      for (byte by:bytes) {
        char k = (char) by;
        System.out.print(k);
      }
      fileInputStream_e.close();
      dataInputStream_e.close();
    } catch (IOException e) {
      System.out.println("异常产生！" + e);
    }
  }
}
