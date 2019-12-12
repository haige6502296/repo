/*
Use:
Author:Amaru
Time:2019-12-05 19:58:25
Detail:data.txt无法直接读取
*/

package org.io;

import java.io.*;


class DataOutputStreamAndDataInputStream {
  private static final String dataFile = "D:\\workspace\\ideaworkspace\\test\\data.txt";
  private static final double[] price = {19.99, 9.99, 15.99, 3.99, 4.99};
  private static final int[] units = {12, 8, 13, 29, 50};
  private static final String[] description = {"将军", "Hello", "good", "general", "captain"};

  public static void main(String[] args) {
    try (
            FileOutputStream fileOutputStream = new FileOutputStream(dataFile);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            DataOutputStream dataOutputStream = new DataOutputStream(bufferedOutputStream);) {
      for (int i = 0; i < price.length; i++) {
        dataOutputStream.writeDouble(price[i]);
        dataOutputStream.writeInt(units[i]);
        dataOutputStream.writeUTF(description[i]);
      }
    } catch (IOException e) {
      System.out.println("写入失败！");
    }
    double price1 = 0;
    int units1 = 0;
    String description1 = null;
    double total1 = 0;
    try (
            FileInputStream fileInputStream = new FileInputStream(dataFile);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            DataInputStream dataInputStream = new DataInputStream(bufferedInputStream)
    ) {
      while (true) {
        price1 = dataInputStream.readDouble();
        units1 = dataInputStream.readInt();
        description1 = dataInputStream.readUTF();
        System.out.format("You ordered %d" + " units1 of %s at $%.2f%n",
                units1, description1, price1);
        total1 += units1 * price1;
        System.out.format("总费用：%.2f%n", total1);
      }
    } catch (EOFException e) {
      System.out.println("已到句末！");
    } catch (IOException e) {
      System.out.println("读取失败" + e);
    }
  }
}
