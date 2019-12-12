/*
Use:
Author:Amaru
Time:2019-12-11 19:25:37
Detail:
*/

package com.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class CallPrivateMethodWay {
  public static void main(String[] args) {
    try {
      Class<?> c = Class.forName("com.reflection.A");
      Object o= c.newInstance();
      Method m =c.getDeclaredMethod("message");
        m.setAccessible(true);
        m.invoke(o);


    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
      e.printStackTrace();
    }
  }
}
