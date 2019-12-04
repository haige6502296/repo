/*
Use:
Author:Amaru
Time:2019-12-04 23:22:18
Detail:
*/

package com.tool;

import java.util.Calendar;
import java.util.Formatter;
import java.util.Locale;
import java.util.TimeZone;

class LocaleExample {
  public static void main(String[] args) {
    Formatter formatter=new Formatter();
    //System.out.println TimeZone IDS
 /*   String[] ids = TimeZone.getAvailableIDs();
    for(String id: ids) {
      System.out.println(id+"--");
    }*/
    TimeZone timeZone = TimeZone.getTimeZone("Asia/Bangkok");
    Calendar calendar=Calendar.getInstance(timeZone);
    //时分秒12小时制
    System.out.printf("%tr",calendar);
    //时分秒24小时制
    System.out.printf("%tR",calendar);
    System.out.println();
    formatter.format("完整时间格式：%tc%n%tZ", calendar,calendar);//%n，分行
   System.out.println(formatter);//ICT:印度支那时间
//    System.out.println(formatter.format("时区：%tZ",calendar));

/*    String str=Integer.toBinaryString(25);
    formatter.format("Formatting %o is  very  difficult: %b  %f", 89,2,10.223);
    System.out.println(formatter+"二进制："+str);*/

    formatter.close();

    Formatter f1=new Formatter();
    f1.format("%(d", -100);
    System.out.println(f1);
    f1.close();
  }
}
