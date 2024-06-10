package com.bit.springbootdemo.service;

import com.bit.springbootdemo.dto.MemberDto;

import java.util.Optional;

// @Controller, @RestController, @Service: 객체를 자동으로 생성해주는 어노테이션
public interface MemberService {
    void join(MemberDto memberDto);
    int memberCnt(MemberDto memberDto);
    Optional<MemberDto> login(MemberDto memberDto);
}
