/*
Use:
Author:Amaru
Time:2019-12-11 21:49:22
Detail:
*/

package com.Date;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

class TimeZoneExample {
  public static void main(String... args) {
    ZoneId zone1 = null;
    ZoneId zone2 = null;
    try {
      zone1 = ZoneId.of("Asia/Bangkok");
      zone2 = ZoneId.of("Asia/Tokyo");
    } catch (Exception e) {
      e.printStackTrace();
    }
    assert zone1 != null;
    LocalTime time1 = LocalTime.now(zone1);
    System.out.println("Bangkok Time Zone: "+time1);
    assert zone2 != null;
    LocalTime time2 = LocalTime.now(zone2);
    System.out.println("Japan Time Zone: "+time2);
    long hours = ChronoUnit.HOURS.between(time1, time2);
    System.out.println("Hours between two Time Zone: "+hours);
    long minutes = ChronoUnit.MINUTES.between(time1, time2);
    System.out.println("Minutes between two time zone: "+minutes);
  }
}
