package com.example.oaes.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Msqs {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long pid;
    private String topic;
    private String subject;
    private String question_text;
    private String text;
    private String options;
    private String ans;
    private long marks;

    @Override
    public String toString() {
        return "Msqs{" +
                "pid=" + pid +
                ", topic='" + topic + '\'' +
                ", subject='" + subject + '\'' +
                ", question_text='" + question_text + '\'' +
                ", text='" + text + '\'' +
                ", options='" + options + '\'' +
                ", ans='" + ans + '\'' +
                ", marks=" + marks +
                '}';
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getQuestion_text() {
        return question_text;
    }

    public void setQuestion_text(String question_text) {
        this.question_text = question_text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public String getAns() {
        return ans;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }

    public long getMarks() {
        return marks;
    }

    public void setMarks(long marks) {
        this.marks = marks;
    }
}
