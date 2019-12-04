/*
Use:
Author:Amaru
Time:2019-12-02 23:21:55
Detail:
*/

package org.io;


import java.io.ObjectStreamClass;
import java.io.ObjectStreamField;
import java.util.Calendar;

class ObjectStreamClassExample {
  public static void main(String[] args) {
  /*  // create a new object stream class for Integers
    ObjectStreamClass osc = ObjectStreamClass.lookup(SmartPhone.class);

    ObjectStreamField[] ob=osc.getFields();
    for (ObjectStreamField objectStreamField : ob) {
      System.out.println(objectStreamField);
    }
  *//*  // get the value field from ObjectStreamClass for integers
    System.out.println("" + osc.getField("price"));*//*
    // create a new object stream class for Calendar
    ObjectStreamClass osc2 = ObjectStreamClass.lookup(String.class);
    // get the Class instance for osc2
    System.out.println("" + osc2.getField("hash"));*/


    // create a new object stream class for Integers
    ObjectStreamClass osc = ObjectStreamClass.lookup(String.class);

    // get the value field from ObjectStreamClass for integers
    System.out.println("" + osc.getField("value"));

    // create a new object stream class for Calendar
    ObjectStreamClass osc2 = ObjectStreamClass.lookup(Calendar.class);

    // get the Class instance for osc2
    System.out.println("" + osc2.getField("isTimeSet"));
  }
}
