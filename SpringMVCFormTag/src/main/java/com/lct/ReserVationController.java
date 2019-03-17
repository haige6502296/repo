package com.lct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/reservation")
@Controller
public class ReserVationController {
  @RequestMapping("/bookingForm")
  public String bookingForm(Model model) {
//    create a Reservation Object
    Reservation res = new Reservation();
//    provide Reservation Object to the Model
    model.addAttribute("bbb", res);
    return "reservation-page";
  }

  @RequestMapping("/submitForm")
//  @ModelAttribute binds form data to the object
  public String submitForm(@ModelAttribute("aaa") Reservation res) {//不太明白这么写
    return "confirmation-page";
  }
}
