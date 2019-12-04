/*
Use:try带资源隐式地使用finally，自动关闭资源
Author:Amaru
Time:2019-12-04 00:38:40
Detail:
*/

package org.io;

import java.io.*;

class ReadLineExample {
  public static void main(String[] args) {
    try (
            FileReader reader = new FileReader("D:/workspace/ideaworkspace/test/x.txt");
            FileWriter writer = new FileWriter("D:/workspace/ideaworkspace/test/x_copy3.txt");
            BufferedReader inputstream = new BufferedReader(reader);
            PrintWriter outputstream = new PrintWriter(writer)
    ) {
      String content ;
      while((content=inputstream.readLine())!=null){
        outputstream.println(content);
      }
      System.out.println("操作成功！");
    } catch (IOException e) {
      System.out.println("操作失败："+e);
    }
  }
}
