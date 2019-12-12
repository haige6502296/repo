/*
Use:必须在控制台才能正常编译运行
Author:Amaru
Time:2019-12-03 19:39:04
Detail:
*/

package org.io;

import java.io.Console;
import java.util.Arrays;

class ConsoleExample {
  public static void main(String[] args) {
/*    Console c=System.console();
    System.out.println("Enter the password");
    char[]ch=c.readPassword();
    String pass=String.valueOf(ch);
    System.out.println("Password is: ");
    System.out.println(pass);*/
    int[] arr= {1, 2};
    String str= Arrays.toString(arr);
    System.out.println(str);
    //因为Console对象是Singleton 类，只能拥有一个对象，所以不能同时运行
/*    Console c1=System.console();
    System.out.println("Enter the String:");
    String name=c.readLine();
    System.out.println("Welcome "+name);*/
  }
}
