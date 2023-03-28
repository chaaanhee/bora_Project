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
public class AgreeController {
    /*약관동의 페이지*/
    @GetMapping("/agree")
    public String mypage(){
    System.out.println("약관동의 돌아갑니다아");
        return "/user/agree";
    }
}
