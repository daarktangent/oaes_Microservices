package com.example.oaes.Controller;

import com.example.oaes.Dao.*;

import com.example.oaes.Entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Collections;
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

    @Autowired
    private McqsDao mcqsDao;
    @Autowired
    private MsqsDao msqsDao;

    @Autowired
    private QuestionPaperDao questionPaperDao;
    @Autowired
    private DescriptiveDao descriptiveDao;

    @GetMapping("/generate/{id}")
    public QuestionPaper generate(@PathVariable Long id)
    {
        QuestionPaper questionPaper=new QuestionPaper();
        ExamPattern examPattern=examPatternDao.getExamPatternByPid(id);//getting the exam pattern
        System.out.println("----------------------");
        System.out.println(examPattern);
        List<Mcqs> mcq=mcqsDao.findAll();
        List<Msqs> msq=msqsDao.findAll();
        List<Descriptive> descriptives= descriptiveDao.findAll();
        Collections.shuffle(descriptives);
        Collections.shuffle(msq);
        Collections.shuffle(mcq);
        System.out.println(examPattern+"--------a----------");
        for(int i=0;i<examPattern.getNo_of_mcqs();i++)
        {
            questionPaper.addMcq(mcq.get(i));
        }
        for(int i=0;i<examPattern.getNo_of_desc();i++)
        {
            questionPaper.addDesc(descriptives.get(i));
        }
        for (int i=0;i<examPattern.getNo_of_msqs();i++)
        {
            questionPaper.addMsqs(msq.get(i));
        }
        System.out.println(questionPaper);
        questionPaperDao.save(questionPaper);
        return questionPaper;
    }

}
