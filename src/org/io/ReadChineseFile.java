/*
Use:how to read Chinese File
Author:Amaru
Time:2019-12-01 14:12:23
Detail:File--->FileInputStream--->BufferedInputStream--->InputStreamReader--->BufferedReader-->ready()===>StringBuilder-->append()-->(char)bufferReader-->read();
*/

package org.io;

import java.io.*;

class ReadChineseFile {
  public static void main(String[] args) {
    try {

      FileInputStream fileInputStream = new FileInputStream("D:\\workspace\\ideaworkspace\\test\\代码.java");//创建x.txt文件读取的输入流
      BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);//创建一个缓存输入流
      InputStreamReader inputStreamReader = new InputStreamReader(bufferedInputStream);//创建一个输入流读取器
      BufferedReader bufferedReader = new BufferedReader(inputStreamReader);//创建一个缓存读取器

      StringBuilder stringBuilder = new StringBuilder();//创建一个StringBuilder变量来接收读取的内容

      while (bufferedReader.ready()) {//只要还有内容
        stringBuilder.append((char) bufferedReader.read());//将读到的内容存入StringBuilder对象并转换为字符形式
      }
      System.out.println(stringBuilder.toString());//将StringBuilder对象的内容转换为字符串

      bufferedInputStream.close();//关闭缓存输出流
      fileInputStream.close();//关闭文件输出流
      inputStreamReader.close();//关闭输出流读取器
      bufferedReader.close();//关闭缓存读取器

    } catch (IOException e) {
      System.out.println("读取失败！");
    }
  }
}
