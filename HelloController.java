package com.offcn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class HelloController {

    //写入session
    @RequestMapping("set")
    public String setSesssion(HttpSession session){

        String s="hello session";

        session.setAttribute("s",s);

        return "setSession-success";
    }

    //读取session
    @RequestMapping("get")
    public String getSession(HttpSession session){
        String s= (String) session.getAttribute("s");
        return "read:"+s;
    }

}
