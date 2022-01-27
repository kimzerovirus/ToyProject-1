package com.jy.jobweb.user.controller;

import com.jy.jobweb.dto.ResponseDTO;
import com.jy.jobweb.user.dto.UserDTO;
import com.jy.jobweb.user.model.UserEntity;
import com.jy.jobweb.user.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/user")
@RestController
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    // 회원가입
    @PostMapping("signup")
    public ResponseEntity<?> signUp(@RequestBody UserDTO dto){

        try {
            // dto -> entity로
            UserEntity user = UserEntity.builder()
                    .id(dto.getId())
                    .pwd(dto.getPwd())
                    .name(dto.getName())
                    .grade(dto.getGrade())
                    .build();

            UserEntity registeredUser = service.create(user);
            UserDTO responseUserDTO = UserDTO.builder().id(registeredUser.getId())
                    .pwd(registeredUser.getPwd()).name(registeredUser.getName())
                    .grade(registeredUser.getGrade()).build();


            return ResponseEntity.ok(responseUserDTO);
        }catch (Exception e){
            ResponseDTO responseDTO = ResponseDTO.builder().error(e.getMessage()).build();
            return ResponseEntity
                    .badRequest()
                    .body(responseDTO);
        }
    }

    // 로그인
    @PostMapping("signin")
    public ResponseEntity<?> signIn(@RequestBody UserDTO dto){

        UserEntity user = service.signInUserByUserID(dto.getId(), dto.getPwd());

        // 로그인 정보가 없을 때
        if(user == null){
            ResponseDTO responseDTO = ResponseDTO.builder().error("로그인 실패.").build();
            return ResponseEntity.badRequest().body(responseDTO);
        }

        // 로그인 성공시
        UserDTO responseUserDTO = dto.builder().id(dto.getId()).pwd(dto.getPwd()).build();

        return ResponseEntity.ok().body(responseUserDTO);
    }

    // 로그아웃



}
