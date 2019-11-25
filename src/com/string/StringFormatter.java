/*
Use:
Author:Amaru
Time:2019-11-24 00:48:20
Detail:
*/

package com.string;

public class StringFormatter {
  public static String reverseToggle(String str) {
    String words[] = str.split("\\s");
    String reverseToggle = "";
    for (String w : words) {
      StringBuilder sb = new StringBuilder(w);
      sb.reverse();
      String first = sb.substring(0, 1);//取数组里每个字符串的首字母
      String afterfirst = sb.substring(1);//每个字符串第二个字符开始到结束的所有字符
      reverseToggle =reverseToggle+ first.toLowerCase() + afterfirst.toUpperCase() + " ";
      System.out.println(reverseToggle);
      System.out.println("你"+reverseToggle.trim());
    }
    return reverseToggle.trim();

  }

  public static void main(String[] args) {
    System.out.println(StringFormatter.reverseToggle("my name is khan"));
    System.out.println(StringFormatter.reverseToggle("I am sonoo jaiswal"));
  }
}
