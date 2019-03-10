package com.lct;
/*Created by amau at 2019-07-24) 22:07;
Description: 好好理解这个例子;
*/


import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
public class EmployeeDao {
  private JdbcTemplate jdbcTemplate;


  public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

//  这个RowMapper和ResultsetExtractor相比更加简洁,不用条件循环
   List<Employee> getAllEmployeesRowMapper() {
    return jdbcTemplate.query("select * from employee", (rs, rowNum) -> {
      Employee e = new Employee();
      e.setId(rs.getInt(1));
      e.setName(rs.getString(2));
      e.setSalary(rs.getFloat(3));
      return e;
    });
  }
}


