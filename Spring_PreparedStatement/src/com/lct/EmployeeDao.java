package com.lct;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;



public class EmployeeDao {
  private JdbcTemplate jdbcTemplate;

  public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

boolean saveData(final Employee e) {
    return jdbcTemplate.execute("insert into employee values(?,?,?)", (PreparedStatementCallback<Boolean>) ps -> {
      ps.setInt(1, e.getId());
      ps.setString(2, e.getName());
      ps.setFloat(3, e.getSalary());
      return ps.execute();
    });
  }
}
