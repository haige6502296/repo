package com.lct;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.sql.PreparedStatement;
import java.util.HashMap;
import java.util.Map;

public class Dao {
NamedParameterJdbcTemplate npjtp;

  public void setNpjtp(NamedParameterJdbcTemplate npjtp) {
    this.npjtp = npjtp;
  }

  public Dao(NamedParameterJdbcTemplate npjtp) {
    this.npjtp = npjtp;
  }
  public void insertData(Employee e){
    String sql="insert into employee values(:id,:name,:salary) ";
    Map<String,Object> map=new HashMap<>();
    map.put("id",e.getId());
    map.put("name",e.getName());
    map.put("salary", e.getSalary());

    //好简洁!!!不太好理解原理
    npjtp.execute(sql, map, (PreparedStatementCallback<Object>) PreparedStatement::executeUpdate);
  }
}
