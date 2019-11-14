/*
public class BasicKnowledge {
  public static void main(String[] args) {

    int a = 15;
    int b = -15;
    int x=~0b11_111_111_111_111_111_111_111_111_110_101;//二进制写法
    int m=0;

    System.out.println("a=10的二进制为："+Integer.toBinaryString(a));
    System.out.println("a=~10的二进制为："+Integer.toBinaryString(~a));
    System.out.println("a=-10的二进制为："+Integer.toBinaryString(b));
    System.out.println("a=~-10的二进制为："+Integer.toBinaryString(~b));
    System.out.println("m=0补码："+~m);
    System.out.println("二进制x的打印结果："+x);
    boolean c = true;
    boolean d = false;
    System.out.println();
    System.out.println(~a);
    System.out.println(~b);
    System.out.println(!c);
    System.out.println(!d);
  }
}
*/
/*class BasicKnowledge {
  public static void main(String[] args) {
    *//*   System.out.println("a=10的二进制为："+Integer.toBinaryString(10));*//*
*//*    System.out.println(10<<2);//10*2^2=10*4=40
    System.out.println("a=40的二进制为："+Integer.toBinaryString(40));*//*
*//*    System.out.println(10<<3);//10*2^3=10*8=80
    System.out.println(20<<2);//20*2^2=20*4=80
    System.out.println(15<<4);//15*2^4=15*16=240
    System.out.println(10>>2);//10/2^2=10/4=2
    System.out.println("a=20的二进制为："+Integer.toBinaryString(20));
    System.out.println(20>>>2);//*//*
*//*    System.out.println("a=-10的二进制为："+Integer.toBinaryString(-10));
    System.out.println("a=~10为："+(~10));
    System.out.println("~42="+(~42));
    System.out.println("10按位取反再加1得到："+((~10)+1));*//*

//判断某年是否为闰年
    int year;
    int count_leap = 0;
    int count_not_leap = 0;

    for (year = 2020; year <= 2300; year++) {

      if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
        System.out.print(year + "===是闰年！");
        count_leap += 1;
        System.out.println("是2020年-" + year + "年第==" + count_leap + "个闰年。");
      } else {
        System.out.print(year + "---不是闰年！");
        count_not_leap += 1;
        System.out.println("是2020年-" + year + "第" + count_not_leap + "个非闰年！");
      }
    }
  }
}*/
class BasicKnowledge{
  public static void main(String[] args) {
    int number;
    for(number=180;number<201;number++){
      //using ternary operator
      String output=(number%2==0)?"It's an even number.":"It's an odd number!";
      System.out.println(output);
    }
  }
}
