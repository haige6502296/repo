package com.lct;
/**
 * Created by amau at 2019-22-25 21:22;
 * Description: 难点是语句的拼接;
 */
import org.springframework.jdbc.core.JdbcTemplate;

public class Dao {
  private JdbcTemplate jdbcTemplate;

  public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }
int insertData(Employee e){
    String sql="insert into employee values('"+e.getId()+"','"+e.getName()+"','"+e.getSalary()+"')";
    return jdbcTemplate.update(sql);
}
void updateData(Employee e){
    String sql="update employee set name='"+e.getName()+"',salary='"+e.getSalary()+"' where id='"+e.getId()+"' ";
  jdbcTemplate.update(sql);
}
void deleteData(Employee e){
    String sql="delete FROM employee where id='"+e.getId()+"'";
  jdbcTemplate.update(sql);
}
}
