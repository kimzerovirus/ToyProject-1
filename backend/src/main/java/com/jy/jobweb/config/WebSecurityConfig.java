package com.jy.jobweb.config;

import com.jy.jobweb.security.JwtAuthenticationFilter;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.filters.CorsFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

@EnableWebSecurity
@Slf4j
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    private final JwtAuthenticationFilter jwtAuthenticationFilter;

    public WebSecurityConfig(JwtAuthenticationFilter jwtAuthenticationFilter) {
        this.jwtAuthenticationFilter = jwtAuthenticationFilter;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // http 시큐리티 빌더
        http.cors()
                .and()
                .csrf()// 현재 사용하지 않음
                .disable()
                .httpBasic()    // 토큰사용하므로
                .disable()
                .sessionManagement() // session x
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .authorizeRequests()    // /와 /auth/** 경로 인증 필요없음
                .antMatchers("/", "/auth/**").permitAll()
                .anyRequest()   //  / 와 /auth/** 경로 이외 모든 경로는 인증이 필요함
                .authenticated();

        // filter 등록
        // 매요청마다 CorsFilter 실행한 후에 jwtAuthenticationFilter 실행한다.
        http.addFilterAfter(
                jwtAuthenticationFilter,
                CorsFilter.class
        );
        super.configure(http);
    }
}
