/*
Use:
Author:Amaru
Time:2019-12-09 23:32:55
Detail:
*/

package org.io.Nio2;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class DirList {
  public static void main(String[] args) {
    String dirName = "D:/downloads";


    //create a filter that return true only for writable files

    //before java 1.7
    /*    DirectoryStream.Filter<Path> how=new DirectoryStream.Filter<Path>() {
      @Override
      public boolean accept(Path entry)  {
        return Files.isWritable(entry);
      }
    };*/
    DirectoryStream.Filter<Path> how = Files::isWritable;//since java 1.8


    //obtain and manage a directory  stream of writable  files
    try (DirectoryStream<Path> dirstrm = Files.newDirectoryStream(Paths.get(dirName), how)) {
      System.out.println("Directory of " + dirName);
      for (Path entry : dirstrm) {
        BasicFileAttributes attributes = Files.readAttributes(entry, BasicFileAttributes.class);
        if (attributes.isDirectory()) {
          System.out.println("<Dir>");
        } else {
          System.out.println("     ");
        }
        System.out.println(entry.getName(1));
      }
    } catch (InvalidPathException p) {
      System.out.println("Path Error: " + p);
    } catch (NotDirectoryException d) {
      System.out.println(dirName + " is not a directory!");
    } catch (IOException e) {
      System.out.println("I/O Error: " + e);
    }
  }
}
