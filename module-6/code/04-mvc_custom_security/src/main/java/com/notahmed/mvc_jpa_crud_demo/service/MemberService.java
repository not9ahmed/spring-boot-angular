package com.notahmed.mvc_jpa_crud_demo.service;

import com.notahmed.mvc_jpa_crud_demo.model.Member;
import com.notahmed.mvc_jpa_crud_demo.repository.MemberRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Member createMember(Member member) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

        Member memberTemp = new Member(
                member.getId(),
                member.getFirstName(),
                member.getLastName(),
                member.getEmail(),
                "{bcrypt}" + encoder.encode(member.getPassword()),
                "ROLE_ADMIN",
                true
        );

        return memberRepository.save(memberTemp);
    }
}
