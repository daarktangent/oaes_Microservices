package com.example.oaes.Entity;


import com.example.oaes.Dao.ExamPatternDao;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Entity
public class QuestionPaper {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long pid;

    @OneToMany
    private List<Msqs> msqs;

    @OneToMany
    private List<Mcqs>mcqs;

    @OneToMany
    private List<Descriptive> descriptives;

    @Override
    public String toString() {
        return "QuestionPaper{" +
                "pid=" + pid +
                ", msqs=" + msqs +
                ", mcqs=" + mcqs +
                ", descriptives=" + descriptives +
                '}';
    }

    public List<Msqs> getMsqs() {
        return msqs;
    }

    public void setMsqs(List<Msqs> msqs) {
        this.msqs = msqs;
    }

    public List<Mcqs> getMcqs() {
        return mcqs;
    }

    public void setMcqs(List<Mcqs> mcqs) {
        this.mcqs = mcqs;
    }

    public List<Descriptive> getDescriptives() {
        return descriptives;
    }

    public void setDescriptives(List<Descriptive> descriptives) {
        this.descriptives = descriptives;
    }
}
