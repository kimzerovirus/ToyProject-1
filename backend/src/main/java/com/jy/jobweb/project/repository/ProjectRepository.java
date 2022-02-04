package com.jy.jobweb.project.repository;

import com.jy.jobweb.project.model.ProjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<ProjectEntity, String> {

}
