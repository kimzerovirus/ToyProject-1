package com.jy.jobweb.user.repository;

import com.jy.jobweb.user.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

// repository
@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {
//    Optional<UserEntity> findById(String id);
    UserEntity findByIdAndPwd(String id, String pwd);
    UserEntity findByEmail(String email);

    boolean existsByEmail(String email);
}
