package controller;

import domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.DemoService;

@Controller("DemoController")
public class DemoController {

    @Autowired
    private DemoService service;


    @RequestMapping("login.do")
    public String login(User user){
        System.out.println("controller方法执行");
        System.out.println(user);
        String result = service.selectOne(user);
        if (result.equals("登录成功")){
            System.out.println("成功");
            return "welcome.jsp";
        }else {
            System.out.println("失败");
            return "index.html";
        }
    }
}
