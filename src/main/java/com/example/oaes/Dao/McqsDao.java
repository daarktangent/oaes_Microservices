package com.example.oaes.Dao;

import com.example.oaes.Entity.Mcqs;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface McqsDao extends JpaRepository<Mcqs,Long> {
    public List<Mcqs> findAll();
}
