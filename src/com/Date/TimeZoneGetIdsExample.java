/*
Use:Use PrintWriter write TimeZone ids into the "timezone.txt"
Author:Amaru
Time:2019-12-11 21:56:41
Detail:note：how to write String arrays into  text file.
*/

package com.Date;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.TimeZone;

class TimeZoneGetIdsExample {
  public static void main(String[] args) {
    String[] ids = TimeZone.getAvailableIDs();
    File file = new File("D:/timezone.txt");
    try (PrintWriter pw = new PrintWriter(file)) {
      for (String id : ids) {
        pw.printf("%s%n",id);//格式化写入
      }
      System.out.println("Wrote Successfully!");
    }catch (IOException e){
      System.out.println("Wrote Failed."+e);
    }
  }
}
