/*
Use:
Author:Amaru
Time:2019-12-10 22:45:34
Detail:
*/

package com.net;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

class InetAddressExample {
  public static void main(String[] args) {

    try {
      System.out.println(InetAddress.getLocalHost());
//      System.out.println(InetAddress.getByName("www.baidu.com"));
//      System.out.println(Arrays.toString(InetAddress.getAllByName("www.hao123.com")));
      InetAddress ip=InetAddress.getByName("www.javatpoint.com");

      System.out.println("Host Name: "+ip.getHostName());
      System.out.println("IP Address: "+ip.getHostAddress());
    } catch (UnknownHostException e) {
      e.printStackTrace();
    }

  }
}
