/*
Usage:Dynamic binding
Author:Amaru
Time:2019-11-17 19:32:25
Detail:The type of object is determined at run-time,it is known as dynamic binding
*/

package com.polymorphism.bind;

class Bottle2 {
void showColor(){
  System.out.println("bottle must have it's color");
}
}
class PlasticBottle extends Bottle2{
  void showColor(){
    System.out.println("Plastic bottles is white");
  }

  public static void main(String[] args) {
    Bottle2 bottle2;
    bottle2=new PlasticBottle();
    bottle2.showColor();
  }
}

/*In the above of example object type can't be determined by the  compiler,because the instance of the PlasticBottle is also an instance of Bottle2,so compiler doesn't know its type,only its base type
*/