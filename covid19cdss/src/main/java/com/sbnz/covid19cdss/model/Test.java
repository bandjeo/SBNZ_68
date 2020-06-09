package com.sbnz.covid19cdss.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "test")
public class Test {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "result")
    private boolean result;

    @ManyToOne()
    @JoinColumn(name = "patient")
    private Patient patient;

    @Column(name = "timestamp")
    private Date timestamp;

    public Test() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
