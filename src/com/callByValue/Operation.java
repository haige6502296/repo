/*
Use:
Author:Amaru
Time:2019-11-20 22:40:13
Detail:
*/

package com.callByValue;

class Operation {
int data=50;//这是实例变量，和下面的data无关
void change(int data){
  data=data+100;//changes will be in the local variable only
  System.out.println("局部变量的data值为： "+data);
}

  public static void main(String[] args) {
    Operation operation=new Operation();
    System.out.println("实例变量data的值为："+operation.data);
    operation.change(200);
    operation.change(5000);
    System.out.println("实例变量data的值仍为："+operation.data);
  }
}
