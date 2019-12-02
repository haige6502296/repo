/*
Use:读取中英文
Author:Amaru
Time:2019-12-02 01:14:33
Detail:
*/

package org.io;

import java.io.*;

class WriteAndReadByIO {
  public static void main(String[] args) {


    FileOutputStream f1;
    BufferedOutputStream b1;
    FileInputStream f2;

    BufferedInputStream b2;
    InputStreamReader i2;
    BufferedReader b2_reader;
    String path="D:/workspace/ideaworkspace/test/m.txt";
    StringBuilder builder;
    {
      try {

        //创建文件并写入内容
        f1 = new FileOutputStream(path);
        b1 = new BufferedOutputStream(f1);
        String content = "呵呵";
        byte[] by1 = content.getBytes();
        b1.write(by1);
        b1.flush();
        b1.close();
        f1.close();

        //读取m文件，因为是中文字符，一个中文占两个字节，如果混有英文，英文一个文字占一个字节，中文会占两个字节，常规读取会产生乱码，必须使用BufferedReader
        f2=new FileInputStream(path);
        b2=new BufferedInputStream(f2);
        i2=new InputStreamReader(b2);
        b2_reader=new BufferedReader(i2);
        builder=new StringBuilder();

        while (b2_reader.ready()){
          builder.append((char) b2_reader.read());//这里注意不是b2，否则会是乱码
        }
        System.out.println(builder/*.toString()*/);
        i2.close();
        b2_reader.close();
        b2.close();
        f2.close();

      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}