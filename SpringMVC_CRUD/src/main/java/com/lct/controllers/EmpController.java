package com.lct.controllers;

import com.lct.beans.Emp;
import com.lct.dao.EmpDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class EmpController {
//Will inject Dao from xml file

  private final EmpDao dao;

  @Autowired
  public EmpController(EmpDao dao) {
    this.dao = dao;
  }

  /*It displays a form to input data, here "command" is a reserved request attribute
   *which is used to display object data into form
   */
  @RequestMapping("empform")//大小写不对也会导致打不开网页
  public String showForm(Model m) {
    m.addAttribute("command", new Emp());
    return "empform";
  }

  /*It saves object into database. The @ModelAttribute puts request data
   *  into model object. You need to mention RequestMethod.POST method
   *  because default request is GET*/
  @RequestMapping(value = "/save", method = RequestMethod.POST)
  public String save(@ModelAttribute("emp") Emp emp) {
    dao.save(emp);
    return "redirect:/viewemp";//will redirect to viewemp request mapping
  }

  /* It provides list of employees in model object */
  @RequestMapping("/viewemp")
  public String viewemp(Model m) {
    List<Emp> list = dao.getEmployees();
    m.addAttribute("list", list);
    return "viewemp";
  }

  /* It displays object data into form for the given id.
   * The @PathVariable puts URL data into variable.*/
  @RequestMapping(value = "/editemp/{id}")
  public String edit(@PathVariable int id, Model m) {
    Emp emp = dao.select(id);
    m.addAttribute("command", emp);
    return "empeditform";
  }

  /* It updates model object. */
  @RequestMapping(value = "/editsave", method = RequestMethod.POST)
  public String editsave(@ModelAttribute("emp") Emp emp) {
    dao.update(emp);
    return "redirect:/viewemp";
  }

  /* It deletes record for the given id in URL and redirects to /viewemp */
  @RequestMapping(value = "/deleteemp/{id}", method = RequestMethod.GET)
  public String delete(@PathVariable int id) {
    dao.delete(id);
    return "redirect:/viewemp";
  }
}
