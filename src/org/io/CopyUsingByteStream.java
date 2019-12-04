/*
Use:
Author:Amaru
Time:2019-12-03 23:10:50
Detail:
*/

package org.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class CopyUsingByteStream {
  public static void main(String[] args) throws  IOException{

    try (FileInputStream in = new FileInputStream("D:/workspace/ideaworkspace/test/m.txt");
         FileOutputStream out = new FileOutputStream("D:/workspace/ideaworkspace/test/m_copy.txt")) {
      int c;
      while ((c = in.read()) != -1) {
        out.write(c);
      }
      System.out.println("success....");
    } catch (IOException e) {
      System.out.println("Error:" + e);
    }
  }
}
