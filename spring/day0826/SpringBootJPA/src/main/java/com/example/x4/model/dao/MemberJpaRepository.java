package com.example.x4.model.dao;

import com.example.x4.model.vo_dto_entity.MemberJpa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberJpaRepository extends JpaRepository<MemberJpa, Integer> {
}
