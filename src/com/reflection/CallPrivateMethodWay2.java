/*
Use:
Author:Amaru
Time:2019-12-11 20:43:28
Detail:
*/

package com.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class CallPrivateMethodWay2 {
  public static void main(String[] args) {
    try {
      Class<?>c=Class.forName("com.reflection.B");
      Object ob=c.newInstance();
      Method m=c.getDeclaredMethod("volume", String.class,int.class);
      m.setAccessible(true);
      m.invoke(ob, "cube",4);
    } catch (ClassNotFoundException | InvocationTargetException | NoSuchMethodException | InstantiationException | IllegalAccessException e) {
      e.printStackTrace();
    }
  }
}
