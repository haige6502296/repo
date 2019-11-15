package com.others;

/*Anonymous simply means nameless. An object which has no reference is known as an anonymous object. It can be used at the time of object creation only.
If you have to use an object only once, an anonymous object is a good approach. For example:*/
public class Anonymous {
  private void factorial(int n) {
    long fact = 1;
    for (int i = 1; i <= n; i++) {
      fact *= i;
    }
    System.out.println("Factorial of n is:" + fact);
  }
  public static void main(String[] args) {
    new Anonymous().factorial(5);//calling method with anonymous object
  }
}

