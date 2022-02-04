package com.jy.jobweb.project.service;

import com.jy.jobweb.project.dto.ProjectDTO;
import com.jy.jobweb.project.model.ProjectEntity;
import com.jy.jobweb.project.repository.ProjectRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class ProjectService {

    private final ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public List<ProjectDTO> getProjectList() {
        log.debug("### 프로젝트 조회");
        List<ProjectEntity> list = projectRepository.findAll();
        List<ProjectDTO> resultList = new ArrayList<>();

        System.out.println("list :" + list);

//        for(ProjectEntity projectEntity : list){
//            ProjectDTO projectDTO = ProjectDTO.builder()
//                    .project_id()
//        }

        return resultList;
    }
}
