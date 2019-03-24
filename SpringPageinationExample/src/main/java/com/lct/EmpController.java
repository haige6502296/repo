package com.lct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class EmpController {
private final EmpDao dao;

  @Autowired
  public EmpController(EmpDao dao) {
    this.dao = dao;
  }

  @RequestMapping(value = "/viewemp/{pageFirstRowDataId}")//这个pageFirstRowDataId必须和下面方法中的参数一致
  public String edit(@PathVariable int pageFirstRowDataId, Model m){
  int total=5;//每页的数据有几行
    if (pageFirstRowDataId != 1) {
      pageFirstRowDataId=(pageFirstRowDataId-1)*total+1;//这个total控制从该页第几个开始组成下一页，比如这行total等于3，那么第一页正常
      // ，分别是1-5行的数据，到第二页就会从第一页的4行数据开始成为第二页的首行数据，这样就不正常了，
    }
    System.out.println("pageid表示每行的首条数据的id："+pageFirstRowDataId);//pageid原来是每页首行数据的id值
    System.out.println();
    System.out.println();

//将Dao得到的数据加载到Model里面
  List<Emp> list=dao.getEmployeesByPage(pageFirstRowDataId,total);
  m.addAttribute("message", list);
  return "viewemp";
}
}
