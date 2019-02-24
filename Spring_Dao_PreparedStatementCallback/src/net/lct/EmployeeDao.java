package net.lct;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDao {
  private JdbcTemplate jdbctemplate;

  public void setJdbctemplate(JdbcTemplate jdbctemplate) {
    this.jdbctemplate = jdbctemplate;
  }

  //编写一个预处理方法
  public boolean saveData(final Employee e) {
    String query = "insert into employee values(?,?,?)";

    /*下面new接口其实是生产一个匿名类(和接口名相同)临时用了就扔了*/
    return jdbctemplate.execute(query, new PreparedStatementCallback<Boolean>() {

     //重写PreparedStatementCallback接口的doInPreparedStatement方法
      public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {

        //原接口并没有下面这些语句所以是叫覆盖重写该方法
        ps.setInt(1, e.getId());
        ps.setString(2, e.getName());
        ps.setFloat(3, e.getSalary());


        return ps.execute();
      }
    });
  }
}
