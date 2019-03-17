package xx.com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class App{

        @RequestMapping("/hello")
        //read the provided form data
        public String display(@RequestParam("name") String name_define, @RequestParam("pass") String pass_define, Model m)
        {
            if(pass_define.equals("admin"))
            {
                String msg="Hello "+ name_define;
                //add a message to the model
                m.addAttribute("message", msg);
                return "viewpage";
            }
            else
            {
                String msg="Sorry "+ name_define+". You entered an incorrect password";
                m.addAttribute("message", msg);
                return "errorpage";
            }
        }
}
