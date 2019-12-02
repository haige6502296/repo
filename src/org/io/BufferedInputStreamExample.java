/*
Use:读取英文字符
Author:Amaru
Time:2019-12-01 13:56:12
Detail:
*/

package org.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

class BufferedInputStreamExample {
  public static void main(String[] args) {
    try {
      FileInputStream fileInputStream=new FileInputStream("D:\\workspace\\ideaworkspace\\test\\B.txt");
      BufferedInputStream bufferedInputStream=new BufferedInputStream(fileInputStream);
      int i=0;
      while ((i=bufferedInputStream.read())!=-1){
        System.out.print((char)i);
      }
      bufferedInputStream.close();
      fileInputStream.close();
    } catch (IOException e) {
      System.out.println("读取失败！");
    }
  }
}
