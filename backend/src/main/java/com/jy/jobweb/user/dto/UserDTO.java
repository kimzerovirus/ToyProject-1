package com.jy.jobweb.user.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    private String id;
    private String pwd;
    private String name;
    // user_lv -> 기업관계자(c), 헤드헌터(h)
    private String grade;

//    private String nickname;
//    private String email;
//    private String email_cert;
//
//
//    private String birthday;
//    private String gender;
//    private String phone;
//    private String regist_date;
//    private String update_date;
//    private String del_yn;
//    private String bank_acct;


}
