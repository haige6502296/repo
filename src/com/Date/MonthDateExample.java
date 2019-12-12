/*
Use:
Author:Amaru
Time:2019-12-11 23:01:31
Detail:
*/

package com.Date;

import java.time.MonthDay;
import java.time.OffsetTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;

class MonthDateExample {
  public static void main(String[] args) {
    MonthDay monthDay=MonthDay.now();
    boolean b = monthDay.isValidYear(1000);
    System.out.println(b);
    long n = monthDay.get(ChronoField.MONTH_OF_YEAR);//返回月份数
    System.out.println(n);

    MonthDay month = MonthDay.now();
    ValueRange r1 = month.range(ChronoField.MONTH_OF_YEAR);//返回本年到月数范围
    System.out.println(r1);
    ValueRange r2 = month.range(ChronoField.DAY_OF_MONTH);//返回本月的天数日期范围
    System.out.println(r2);

    System.out.println("----------------------------------------------------------------");
    OffsetTime offset = OffsetTime.now();
    int h = offset.get(ChronoField.HOUR_OF_DAY);
    System.out.println(h);
    int m = offset.get(ChronoField.MINUTE_OF_DAY);
    System.out.println(m);//此刻是今天到多少分钟
    int s = offset.get(ChronoField.SECOND_OF_DAY);
    System.out.println(s);
  }
}
