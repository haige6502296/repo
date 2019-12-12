/*
Use:LocalDate and  LocaleTime
Author:Amaru
Time:2019-12-11 21:15:14
Detail:
*/

package com.Date;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.time.LocalDate;
import java.time.LocalTime;


class LocalDateExample {
  public static void main(String[] args) {
    LocalDate today=LocalDate.now();
    LocalDate yesterday=today.minusDays(1);
    LocalDate tomorrow=yesterday.plusDays(2);
    System.out.println(today.getDayOfWeek());
    LocalTime localTime=LocalTime.now();

    System.out.println(localTime.getHour()+":"+localTime.getMinute()+":"+localTime.getSecond());

    System.out.println("Today: "+today);
    System.out.println("Yesterday: "+yesterday);
    System.out.println("Tomorrow: "+tomorrow);
    if (today.isLeapYear()) {
      System.out.println("This year is leap year.");
    }else {System.out.println("This year isn't leap year.");}


    //reflection
    try {
      Class c=Class.forName("java.time.LocalDate");
      System.out.println("Field……");

      Field[] field=c.getDeclaredFields();
      for (Field f:field) {
        System.out.println(f);
      }
      Method[] method=c.getDeclaredMethods();
      for (Method m:method) {
        System.out.println(m);
      }

      Constructor [] constructor=c.getDeclaredConstructors();
      for (Constructor con:constructor) {
        System.out.println(con);
      }
    } catch (ClassNotFoundException e) {
      System.out.println("Exception occurred: "+e);
    }
  }
}
