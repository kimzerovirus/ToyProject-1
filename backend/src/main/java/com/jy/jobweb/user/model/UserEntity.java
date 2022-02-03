package com.jy.jobweb.user.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")
//@Table(name = "user", uniqueConstraints = {@UniqueConstraint(columnNames = "nickname")})
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)     // id를 자동으로 증가시켜주는 것 oracle 에서 sequence
    private int id;

    @Column(nullable = false)
    private String pwd;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String grade; //user_lv -> 기업관계자(c), 헤드헌터(h)

    @Column(nullable = false)
    private String birthday;

    @Column(nullable = false)
    private String gender;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String del_yn;

//    @Column()
//    private Date regist_date;


//    private String nickname;
//    private String email_cert;  // 이메일 인증 여부

//
//    private String regist_date;
//    private String update_date;
//    private String bank_acct;


}
