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

    @ManyToMany
    private List<Msqs> msqs;

    @ManyToMany
    private List<Mcqs>mcqs;

    @ManyToMany
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

    public QuestionPaper() {
        msqs=new ArrayList<>();
        mcqs=new ArrayList<>();
        descriptives=new ArrayList<>();
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
    public void addDesc(Descriptive descriptive)
    {
        descriptives.add(descriptive);
    }
    public void addMcq(Mcqs mcq)
    {
        mcqs.add(mcq);
    }
    public void addMsqs(Msqs msq)
    {
        msqs.add(msq);
    }

    public Long getPid() {
        return pid;
    }

}
