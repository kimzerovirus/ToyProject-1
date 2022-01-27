package com.jy.jobweb.user.service;

import com.jy.jobweb.user.model.UserEntity;
import com.jy.jobweb.user.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

// 회원 서비스
@Service
@Slf4j
public class UserService {

    public final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // 회원가입
    public UserEntity create(UserEntity entity){
        // 입력된 정보가 없는 경우
        if (entity == null || entity.getId() == null) {
            throw new RuntimeException("Invalid arguments");
        }

        // 먼저 가입한 id가 있을 경우
        final String id = entity.getId();
        if(userRepository.existsById(id)){
            log.warn("ID already exist {} ", id);
            throw new RuntimeException("ID already exist");
        }

        // 중복체크

        return userRepository.save(entity);
    }


    // 로그인
    // table 에서 id와 pwd 조회해서 값 비교하기
    public UserEntity signInUserByUserID(String id, String pwd){

        // 암호화 전
        return userRepository.findByIdAndPwd(id, pwd);

    }

    // 로그아웃

    // user 목록 조회

    // 나중에 추가해야할 것
    // 아이디 찾기
    // 비밀번호 찾기 등등
}
