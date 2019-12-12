/*
Use:
Author:Amaru
Time:2019-12-09 19:23:06
Detail:
*/

package org.io;

import java.io.File;

class FileListMethod {
  public static void main(String[] args) {
    String dirName="D:\\downloads";
    File f1=new File(dirName);

    if(f1.isDirectory()){
      System.out.println("Directory of "+dirName);
      String []s=f1.list();
      assert s != null;
      for (String value : s) {
        File f2 = new File(dirName + "/" + value);

        if (f2.isDirectory()) {
          System.out.println(value + " is a directory");
        } else {
          System.out.println(value + " is a  file");
        }
      }
    }else {
      System.out.println(dirName+" is a file");
    }
  }
}
