//package com.shop.projectlion.domain.member.service;
//
//import com.shop.projectlion.web.login.dto.MemberRegisterDto;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.test.context.TestPropertySource;
//import org.springframework.transaction.annotation.Transactional;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@SpringBootTest
//@Transactional
//@TestPropertySource(locations = "classpath:application-test.yml")
//class MemberServiceTest {
//
//    @Autowired
//    MemberService memberService;
//
//    @Autowired
//    PasswordEncoder passwordEncoder;
//
//    public Member createMember(){
//        MemberRegisterDto memberRegisterDto = new MemberRegisterDto();
//        memberRegisterDto.setEmail("test@naver.com");
//        memberRegisterDto.setName("홍길동");
//        memberRegisterDto.setPassword();
//    }
//
//}