package com.example.oaes.Controller;

import com.example.oaes.Dao.*;

import com.example.oaes.Entity.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@RestController
public class ExamPatternController {

    @Autowired
    private ExamPatternDao examPatternDao;

    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/exam/get")
    public List<ExamPattern> getAll()
    {
        return examPatternDao.findAll();
    }
    @PostMapping("/exam/add")
    public void addExamPattern(@RequestBody ExamPattern examPattern)
    {
        examPatternDao.save(examPattern);
    }


    @GetMapping("/exam/test")
    public String test()
    {
        return "inside exam pattern test microservice";
    }
    @GetMapping("exam/gen/{id}")
    public String generate(@PathVariable Long id)
    {
        return this.restTemplate.getForObject("http://GENERATE-SERVICE/generate/"+id,String.class);
    }

}
