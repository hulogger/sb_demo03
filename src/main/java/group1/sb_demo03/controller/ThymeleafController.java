package group1.sb_demo03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class ThymeleafController {
    @RequestMapping("/hello")
    public String hello(Model model, HttpSession session){
        System.out.println("控制器正在运行!!!");
        model.addAttribute("name","张志成");
        model.addAttribute("age",30);
        model.addAttribute("names",new String[]{"张三","李四","王五","陈留"});
        session.setAttribute("username","张志成");
        return "hello";
    }
}
