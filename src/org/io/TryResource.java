/*
Use:字符流
Author:Amaru
Time:2019-12-04 00:18:25
Detail:一个字符一个字符的读取
*/

package org.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class TryResource {
  public static void main(String[] args) {

    try(FileReader reader=new FileReader("D:/workspace/ideaworkspace/test/x.txt");
        FileWriter writer=new FileWriter("D:/workspace/ideaworkspace/test/x_copy.txt")) {
      int c=0;
      while((c=reader.read())!=-1){
        writer.write(c);
      }
      System.out.println("操作成功！");
    } catch (IOException e) {
      System.out.println("操作失败"+e);
    }
  }
}
