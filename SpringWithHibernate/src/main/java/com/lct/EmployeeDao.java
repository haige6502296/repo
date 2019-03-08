package com.lct;

import org.springframework.orm.hibernate5.HibernateTemplate;

import java.util.List;

public class EmployeeDao {
  private HibernateTemplate htp;

  public void setHtp(HibernateTemplate htp) {
    this.htp = htp;
  }

  //  save employee
   void saveEmployee(Employee e) {
    htp.save(e);
  }

  //  update employee
  void updateEmployee(Employee e) {
    htp.update(e);
  }

  //  delete employee
  public void deleteEmployee(Employee e) {
    htp.delete(e);
  }

//  persist
  public void persistEmployee(Employee e){
    htp.persist(e);
  }
  //  method to return one employee of given id
  public Employee getById(int id) {
    return htp.get(Employee.class, id);
  }

  //  method to return all employees
  public List<Employee> getEmployee() {
    List<Employee> list;
    list = htp.loadAll(Employee.class);
    return list;
  }
}
