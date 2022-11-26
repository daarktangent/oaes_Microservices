package com.example.oaes.Dao;

import com.example.oaes.Entity.ExamPattern;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExamPatternDao extends JpaRepository<ExamPattern,Long> {
    public List<ExamPattern> findAll();
    public ExamPattern getExamPatternByPid(Long id);
}
