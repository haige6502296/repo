/*
Usage: develop a simple bank system
Author:Amaru
Time:2019-11-14 19:11:46
Detail:
*/

package com.others;

class Account {
  private int id;
  private String name;
  private float sum;

  //insert an user
  void insert(int id, String name, float sum) {
    this.id = id;
    this.name = name;
    this.sum = sum;
  }

  //deposit money
  void deposit(float increase) {
    sum = sum + increase;
    System.out.println(increase + " deposit into your account.");
  }

  //withdraw money
  void withdraw(float reduce) {
    if (sum < reduce) {
      System.out.println("Insufficient balance.");
    } else {
      sum = sum - reduce;
      System.out.println(reduce + " is out from your account");
    }
  }

  //check balance
  void checkBalance() {
    System.out.println("your balance are:" + sum);
  }

  //check account
  void display(int id) {
    System.out.println("id为" + id + "，用户名：" + name + ",余额为：" + sum);
  }
}

public class BankAccount {
  public static void main(String[] args) {
    Account account = new Account();
    System.out.println();
    account.insert(100, "Tom", 80000);
    account.display(100);
    System.out.println();
    account.deposit(53000);
    System.out.println();
    account.withdraw(24000);
    System.out.println();
    account.checkBalance();
    System.out.println();
    account.display(100);
    System.out.println();
    account.withdraw(3500);
    System.out.println();
    account.display(100);

  }
}
