package com.jy.jobweb.project.controller;

import com.jy.jobweb.project.dto.ProjectDTO;
import com.jy.jobweb.project.model.ProjectEntity;
import com.jy.jobweb.project.service.ProjectService;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RequestMapping("/project")
@RestController
public class ProjectController {

    private final ProjectService projectService;


    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    // 프로젝트 조회
    @ApiOperation(value = "프로젝트 조회", notes = "프로젝트 조회")
    @PostMapping("/list")
    public List<ProjectDTO> getProjectList(){
//    public ResponseEntity<?> getProjectList(){
        List<ProjectDTO> list = projectService.getProjectList();

//        List<ProjectDTO> dtos = list.stream().map(ProjectDTO::new).collect(Collectors.toList());
        return list;
    }

    // 프로젝트 상세조회
    @ApiOperation(value = "상세조회", notes = "상세조회")
    @PostMapping("/detail")
    public String detailProject(@RequestBody ProjectDTO projectDTO){
        return "프로젝트 상세조회";
    }

    // 프로젝트 추가
    @ApiOperation(value = " 프로젝트 추가", notes = "프로젝트 추가")
    @PostMapping("/insert")
    public String createProject(@RequestBody ProjectDTO projectDTO){
        return "프로젝트 추가";
    }

    // 프로젝트 수정
    @ApiOperation(value = "프로젝트 수정", notes = "프로젝트 수정")
    @PostMapping("/update")
    public String updateProject(@RequestBody ProjectDTO projectDTO){
        return "프로젝트 수정";
    }

    // 프로젝트 삭제
    @ApiOperation(value = "프로젝트 삭제", notes = "프로젝트 삭제")
    @PostMapping("/delete")
    public String deleteProject(@RequestBody ProjectDTO projectDTO){
        return "프로젝트 삭제";
    }


}
