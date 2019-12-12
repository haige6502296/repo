/*
Use:
Author:Amaru
Time:2019-12-10 21:14:13
Detail:
*/

package com.net;

import java.io.*;
import java.net.Socket;

class Client {
  public static void main(String[] args) throws IOException {

    Socket s=new Socket("127.0.0.1",6666);
    DataInputStream din=new DataInputStream(s.getInputStream());
    DataOutputStream dout=new DataOutputStream(s.getOutputStream());
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

    String str="",str2="";
    while(!str.equals("stop")){
      str=br.readLine();
      dout.writeUTF(str);
      dout.flush();
      str2=din.readUTF();
      System.out.println("server said: "+str2);
    }
din.close();
    dout.close();
    s.close();
}
}