package com.lct;

public class Employee {
private int eid;
private String name,email;
private Address address;

  public int getEid() {
    return eid;
  }

  public void setEid(int eid) {
    this.eid = eid;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

   void setEmail(String email) {
    this.email = email;
  }

  public Address getAddress() {
    return address;
  }

   void setAddress(Address address) {
    this.address = address;
  }
}
