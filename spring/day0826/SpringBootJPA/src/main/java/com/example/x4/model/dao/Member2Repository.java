package com.example.x4.model.dao;

import com.example.x4.model.vo_dto_entity.Member2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Member2Repository extends JpaRepository<Member2, Integer> {
}
