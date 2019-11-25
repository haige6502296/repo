/*
Use:
Author:Amaru
Time:2019-11-24 14:21:08
Detail:There are three ways to write regex example in java
*/

package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexExample {
  public static void main(String[] args) {

    //1st way
    Pattern p = Pattern.compile(".s");//
    Matcher m = p.matcher("ass");
    boolean b = m.matches();

    //2nd way
    boolean b2 = Pattern.compile(".s").matcher("ass").matches();

    //3rd way
    boolean b3 = Pattern.matches(".s", "ass");
    System.out.println(b + " " + b2 + " " + b3);

  }
}
