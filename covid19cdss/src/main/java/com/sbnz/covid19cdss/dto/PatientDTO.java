package com.sbnz.covid19cdss.dto;

import com.sbnz.covid19cdss.model.Anamnesis;
import com.sbnz.covid19cdss.model.RecoveryLocation;
import com.sbnz.covid19cdss.model.Test;

import javax.persistence.*;
import java.util.Set;

public class PatientDTO {
    private Long id;
    private String name;
    private String lastName;
    private RecoveryLocation recoveryLocation;
    private AnamnesisDTO anamneses;
    private Set<TestDTO> tests;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public RecoveryLocation getRecoveryLocation() {
        return recoveryLocation;
    }

    public void setRecoveryLocation(RecoveryLocation recoveryLocation) {
        this.recoveryLocation = recoveryLocation;
    }

    public AnamnesisDTO getAnamneses() {
        return anamneses;
    }

    public void setAnamneses(AnamnesisDTO anamneses) {
        this.anamneses = anamneses;
    }

    public Set<TestDTO> getTests() {
        return tests;
    }

    public void setTests(Set<TestDTO> tests) {
        this.tests = tests;
    }

    public PatientDTO() {
    }

    public PatientDTO(Long id, String name, String lastName, RecoveryLocation recoveryLocation, AnamnesisDTO anamneses, Set<TestDTO> tests) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.recoveryLocation = recoveryLocation;
        this.anamneses = anamneses;
        this.tests = tests;
    }
}
