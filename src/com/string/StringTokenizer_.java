/*
Use:
Author:Amaru
Time:2019-11-24 00:19:53
Detail:
StringTokenizer is a legacy class that is retained for compatibility reasons although its use is discouraged in new code. It is recommended that anyone seeking this functionality use the split method of String or the java.util.regex package instead.
The following example illustrates how the String.split method can be used to break up a string into its basic tokens:
       String[] result = "this is a test".split("\\s");//"\\s"转义字符空格键，出于兼容性需要保留了StringTokenizer这个类，一般鼓励使用split()加regex(Regular Expression)
       for (int x=0; x<result.length; x++)
           System.out.println(result[x]);

prints the following output:
       this
       is
       a
       test
*/

package com.string;

import java.util.StringTokenizer;

class StringTokenizer_ {
  public static void main(String[] args) {
    StringTokenizer st=new StringTokenizer("My,heart,will,go,on!"," ");
    // printing next token
  System.out.println("Next token is : " + st.nextToken(","));

  }
}
