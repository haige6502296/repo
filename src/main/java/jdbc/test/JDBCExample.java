/*
Usage:jdbc
Author:Amau
Time:2019-12-20 23:29:09
 */
package jdbc.test;

import java.sql.*;

public class JDBCExample {
  public static void main(String[] args) {
    try {
      final String url = "jdbc:mysql://localhost:3306/emp";
      final String user = "amau";
      final String pw = "catv.com";
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection con = DriverManager.getConnection(url, user, pw);
      Statement st = con.createStatement();
      int rs = st.executeUpdate("insert into emp values (5,'harry',43,25678.20)");

      /*ResultSet rs=st.executeQuery("select * from emp)");
        while (rs.next()) {
        System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
      }*/

      con.close();
    } catch (ClassNotFoundException | SQLException e) {
      e.printStackTrace();
    }
  }
}
