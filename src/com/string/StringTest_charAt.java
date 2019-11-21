/*
Use:String class,StringBuffer class
Author:Amaru
Time:2019-11-20 23:33:42
Detail:vNote: String objects are stored in a special memory area known as the "string constant pool"
The Java String is immutable which means it cannot be changed. Whenever we change any string, a new instance is created. For mutable strings, you can use StringBuffer and StringBuilder classes.
*/
package com.string;

class StringTest_charAt {

  public static void main(String[] args) {



/*    //判断是否回文可以使用 StringBuffer 类的 reverse()方法
    String string="上海自来水来自海上";
    StringBuffer stringBuffer=new StringBuffer(string);
    StringBuffer stringBuffer2=stringBuffer.reverse();

    String stringBuffer2ChangeString=stringBuffer2.toString();
    System.out.println(string.equals(stringBuffer2ChangeString));*/




 /*   String s1="Java is a programming language. Java is a platform. Java is an Island.";
    String replaceString=s1.replace("Java","AAA");//replaces all occurrences of "Java" to "Kava"
    System.out.println(replaceString);
    StringBuffer stringBuffer=new StringBuffer(s1);
    System.out.println(stringBuffer.capacity());*/


 /*   String str1 = "string";
    String str2 = new String("string");
    String str3 = str2.intern();
    *//*第一个判断，因为str1指向的是常量池中的字符串常量，str2是在堆中生成的对象，所以str1==str2返回false。
第二个判断，str2调用intern()，会先在常量池中找是否有"string"字符串，池中已经有了（创建str1时添加的），所以直接返回该字符串的引用，str1和str3引用的是同一个，因此为true。*//*
    System.out.println(str1==str2);
    System.out.println(str1==str3);*/



/*    String string="welcome,Bob!";
    System.out.println(string.charAt(string.length()-1));
    String string1="Welcome,Bob!";
    System.out.println(string.equalsIgnoreCase(string1));*/


/*    String s1="Sachin";
    String s2="Sachin";
    String s3=new String("Sachin");
    System.out.println(s1.equals(s2));//true (because both refer to same instance)
    System.out.println(s1.equals(s3));//false(because s3 refers to instance created in nonpool)*/
/*String a,b;
    a="abcdef";
    b="abcdefghij";
    System.out.println(a.compareTo(b));
    String s=50+30+"Sachin"+40+30;
    System.out.println(s);//80Sachin4040,Note: After a string literal, all the + will be treated as string concatenation operator.*/

/*    String s="  Sachb   in  ";
    System.out.println(s.trim());//  消除字符串前后的空格,不消除中间的空格
char x='a';
char y='A';
    System.out.println((int)+x);
    System.out.println((int)+y);
  }*/


/*public static void main(String[] args) {
  String str = "Welcome to learning portal";
  int strLength = str.length();
  // Fetching first character
  System.out.println("Character at 0 index is: "+ str.charAt(0));
  // The last Character is present at the string length-1 index
  System.out.println("Character at last index is: "+ str.charAt(strLength-1));
}*/
  }
}