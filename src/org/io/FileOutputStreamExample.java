/*
Use:Use File class create directory and file,use FileOutputStream write String to the file
Author:Amaru
Time:2019-12-01 00:33:34
Detail:
*/

package org.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

class FileOutputStreamExample {
  public static void main(String[] args) {
    File directory=new File("D:\\workspace\\ideaworkspace\\test");//创建一个文件对象
    directory.mkdirs();//调用mkdirs()可以创建多级目录，返回boolean 类型的数据
    try {
      FileOutputStream fos_file=new FileOutputStream("D:\\workspace\\ideaworkspace\\test\\x.txt");//在一个已存在的test文件夹创建一个x.txt文件,如果存在且可write,会直接覆盖，不存在将创建
      String str="中华人民共和国万岁!";//创建字符串内容
      byte[] by =str.getBytes();//将字符串内容转换为字节码数组
      fos_file.write(by);//将字节码数组写入文件
      fos_file.close();//关闭输出流
      System.out.println("文件创建成功！");
    } catch (IOException e) {
      System.out.println("找不到指定的路径或没有权限操作！");
    }

  }
}
