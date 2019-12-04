/*
Use:
Author:Amaru
Time:2019-12-03 23:42:19
Detail:
*/

package org.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class CopyUsingCharacterStream {
  public static void main(String[] args) {
    FileReader reader=null;
    FileWriter writer=null;
    try {
      reader = new FileReader("D:/workspace/ideaworkspace/test/x.txt");
      writer = new FileWriter("D:/workspace/ideaworkspace/test/x_copy.txt");
      int c = 0;
      while ((c = reader.read()) != -1) {
        writer.write(c);
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        if (reader!= null) {
          reader.close();
        }
        if (writer != null) {
          writer.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
