/*
Use:
Author:Amaru
Time:2019-11-24 20:56:37
Detail:
*/

package com.Exception;

class  InvalidAgeException extends Exception{
  InvalidAgeException(String s){
    super(s);
  }
}


class CustomException {
private static void validate(int age) throws InvalidAgeException{
  if (age <18) {
    throw new  InvalidAgeException("Not valid age!");
  }else {
    System.out.println("welcome to vote!");
  }
}

  public static void main(String[] args) {
    try {
      validate(20);
    } catch (InvalidAgeException e) {
      e.printStackTrace();
    }
    System.out.println("rest of code....");
  }
}
