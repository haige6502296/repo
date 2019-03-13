package com.lct;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController2 {
  @RequestMapping("/hello2")
  public String display()
  {
    /*这里的viewjsp2一定有相应的页面呼应，比如view文件夹里面是viewpage2,肯定显示404错误，
    * 这个错误卡了很久一致没有找到原因*/
    return "viewjsp2";
  }
}