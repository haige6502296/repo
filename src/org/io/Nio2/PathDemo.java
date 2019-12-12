/*
Use:
Author:Amaru
Time:2019-12-09 21:35:05
Detail:
*/

package org.io.Nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

class PathDemo {
  public static void main(String[] args) {
    Path filePath= Paths.get("D:\\downloads\\tutorial\\index.html");
    System.out.println("File name is :"+filePath.getFileName());
    System.out.println("File path is : "+filePath);
    System.out.println("Absolute Path :"+filePath.toAbsolutePath());
    System.out.println("Parent :"+filePath.getParent());
    System.out.println("Is File exist : "+ Files.exists(filePath));

    try {
      if (Files.isHidden(filePath)) {
        System.out.println("Yes,this file is hidden!");
      }else {
        System.out.println("No,this file is visible");
      }
    } catch (IOException e) {
     e.printStackTrace();
    }

    if (Files.isWritable(filePath)) {
      System.out.println("File is Writable!");
    }else {
      System.out.println("File is not writable!");
    }
    if (Files.isReadable(filePath)) {
      System.out.println("Yes, the file is readable!");
    }else {
      System.out.println("No,the file is unreadable!");
    }

    try {
      BasicFileAttributes attributes=Files.readAttributes(filePath, BasicFileAttributes.class);

      if (attributes.isDirectory()){
        System.out.println("It's a directory!");
      }else {
        System.out.println("It's not a directory!");
      }
      if(attributes.isRegularFile()){
        System.out.println("It's a normal file!");
      }else {
        System.out.println("It's not a normal file!");
      }
      if (attributes.isSymbolicLink()){
        System.out.println("Yes,it is a symbolic link!");
      }else {
        System.out.println("No,it's not a symbolic link!");
      }
      System.out.println("This file modified :"+attributes.lastModifiedTime());
      System.out.println("This file size :"+attributes.size());
      System.out.println("This file last access :"+attributes.lastAccessTime());
      System.out.println("This file key :"+attributes.fileKey());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
