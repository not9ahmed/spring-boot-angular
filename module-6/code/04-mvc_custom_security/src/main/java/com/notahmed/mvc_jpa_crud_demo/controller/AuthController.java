package com.notahmed.mvc_jpa_crud_demo.controller;

import com.notahmed.mvc_jpa_crud_demo.model.Member;
import com.notahmed.mvc_jpa_crud_demo.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/auth")
public class AuthController {

    private final MemberService memberService;

    public AuthController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/login")
    public String showLoginForm(Model model) {
        return "login-form";
    }


    @GetMapping("/register")
    public String showRegisterForm(Model model) {
        model.addAttribute("member", new Member());
        return "register-form";
    }


    @PostMapping("/save")
    public String saveMember(@ModelAttribute Member member, Model model){
        memberService.createMember(member);
        return "redirect:/auth/login";
    }

}
