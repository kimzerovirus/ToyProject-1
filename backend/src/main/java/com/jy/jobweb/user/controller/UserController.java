package com.jy.jobweb.user.controller;

import com.jy.jobweb.user.dto.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/user")
@Controller
public class UserController {

    // 회원가입
    @PostMapping("signup")
    public String signUp(@RequestBody UserDTO dto){

        return "";
    }

    // 로그인
    @PostMapping("signin")
    public String signIn(@RequestBody UserDTO dto){

        return "";
    }

    // 로그아웃



}
