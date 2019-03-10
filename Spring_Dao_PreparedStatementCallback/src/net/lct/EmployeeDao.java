package net.lct;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

public class EmployeeDao {
  private JdbcTemplate jdbctemplate;

  public void setJdbctemplate(JdbcTemplate jdbctemplate) {
    this.jdbctemplate = jdbctemplate;
  }

  //编写一个插入数据的方法
  void insertData(final Employee e) {//final:不允许被继承
    String query = "insert into employee values(?,?,?)";
    jdbctemplate.execute(query, (PreparedStatementCallback<Boolean>) ps -> {
      //原接口并没有下面这些语句所以是叫覆盖重写该方法
      ps.setInt(1, e.getId());
      ps.setString(2, e.getName());
      ps.setFloat(3, e.getSalary());
      return ps.execute();
    });
  }

  //编写一个修改数据的方法
  void updateData(final Employee e) {
    String sql = "update employee set name=?,salary=? where id=?";
//把Boolean写成了boolean,编译不通过,气死
    jdbctemplate.execute(sql,(PreparedStatementCallback<Boolean>) ps->{
      ps.setString(1, e.getName());
      ps.setFloat(2, e.getSalary());
      ps.setInt(3, e.getId());
      return ps.execute();
    });
  }

  //编写一个删除数据的方法
  void deleteData(final Employee e){
    String sql="delete from employee where id=?";
    jdbctemplate.execute(sql,(PreparedStatementCallback<Boolean>) ps->{
      ps.setInt(1, e.getId());
      return ps.execute();
    });
  }
// 编写一个查询数据的方法
  void selectData( Employee e){
    String sql="select * from employee where id between 1 and ?";
    jdbctemplate.execute(sql,(PreparedStatementCallback<Boolean>) ps->{
      ps.setInt(1,e.getId());
      return ps.execute();
    });
  }






}
