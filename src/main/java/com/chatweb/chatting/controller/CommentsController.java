package com.chatweb.chatting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CommentsController {

    // 접속주소 : http://localhost:8071/home/main
    @RequestMapping("/home/main")
    @ResponseBody
    public String showMain() {
        System.out.println("showMain 함수 실행됨");
        return "Hi";
    }

    // 접속주소 : http://localhost:8071/home/main2
    @RequestMapping("/home/main2")
    @ResponseBody
    public String showMain2() {
        return "Hi2";
    }

    // 접속주소 : http://localhost:8071/home/plus?a=10&b=20&c=30
    @RequestMapping("/home/plus")
    @ResponseBody
    public int showPlus(int a, int b) {
        return a + b;
    }
}
