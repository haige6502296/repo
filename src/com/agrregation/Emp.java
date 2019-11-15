/*
Usage:Understanding meaningful example of Aggregation
Author:Amaru
Time:2019-11-15 23:50:23
Detail:In this example, Employee has an object of Address, address object contains its own information such as city, state, country etc. In such case relationship is Employee HAS-A address.
*/

package com.agrregation;

class Emp {
  private int id;
  private String name;
  private Address address;

  private Emp(int id, String name, Address address) {
    this.id = id;
    this.name = name;
    this.address = address;
  }
  private void display(){
    System.out.println("编号+姓名："+id+","+name);
    System.out.println("地址情况："+address.zipcode+","+address.city+","+address.state+","+address.country);
  }

  public static void main(String[] args) {
    Address address1=new Address(657898, "Los Angeles", "up", "USA");
    Address address2=new Address(625333, "Hongkong", "up", "CN");
    Emp emp1=new Emp(100, "Rose", address1);
    Emp emp2=new Emp(99, "Chouyun Fat", address2);
    emp1.display();
    System.out.println();
    emp2.display();
  }
}
