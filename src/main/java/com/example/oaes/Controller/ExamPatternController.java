package com.example.oaes.Controller;

import com.example.oaes.Dao.ExamPatternDao;

import com.example.oaes.Entity.ExamPattern;
import com.example.oaes.Entity.QuestionPaper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExamPatternController {

    @Autowired
    private ExamPatternDao examPatternDao;
    @GetMapping("/")
    public List<ExamPattern> getAll()
    {
        return examPatternDao.findAll();
    }
    @PostMapping("/add")
    public void addExamPattern(@RequestBody ExamPattern examPattern)
    {
        examPatternDao.save(examPattern);
    }

    @GetMapping("/generate")
    public QuestionPaper generate()
    {
        
        return new QuestionPaper();
    }
}
