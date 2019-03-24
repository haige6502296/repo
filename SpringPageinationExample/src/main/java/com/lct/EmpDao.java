package com.lct;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class EmpDao {
   private JdbcTemplate jtp;

  public void setJtp(JdbcTemplate jtp) {
    this.jtp = jtp;
  }

  List<Emp> getEmployeesByPage(int pageid, int total) {//pageid表示每页的首行数据ID值，total每页的数据条数
    String sql = "SELECT * FROM emp100 LIMIT /*LIMIT后面的空格不能少了*/" + (pageid - 1) + "," + total;
    return jtp.query(sql, (rs, rowNum) -> {
      Emp emp = new Emp();
      emp.setId(rs.getInt(1));
      emp.setName(rs.getString(2));
      emp.setSalary(rs.getFloat(3));
      return emp;
    });
  }
}
