/*
Use:
Author:Amaru
Time:2019-12-04 20:09:28
Detail:
*/

package org.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

class ScannerExample {
  public static void main(String[] args) {
    double sum = 0;
    try (
            FileReader fileReader = new FileReader("D:/workspace/ideaworkspace/test/z.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            Scanner scanner = new Scanner(bufferedReader);
    ) {
      scanner.useLocale(Locale.US);
      while (scanner.hasNext()) {
        if (scanner.hasNextDouble()) {
          sum += scanner.nextDouble();
        } else {
          System.out.println(scanner.next());
        }
      }
      System.out.println(sum);
    } catch (IOException e) {
      System.out.println("操作失败！" + e);
    }
  }
}