package com.example.x4.controller;

import com.example.x4.model.dao.MemberJpaRepository;
import com.example.x4.model.vo_dto_entity.MemberJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/member")
public class JpaExamController {

    @Autowired
    private MemberJpaRepository dao;

    @RequestMapping("/hi")
    @ResponseBody
    public String hello() {

        return "Hello";
        //RequestMapping : 템플릿 밑의 /member/hi/Hello를 찾음
        //ResponseBody : 비동기적으로 데이터를 넘겨줄 때
        //한 블럭만 정보 넘겨줌
    }

    @RequestMapping("/list")
    @ResponseBody
    public List<MemberJpa> view(){
        List<MemberJpa> memberData= dao.findAll();
        //findById가 리턴하는 것은 Optional<> 임
        return memberData;
    }



}
