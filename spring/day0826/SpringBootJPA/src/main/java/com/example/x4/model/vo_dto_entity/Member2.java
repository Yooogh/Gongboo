package com.example.x4.model.vo_dto_entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Data
public class Member2 {

    @Id
    @Column(name = "MEMBERID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Member2_SEQ")
    @SequenceGenerator(name = "MEMBER2_SEQ",sequenceName = "MEMBER2_SEQ", allocationSize = 1)
    private int seq;

    @Column(name="name")
    private String name;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "member_id")
    private Collection<Phone> phones = new ArrayList<phones>();

    public void addPhone(Phone phone) {
        phones.add(phone);
    }
}
