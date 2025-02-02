package kevat25.chapter1.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@ResponseBody
public class MyController {

    @RequestMapping("/hello")
    public String returnHello(@RequestParam String name, @RequestParam String location){
        return "Welcome to the " + location + " " + name;
    }

    @RequestMapping("/index")
    public String indexMessage() {
        return "This is the main page";
    }
    
    @RequestMapping("/contact")
    public String contactMessage() {
        return "This is the contact page";
    }


}
