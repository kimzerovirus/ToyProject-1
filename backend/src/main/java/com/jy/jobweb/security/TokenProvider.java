package com.jy.jobweb.security;

import com.jy.jobweb.user.model.UserEntity;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;

@Slf4j
@Service
public class TokenProvider {
    private static final String SECRET_KEY = "NMA8JPctFuna59f5";

    // 토큰 생성
    public String create(UserEntity userEntity){
        // 기한은 현재부터 1일
        Date expireDate = Date.from(
                Instant.now()
                        .plus(1, ChronoUnit.DAYS)
        );

        // JWT Token 생성
        return Jwts.builder()
                // header 에 들어갈 내용 및 서명을 하기 위한 key
                .signWith(SignatureAlgorithm.HS512, SECRET_KEY)
                // payload 에 들어갈 내용
                .setSubject(userEntity.getEmail()) // sub
                .setIssuer("jobweb")    // iss
                .setIssuedAt(new Date())    // iat
                .setExpiration(expireDate) // exp
                .compact();
    }

    // 토큰 검증
    public String validateAndGetUserId(String token){
        // parseClaimsJws 메서드가 Base64로 디코딩 및 파싱
        // 헤더와 페이로드를 setSigningKey 로 넘어온 시크릿을 이용해 서명한 후 token 서명과 비교
        // 위조되지 않았다면 페이로드(Claims) 리턴, 위조라면 예외를 날림
        // userId가 필요하므로 getBody를 호출
        Claims claims = Jwts.parser()
                .setSigningKey(SECRET_KEY)
                .parseClaimsJws(token)
                .getBody();

        return claims.getSubject();
    }
}
