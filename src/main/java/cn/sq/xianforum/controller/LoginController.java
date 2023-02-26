package cn.sq.xianforum.controller;

import cn.sq.xianforum.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/get")
    public String helloWorld() {
        //        System.out.println("hello world");
        return loginService.getUsername("shangqiao");
    }
}
