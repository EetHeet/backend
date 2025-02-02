package kevat25.chapter2_4.web;

import kevat25.chapter2_4.domain.friend;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;



@Controller
public class friendsController {

    private List<friend> friends = new ArrayList<>();

    @RequestMapping("/hello")
    public String returnHello(Model model) {
        model.addAttribute("friends", friends);
        return "friendlist";
    }
    
    @PostMapping("/addFriend")
    public String addFriend(@RequestParam String firstName, @RequestParam String lastName) {
        friends.add(new friend(firstName, lastName));
        return "redirect:/hello";
    }
    

}
