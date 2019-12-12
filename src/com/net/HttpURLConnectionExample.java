/*
Use:
Author:Amaru
Time:2019-12-10 22:34:11
Detail:
*/

package com.net;

import java.net.*;

class HttpURLConnectionExample {
  public static void main(String[] args) {
    try{
      URL url=new URL("https://www.hao123.com/mid?from=shoubai&key=9070584875763908658&type=rec");
      HttpURLConnection huc=(HttpURLConnection)url.openConnection();
      for(int i=1;i<=5;i++){
        System.out.println(huc.getHeaderFieldKey(i)+" = "+huc.getHeaderField(i));
      }
      huc.disconnect();
    }catch(Exception e){System.out.println(e);}
  }
}
