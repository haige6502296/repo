/*
Use:capacity
Author:Amaru
Time:2019-11-22 20:02:14
Detail:自动扩容始终是(原始容量+1)*2
*/

package com.string;

class StringBuffer_ {
  public static void main(String[] args) {

    StringBuffer stringBuffer = new StringBuffer("3434343");//初始化容量为16+赋予的字符串数量7，所以就是23，后面按（23+1）*2，再后面就是(48+1)*2,类推
    System.out.println("1次长度："+stringBuffer.length());
    System.out.println("1次："+stringBuffer.capacity());
    stringBuffer.append("我d342432424322340");
    System.out.println("2次长度："+stringBuffer.length());
    System.out.println("2次："+stringBuffer.capacity());
    stringBuffer.append("我爱你");
    System.out.println("3次长度："+stringBuffer.length());
    System.out.println("3次："+stringBuffer.capacity());
    stringBuffer.append("123456789012345");
    System.out.println("4次长度："+stringBuffer.length());
    System.out.println("4次："+stringBuffer.capacity());
    stringBuffer.append("123456789012345");
    System.out.println("5次长度："+stringBuffer.length());
    System.out.println("5次："+stringBuffer.capacity());
    stringBuffer.append("12345678901234567890");
    System.out.println("6次长度："+stringBuffer.length());
    System.out.println("6次："+stringBuffer.capacity());

    stringBuffer.append("123343245466663sgfdghghghjh4444");
    System.out.println("7次长度："+stringBuffer.length());
    System.out.println("7次："+stringBuffer.capacity());

    stringBuffer.append("1233rwqerqrerrewqrewqrqewrqtretretw34324325");
    System.out.println("8次长度："+stringBuffer.length());
    System.out.println("8次："+stringBuffer.capacity());


/*    stringBuffer.append("你好");
    System.out.println("你好+w："+stringBuffer.capacity());
    stringBuffer.append("我爱你4567890123456");
    System.out.println(stringBuffer.capacity());*/
 /*   StringBuilder sb=new StringBuilder();
    System.out.println(sb.capacity());//default 16
    sb.append("Hello");
    System.out.println(sb.capacity());//now 16
    sb.append("java is my favourite language");
    System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2
    sb.ensureCapacity(10);//now no change
    System.out.println(sb.capacity());//now 34
    sb.ensureCapacity(50);//now (34*2)+2
    System.out.println(sb.capacity());//now 70*/

  }
}
