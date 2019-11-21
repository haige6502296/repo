/*
Use:
Author:Amaru
Time:2019-11-21 23:05:47
Detail:
*/

package com.string;

class Print_a_z_And_A_Z {

  private void print_aToz_AToZ() {
    for (int i = 65; i < 91; i++) {
      if (i < 90) {
        System.out.print((char) i + ",");
      } else System.out.println((char) +i + ".");
    }
    System.out.println();
    for (int i = 97; i < 123; i++) {
      if (i < 122) {
        System.out.print((char) i + ",");
      } else System.out.println((char) +i + ".");
    }
  }

  public static void main(String[] args) {
    Print_a_z_And_A_Z print_a_z_and_a_z = new Print_a_z_And_A_Z();
    print_a_z_and_a_z.print_aToz_AToZ();
  }
}
