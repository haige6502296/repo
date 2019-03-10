package com.lct;
/*Created by amau at 2019-07-24) 22:07;
Description: 好好理解这个例子;
*/

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDaoExtractor {
  private JdbcTemplate jdbcTemplate;

  //使用java1.8新功能lambda表达匿名类,下面注释掉的是原始的写法
  public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  List<Employee> getAllEmployees() {
    return jdbcTemplate.query("select * from employee", resultSet -> {
      List<Employee> list = new ArrayList<>();
      while (resultSet.next()) {
        Employee e = new Employee();
        e.setId(resultSet.getInt(1));
        e.setName(resultSet.getString(2));
        e.setSalary(resultSet.getInt(3));
        list.add(e);
      }
      return list;
    });
  }
}
/*  public List<Employee> getAllEmployees() {
    return jdbcTemplate.query("select * from employee", new ResultSetExtractor<List<Employee>>() {
      @Override
      public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
        List<Employee> list = new ArrayList<Employee>();
        while (rs.next()) {
          Employee e = new Employee();
          e.setId(rs.getInt(1));
          e.setName(rs.getString(2));
          e.setSalary(rs.getInt(3));
          list.add(e);
        }
        return list;
      }
    });
  }
}*/

