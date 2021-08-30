package com.example.x4.model.vo_dto_entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Phone {

    @Id
    @Column(name = "seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PHONE_SEQ")
    @SequenceGenerator(name = "PHONE_SEQ", sequenceName = "PHONE_SEQ", allocationSize = 1)
    private int seq;

    @Column(name = "member_id")
    private int memberId;

    private String phoneNo;

    public Phone(String phoneNo){
        this.phoneNo = phoneNo;
    }
}
