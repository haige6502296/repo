package com.lct.dao;

import com.lct.beans.Emp;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.List;

public class EmpDao {
 private JdbcTemplate jtp;

  public void setJtp(JdbcTemplate jtp) {
    this.jtp = jtp;
  }

  public int save(Emp emp) {
    String sql = "insert into emp99(name,salary,designation) values ('" + emp.getName() + "','" + emp.getSalary() + "','" + emp.getDesignation() + "');";
    return jtp.update(sql);
  }

  public void update(Emp emp) {
    String sql = "update emp99 set name='" + emp.getName() + "',salary='" + emp.getSalary() + "',designation='" + emp.getDesignation() + "' where id='" + emp.getId() + "';";
    jtp.update(sql);
  }

  public int delete(int id) {
    String sql = "delete from emp99 where id=" + id + ";";
    return jtp.update(sql);
  }
//查询出Emp对象
  public Emp select(int id) {
    String sql = "select * from emp99 where id=?";//不指定id值
//    return jtp.update(sql);
    return jtp.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<>(Emp.class));
  }

  //  已经被lambda替换
  /*public List<Emp>getEmployees(){
    String sql="select * from Emp99";
    return jtp.query(sql, new RowMapper<Emp>() {
      @Override
      public Emp mapRow(ResultSet rs, int rowNum) throws SQLException {
        Emp e=new Emp();
        e.setId(rs.getInt(1));
        e.setName(rs.getString(2));
        e.setSalary(rs.getFloat(3));
        e.setDesignation(rs.getString(4));
        return e;
      }
    });
  }*/

//  查询对象的属性，实际和上面的jtp.queryForObject()方法有关联的，没有上面的方法，程序无法正常运行
  public List<Emp> getEmployees() {
    String sql = "select * from Emp99";
    return jtp.query(sql, (rs, rowNum) -> {
      Emp e = new Emp();

//将数据库的数据附加在Emp类的e对象的属性上面
      e.setId(rs.getInt(1));
      e.setName(rs.getString(2));
      e.setSalary(rs.getFloat(3));
      e.setDesignation(rs.getString(4));
      return e;
    });
  }
}
