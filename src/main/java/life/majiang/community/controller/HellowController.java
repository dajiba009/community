package life.majiang.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HellowController {
    @GetMapping("/hello")//这里是使确保在/hello申请请求是会掉用hello这个方法
    public String hello(@RequestParam(name="name")String name , Model model){
        model.addAttribute("name",name);
        return "hello";//当调用的时候会返回去找hello的模板,模板在resources/tenmlates中的hello.html
    }
}
