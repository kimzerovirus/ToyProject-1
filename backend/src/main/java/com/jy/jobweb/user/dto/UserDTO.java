package com.jy.jobweb.user.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

//    private int seq;
    private String token;
    private int id;
    private String pwd;
    private String name;
    private String email;
    // user_lv -> 기업관계자(c), 헤드헌터(h)
    private String grade;
    private String birthday;
    private String gender;
    private String phone;
    private String del_yn;
//    private Date regist_date;


//    private String nickname;
//    private String email_cert;
//
//
//    private String birthday;
//    private String gender;
//    private String phone;
//    private String del_yn;
//    private String regist_date;
//    private String update_date;
//    private String bank_acct;


}
