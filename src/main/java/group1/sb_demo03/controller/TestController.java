package group1.sb_demo03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TestController {
    @RequestMapping("/helloworld")
    @ResponseBody
    public String helloworld(){
        return "hellospringboot";
    }

    @RequestMapping("/goIndex")
    public String goIndex(){  //控制器
        System.out.println("我是控制器");
        return "index";  //跳页面   /index.jsp
    }
}
