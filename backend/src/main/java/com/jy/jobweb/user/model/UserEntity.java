package com.jy.jobweb.user.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")
//@Table(name = "user", uniqueConstraints = {@UniqueConstraint(columnNames = "nickname")})
public class UserEntity {

    @Id
    private String id;

    @Column(nullable = false)
    private String pwd;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String grade; //user_lv -> 기업관계자(c), 헤드헌터(h)

//    private String nickname;
//    private String email;
//    private String email_cert;  // 이메일 인증 여부

//
//    private String birthday;
//    private String gender;
//    private String phone;
//    private String regist_date;
//    private String update_date;
//    private String del_yn;
//    private String bank_acct;


}
