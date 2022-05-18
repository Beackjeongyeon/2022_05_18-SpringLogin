package com.its.member.controller;

import com.its.member.dto.MemberDTO;
import com.its.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {
    @Autowired
    private MemberService memberService;



    @GetMapping("/save")
    public  String saveForm(){
        return  "save";

    }
    @PostMapping("/save1")
    public String save1(@ModelAttribute MemberDTO memberDTO) { //@ModelAttribute ~주입시키는역할 MEMBERDTO

        boolean saveresult = memberService.save1(memberDTO);
        if (saveresult) {
            return "login";
        } else {
            return "false";
        }

    }

    @GetMapping("/save")
    public String save2(){
        return "save";
    }
    @GetMapping("/login")
    public String login1(){
        return "login";
    }/*
    @GetMapping("/login")
    public  String login2(){
        return "login";
    }
    @GetMapping("/findall")
    public  String member(){
        return "list";
    }*/
}

