package com.lct;

public class Calculation {
  private int number;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  private String name;

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }
  public int cube(){
    return number*number*number;
  }
}
