package com.its.member.repository;

import com.its.member.dto.MemberDTO;


import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberRepository {
    @Autowired
    private SqlSessionTemplate sql;
    public int save1(MemberDTO memberDTO) {
        System.out.println("MemberRepository.save1");
        System.out.println("memberDTO = " + memberDTO);
       return sql.insert("Member.save1",memberDTO);

    }
}
