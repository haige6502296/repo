package com.lct;

//定义了一个Student类，并没有创建内存空间，因为对象还没有
class Student{
  int rollno;
  String name;
  void insertRecord(int r, String n){
    rollno=r;
    name=n;
  }
  void displayInformation(){System.out.println(rollno+" "+name);}
}

class TestStudent4{
  public static void main(String[] args){
    Student s1=new Student();//new Student()是一个创造出来的对象，被s1这个变量引用了，所以s1是这个new Student()对象的一个引用变量，这个对象存在，但是没有数据
    System.out.println(s1);//堆内存已经分配了地址
    Student s2=new Student();//new Student()又是一个创造出来的对象，被s2这个变量引用了，所以s1是这个new Student()对象的一个引用变量,这个对象存在，但是没有数据
    s1.insertRecord(111,"Karan");// initializing the value to these objects by invoking the insertRecord method
    System.out.println("s1实例变量赋值后："+s1);// initializing the value to these objects by invoking the insertRecord method
    s2.insertRecord(222,"Aryan");// initializing the value to these objects by invoking the insertRecord method
    s1.displayInformation();// Here, we are displaying the state (data) of the objects by invoking the displayInformation() method.
    s2.displayInformation();// Here, we are displaying the state (data) of the objects by invoking the displayInformation() method.
  }
}
