/*
Use:
Author:Amaru
Time:2019-12-04 21:50:28
Detail:
*/

package org.io;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

class FormatExample {
  public static void main(String[] args) {
    Date date=new Date();
    SimpleDateFormat simpleDateFormat=new SimpleDateFormat("今天是yyyy-MM-dd E hh:mm:ss，是yyyy年的第DD天，在该月是第dd天");
    System.out.println(simpleDateFormat.format(date));
    int i = 2;
    double r = Math.sqrt(i);
    System.exit(1);

    System.out.format("The square root of %d is %f.%n", i, r);
    String result1 = String.format("小明今年%d岁,他住在%s,他的月工资有%.2f", 25,"北京市",6633.435);
    System.out.println(result1);//输出:小明今年25岁,他住在北京市,他的月工资有6633.44

    double num = 123.4567899;
    String result2 = String.format("%e", num);
    System.out.println(result2);//输出：1.234568e+02
  }
}
