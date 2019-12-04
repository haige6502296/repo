/*
Use:
Author:Amaru
Time:2019-12-03 22:23:04
Detail:
*/

package org.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

class FileAttributesExample {
  public static void main(String[] args) {
    Path path = Paths.get("D:/workspace/ideaworkspace/test/111/332.txt");
    BasicFileAttributes bfa = null;
    try {
      bfa = Files.readAttributes(path, BasicFileAttributes.class);
    } catch (IOException e) {
      e.printStackTrace();
    }

    if (bfa != null) {
      System.out.println("Creation Time      : " + bfa.creationTime());

      System.out.println("Last Access Time   : " + bfa.lastAccessTime());
      System.out.println("Last Modified Time : " + bfa.lastModifiedTime());
      System.out.println("Is Directory       : " + bfa.isDirectory());
      System.out.println("Is Other           : " + bfa.isOther());
      System.out.println("Is Regular File    : " + bfa.isRegularFile());
      System.out.println("Is Symbolic Link   : " + bfa.isSymbolicLink());
      System.out.println("Size               : " + bfa.size());
      System.out.println("Is Regular File   :"+bfa.isRegularFile());
    }
  }
}
