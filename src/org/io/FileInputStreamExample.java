/*
Use:
Author:Amaru
Time:2019-12-01 02:29:32
Detail:
*/

package org.io;

import java.io.FileInputStream;

class FileInputStreamExample {
  public static void main(String[] args) {
    try {
      FileInputStream fin = new FileInputStream("D:\\workspace\\ideaworkspace\\test\\B.txt");
      int i = 0;
      while ((i = fin.read()) != -1)
        System.out.print((char) i);
      fin.close();
    } catch (Exception e) {System.out.println("读取失败！");}
  }
}
