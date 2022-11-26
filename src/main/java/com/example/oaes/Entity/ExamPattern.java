package com.example.oaes.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ExamPattern {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long pid;

    private String pattern_name;

    private String course_name;

    private Long total_marks;

    private Long no_of_mcqs;

    private Long no_of_msqs;

    private Long no_of_desc;


    @Override
    public String toString() {
        return "ExamPattern{" +
                "pid=" + pid +
                ", pattern_name='" + pattern_name + '\'' +
                ", course_name='" + course_name + '\'' +
                ", total_marks=" + total_marks +
                ", no_of_mcqs=" + no_of_mcqs +
                ", no_of_msqs=" + no_of_msqs +
                ", no_of_desc=" + no_of_desc +
                '}';
    }

    public String getPattern_name() {
        return pattern_name;
    }

    public void setPattern_name(String pattern_name) {
        this.pattern_name = pattern_name;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public Long getTotal_marks() {
        return total_marks;
    }

    public void setTotal_marks(Long total_marks) {
        this.total_marks = total_marks;
    }

    public Long getNo_of_mcqs() {
        return no_of_mcqs;
    }

    public void setNo_of_mcqs(Long no_of_mcqs) {
        this.no_of_mcqs = no_of_mcqs;
    }

    public Long getNo_of_msqs() {
        return no_of_msqs;
    }

    public void setNo_of_msqs(Long no_of_msqs) {
        this.no_of_msqs = no_of_msqs;
    }

    public Long getNo_of_desc() {
        return no_of_desc;
    }

    public void setNo_of_desc(Long no_of_desc) {
        this.no_of_desc = no_of_desc;
    }
}
