/*
Use:simple Socket
Author:Amaru
Time:2019-12-10 21:23:45
Detail:
*/

package com.net;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

class MyServer {
  public static void main(String[] args) throws Exception {
    try {
      ServerSocket ss = new ServerSocket(7777);
      Socket s = ss.accept();//establishes connection
      DataInputStream dis = new DataInputStream(s.getInputStream());
      String str = dis.readUTF();
      System.out.println("message= " + str);
      ss.close();
    } catch (Exception e) {System.out.println(e);}
  }
}