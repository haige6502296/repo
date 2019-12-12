/*
Use:
Author:Amaru
Time:2019-12-10 22:22:35
Detail:
*/

package com.net;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

class URLConnection {
  public static void main(String[] args) {
    try {
      URL url=new URL("https://www.javatpoint.com/spring-tutorial");
      java.net.URLConnection urlConnection=url.openConnection();
      InputStream inputStream=urlConnection.getInputStream();
      int i;
      while ((i=inputStream.read())!=-1){
        System.out.print((char )i);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
