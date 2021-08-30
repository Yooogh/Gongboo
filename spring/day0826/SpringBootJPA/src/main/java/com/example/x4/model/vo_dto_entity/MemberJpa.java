package com.example.x4.model.vo_dto_entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
public class MemberJpa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int memberId;
    private String email;
    private String password;

    @CreationTimestamp
    private @Column(name = "cdate") Timestamp cdate;

    @UpdateTimestamp
    private @Column(name = "udate") Timestamp udate;
}
