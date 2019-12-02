/*
Use:
Author:Amaru
Time:2019-12-01 13:27:48
Detail:FileOutputStream---->BufferedOutputStream------>File
*/

package org.io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class BufferedOutputStreamExample {
  public static void main(String[] args) {
    try {
      FileOutputStream fos =new FileOutputStream("D:\\workspace\\ideaworkspace\\test\\x.txt");
      BufferedOutputStream buf=new BufferedOutputStream(fos);//
      String str="我是一匹来自东方的狼";
      byte[] bytes=str.getBytes();
      buf.write(bytes);
      buf.flush();//将缓存刷入文件
      buf.close();
      fos.close();
      System.out.println("写入成功！");
    } catch (IOException e) {
      System.out.println("操作失败！");
    }
  }
}
