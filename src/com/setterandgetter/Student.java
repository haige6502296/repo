/*Encapsulation
Usage:setter and getter and Object clone();
Author:Amaru
Time:2019-11-18 23:58:51
Detail:getter and setter
*/

package com.setterandgetter;

class Student implements  Cloneable{
  private int id;
private String name;

  private int getId() {
    return id;
  }

  private void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
private void showMsg(){
  System.out.println(this.getId()+" "+this.getName());
  }
public Object clone() throws CloneNotSupportedException {
    return super.clone();
}
  public static void main(String[] args) {
    Student student=new Student();
    student.setId(18);
    student.setName("libai");
    student.showMsg();
    System.out.println(student.getClass());
    try {
      Student student_clone=(Student)student.clone();
      student_clone.showMsg();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
  }
}
