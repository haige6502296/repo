/*
Use:
Author:Amaru
Time:2019-12-11 18:55:14
Detail:
*/

package com.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class MyJavap {
  public static void main(String[] args) throws Exception{
    Class c = Class.forName("java.io.BufferedInputStream");
    System.out.println("Fields...................");

    Field[] f = c.getDeclaredFields();
    for (Field field : f) {
      System.out.println(field);
    }

    System.out.println("Constructors....................");
    Constructor[] con=c.getDeclaredConstructors();
    for (Constructor constructor : con) {
      System.out.println(constructor);
    }

    System.out.println("Methods..................." );
    Method []m=c.getDeclaredMethods();
    for (Method method : m) {
      System.out.println(method);
    }

  }
}
