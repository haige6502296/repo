/*
Use:
Author:Amaru
Time:2019-12-03 21:24:22
Detail:？？？？？？不太明白
*/

package org.io;

import java.io.File;
import java.io.FilePermission;
import java.nio.file.attribute.BasicFileAttributes;
import java.security.PermissionCollection;//抽象类
class FilePermissionExample {
  public static void main(String[] args) {
    FilePermission filePermission1 = new FilePermission("D:/workspace/ideaworkspace/test", "read");
    FilePermission filePermission3 = new FilePermission("D:/workspace/ideaworkspace/test/222", "read");
    String text1 = "D:/workspace/ideaworkspace/test/x.txt";
    String text2 = "D:/workspace/ideaworkspace/test/B.txt";

    PermissionCollection permissionCollection = filePermission1.newPermissionCollection();
    permissionCollection.add(filePermission1);
    FilePermission filePermission2 = new FilePermission(text1, "write");
    permissionCollection.add(filePermission2);
    File file =new File("D:/workspace/ideaworkspace/test/111/123.txt");
    if (permissionCollection.implies(new FilePermission(text1, "read,write"))) {
      System.out.println("Read,Write permission is granted for the text1 " + text1);
    } else {System.out.println("Read,Write permission is granted for the text1 " + text1);}
  }
}
