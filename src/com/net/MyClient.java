/*
Use:
Author:Amaru
Time:2019-12-10 21:28:00
Detail:
*/

package com.net;

import java.io.DataOutputStream;
import java.net.Socket;

class MyClient {
  public static void main(String[] args) {
    try (
            Socket s = new Socket("localhost", 7777);
            DataOutputStream dataOutputStream = new DataOutputStream(s.getOutputStream())) {
      dataOutputStream.writeUTF("message:Hello,MyServer");
      dataOutputStream.flush();

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
