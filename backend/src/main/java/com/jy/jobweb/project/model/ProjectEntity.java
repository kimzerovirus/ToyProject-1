package com.jy.jobweb.project.model;

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
@Table( name = "project")
public class ProjectEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int project_id;     // 프로젝트 번호 PK

    @Column(nullable = false)
    private String company_name;    // 기업명

    @Column(nullable = false)
    private int id;     //  글쓴이 id (FK)

    @Column(nullable = false)
    private String department;  // 근무 부서

    @Column(nullable = false)
    private String businessContent;     // 업무 내용

    @Column(nullable = false)
    private String requirements;    // 요건사항

    private String etc;     // 기타사항
    private String keyword;     // 키워드

//    @Column(nullable = false)
//    private String regist_date;   // 등록일

    @Column(nullable = false)
    private String closing_date;    // 마감일

    @Column(nullable = false)
    private String progress;    // 진행상황

    // 현재는 null 이 가능하게 해놨지만 나중에 수정해야함
    @Column
    private String bindding_status; // 입찰 현황

    @Column(nullable = false)
    private String candidate_status;    // 후보자 현황

    // 현재는 null 이 가능하게 해놨지만 나중에 수정해야함
    @Column
    private String bid_status;  // 입찰 여부
}
