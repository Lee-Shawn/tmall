package com.tmall.controller.portal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user/")
public class UserController {

    @RequestMapping(value = "login.do", method = RequestMethod.POST)
    @ResponseBody// 通过Jackson将返回的结果序列化成json
    public Object login(String username, String password, HttpSession session) {
        return null;
    }

}
