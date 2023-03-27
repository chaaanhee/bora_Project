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
public class registerController {
    /*회원가입 페이지*/
    @GetMapping("/register")
    public String register() {
        System.out.println("회원가입 페이지");
        return "/user/register";
    }

    /*회원정보 넘기기*/
    @GetMapping("/registerPost")
    public String registerPost() {
        System.out.println("회원가입 정보 전송" );
        return "/user/login";
    }

}
