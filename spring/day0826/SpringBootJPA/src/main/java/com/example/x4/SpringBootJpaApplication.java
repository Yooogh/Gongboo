package com.example.x4;

import com.example.x4.model.dao.Member2Repository;
import com.example.x4.model.dao.PhoneRepository;
import com.example.x4.model.vo_dto_entity.Member2;
import com.example.x4.model.vo_dto_entity.Phone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJpaApplication implements CommandLineRunner {
//CommandLineRunner : 구독시점에 특정 코드 실행 -> run() 메서드 오버라이드
    @Autowired
    private Member2Repository mr;
    @Autowired
    private PhoneRepository pr;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJpaApplication.class, args);
        org.hibernate.cfg.ImprovedNamingStrategy d;
    }

    @Override
    public void run(String... args) throws Exception {
        Member2 member2 = new Member2(); //(1)
        member2.setName("park");
        mr.save(member2);

        member2.addPhone(new Phone("010-1111-1111"));
        member2.addPhone(new Phone("010-2222-2222"));
        member2.addPhone(new Phone("010-3333-3333"));
        mr.save(member2);

    }
}
