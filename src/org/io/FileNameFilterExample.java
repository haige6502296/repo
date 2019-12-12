/*
Use:
Author:Amaru
Time:2019-12-09 20:17:01
Detail:
*/

package org.io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

class OnlyExe  implements FilenameFilter {

  private String ext;
   OnlyExe(String ext){
    this.ext="."+ext;
  }
  @Override
  public boolean accept(File dir, String name) {
      return name.endsWith(ext);//文件名结束必须以.exe结尾
  }
}
class FileNameFilterExample {
  public static void main(String[] args) {
    String dirName="D:/downloads";
    File file=new File(dirName);
    FilenameFilter filter=new OnlyExe("exe");//自带忽略大小写

    String[] s1=file.list();
    assert s1 != null;
    Arrays.stream(s1).forEach(System.out::println);
  }
}