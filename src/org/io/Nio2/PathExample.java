/*
Use:
Author:Amaru
Time:2019-12-06 22:54:24
Detail:
*/

package org.io.Nio2;

import java.nio.file.Path;
import java.nio.file.Paths;

class PathExample {
  public static void main(String[] args) {
    Path path= Paths.get("D:\\workspace\\ideaworkspace\\test\\111\\121.txt");
    System.out.format("toString: %s%n", path.toString());
    System.out.format("getFileName: %s%n", path.getFileName());
    System.out.format("getName(3): %s%n", path.getName(3));
    System.out.format("getNameCount: %d%n", path.getNameCount());
    System.out.format("subpath(0,2): %s%n", path.subpath(0,2));//相对路径
    System.out.format("getParent: %s%n", path.getParent());
    System.out.format("getRoot: %s%n", path.getRoot());
    System.out.format("%s%n", path.toUri());


    if (args.length < 1) {
      System.out.println("usage: FileTest file");
      System.exit(-1);
    }

    // Converts the input string to a Path object.
    Path inputPath = Paths.get(args[0]);

    // Converts the input Path
    // to an absolute path.
    // Generally, this means prepending
    // the current working
    // directory.  If this example
    // were called like this:
    //     java FileTest foo
    // the getRoot and getParent methods
    // would return null
    // on the original "inputPath"
    // instance.  Invoking getRoot and
    // getParent on the "fullPath"
    // instance returns expected values.
    Path fullPath = inputPath.toAbsolutePath();
  }
}
