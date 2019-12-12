/*
Use:
Author:Amaru
Time:2019-12-10 23:23:19
Detail:
*/

package com.AWT;

import java.awt.*;

class First extends Frame {
  private First() {
    Button b = new Button("click me");
    b.setBounds(30, 100, 80, 30);
    add(b);
    setSize(300, 300);
    setLayout(null);
    setVisible(true);
  }

  public static void main(String[] args) {
    new First();
  }
}
