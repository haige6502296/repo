/*
Use:Test the hashCode after changing the content between String and StringBuffer
Author:Amaru
Time:2019-11-23 18:49:32
Detail:String Object can't be change.But ,after changing ,StringBuffer or StringBuilder has their same hashcode of themselves
*/

package com.string;

class StringCanNotBeChange {
  public static void main(String[] args) {

    String string="Lao ";
    System.out.println("Before:   string's HashCode:"+string.hashCode());

    string=string+"Cable TV";
    System.out.println("After: String string's HashCode:"+string.hashCode());

    StringBuffer stringBuffer=new StringBuffer("Lao ");
    System.out.println("Before :stringBuffer's HashCode: "+stringBuffer.hashCode());
    stringBuffer.append("Cable TV!");
    System.out.println("After :stringBufer's HashCode:  "+stringBuffer.hashCode());

    StringBuilder stringBuilder=new StringBuilder("Lao ");
    System.out.println("Before: stringBuilder's HashCode: "+stringBuilder.hashCode());
    stringBuilder.append("Cable TV");
    System.out.println("After: stringBuilder's HashCode: "+stringBuilder.hashCode());
    System.out.println();
  }
}
