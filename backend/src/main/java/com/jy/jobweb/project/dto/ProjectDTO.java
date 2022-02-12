package com.jy.jobweb.project.dto;

import com.jy.jobweb.project.model.ProjectEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProjectDTO {

    private int project_id;
    private String company_name;
    private int id;
    private String department;
    private String businessContent;
    private String requirements;
    private String etc;
    private String keyword;
    private String regist_date;
    private String closing_date;
    private String progress;
    private String bindding_status;
    private String candidate_status;
    private String bid_status;

//    public ProjectDTO(ProjectEntity projectEntity) {
//        this.company_name = projectEntity.getCompany_name();
//        this
//    }
}
