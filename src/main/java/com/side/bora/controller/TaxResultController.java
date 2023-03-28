package com.side.bora.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("tax")
@Log4j2
@RequiredArgsConstructor // 생성자 주입
public class TaxResultController {
    /*로그인 페이지*/
    @GetMapping("/result")
    public String taxReturn(){
    System.out.println("마지막기능 들어왓");
        return "/tax/taxResult";
    }
}
