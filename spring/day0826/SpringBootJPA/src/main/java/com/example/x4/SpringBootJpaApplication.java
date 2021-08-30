package com.example.x4;

import com.example.x4.model.dao.Member2Repository;
import com.example.x4.model.dao.PhoneRepository;
import com.example.x4.model.vo_dto_entity.Member2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJpaApplication implements CommandLineRunner {

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

        member2.addPhone();

//        List<Member> list = mr.findAll(); //(5)
//        for (Member m : list) {
//            System.out.println(m.toString());
//        }// (6)
//        mr.deleteAll();
    }
}
