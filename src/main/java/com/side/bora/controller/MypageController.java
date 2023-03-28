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
public class MypageController {
    /*로그인 페이지*/
    @GetMapping("/mypage")
    public String mypage(){
    System.out.println("마이페이지 들어왓");
        return "/user/mypage";
    }
}
