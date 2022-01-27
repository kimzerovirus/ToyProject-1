package com.jy.jobweb.user.repository;

import com.jy.jobweb.user.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// repository
@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {
    UserEntity findByIdAndPwd(String id, String pwd);
}
