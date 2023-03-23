package com.side.bora.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
@Log4j2
@RequiredArgsConstructor // 생성자 주입
public class LoginController {
    /*로그인 페이지*/
    @GetMapping("/login")
    public String login(){
    System.out.println("로그인 들어왓");
        return "/user/login";
    }
}
