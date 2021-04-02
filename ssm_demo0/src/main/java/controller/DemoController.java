package controller;

import domain.User;
import org.springframework.web.bind.annotation.RequestMapping;

public class DemoController {

    @RequestMapping("login.do")
    public String login(User user){
        return "";
    }
}
