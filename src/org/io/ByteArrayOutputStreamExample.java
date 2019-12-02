/*
Use:
Author:Amaru
Time:2019-12-02 18:58:22
Detail:
*/

package org.io;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class ByteArrayOutputStreamExample {
  public static void main(String[] args) {
    FileOutputStream fileOutputStream_b;
    FileOutputStream fileOutputStream_c;
    ByteArrayOutputStream byteArrayOutputStream_b;

    String path_b="D:/workspace/ideaworkspace/test/a1.txt";
    String path_c="D:/workspace/ideaworkspace/test/b1.txt";

    try {
      fileOutputStream_b=new FileOutputStream(path_b);
      fileOutputStream_c=new FileOutputStream(path_c);
      byteArrayOutputStream_b=new ByteArrayOutputStream();

      byteArrayOutputStream_b.write(123);
      byteArrayOutputStream_b.writeTo(fileOutputStream_b);
      byteArrayOutputStream_b.writeTo(fileOutputStream_c);

      byteArrayOutputStream_b.flush();
      byteArrayOutputStream_b.close();//has no effect
      fileOutputStream_b.close();
      fileOutputStream_c.close();

      System.out.println("写入成功！");
    } catch (IOException e) {
      System.out.println("操作失败:"+e);
    }
  }
}
