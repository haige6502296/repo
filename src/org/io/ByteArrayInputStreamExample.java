/*
Use:
Author:Amaru
Time:2019-12-02 19:11:52
Detail:
*/

package org.io;

import java.io.ByteArrayInputStream;

class ByteArrayInputStreamExample {
  public static void main(String[] args) {
    byte[] bt={34,35,36,37,38,39,40};
    ByteArrayInputStream bty=new ByteArrayInputStream(bt);
    int i=0;
    while((i=bty.read())!=-1){
      System.out.println("ASCII value of Character is: "+i+",and the Character is: "+(char)i);
    }
  }
}
