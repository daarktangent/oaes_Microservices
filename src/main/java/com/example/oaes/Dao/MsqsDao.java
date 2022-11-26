package com.example.oaes.Dao;

import com.example.oaes.Entity.Mcqs;
import com.example.oaes.Entity.Msqs;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MsqsDao extends JpaRepository<Msqs,Long> {
    public List<Msqs> findAll();
}
