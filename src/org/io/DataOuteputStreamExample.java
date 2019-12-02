/*
Use:
Author:Amaru
Time:2019-12-02 19:29:57
Detail:
*/

package org.io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class DataOuteputStreamExample {
  public static void main(String[] args) {
    FileOutputStream fileOutputStream_d;
    DataOutputStream dataOutputStream_d;

    try {
      fileOutputStream_d = new FileOutputStream("D:/workspace/ideaworkspace/test/c.txt");
      dataOutputStream_d = new DataOutputStream(fileOutputStream_d);
      String str = "我不是一个共产党员。";
      dataOutputStream_d.writeUTF(str);
      dataOutputStream_d.flush();
      fileOutputStream_d.close();
      dataOutputStream_d.close();
      System.out.println("保存成功！");
    } catch (IOException e) {
      System.out.println("操作失败！" + e);
    }
  }
}
