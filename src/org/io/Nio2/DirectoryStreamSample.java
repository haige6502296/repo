/*
Use:
Author:Amaru
Time:2019-12-09 22:20:47
Detail:
*/

package org.io.Nio2;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class DirectoryStreamSample {
  public static void main(String[] args) {
    String dir = "D:/downloads";
    //Obtain and manage a directory stream within a try block

    try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(Paths.get(dir))) {
      System.out.println("Directory of " + dir);

      //because DirectoryStream implements iterable,we can use a "forEach" loop to display the directory
      for (Path entry : directoryStream) {
        BasicFileAttributes fileAttributes = Files.readAttributes(entry, BasicFileAttributes.class);
        if (fileAttributes.isDirectory()) {
          System.out.println("It's a directory!");
        } else {
          System.out.println("It's not directory!");
        }
          System.out.println(entry.getFileName());
      }
    } catch (InvalidPathException | NotDirectoryException p) {
      System.out.println("Path Error:  " + p);
    } catch (IOException e) {
      System.out.println("I/O error!"+e);
    }
  }
}
