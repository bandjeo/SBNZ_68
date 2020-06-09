package com.sbnz.covid19cdss.service;

import com.sbnz.covid19cdss.model.Patient;
import com.sbnz.covid19cdss.model.Test;
import com.sbnz.covid19cdss.repository.PatientRepository;
import com.sbnz.covid19cdss.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    private TestRepository repository;

    private PatientRepository patientRepository;

    @Autowired
    public TestService(TestRepository repository, PatientRepository patientRepository) {
        this.repository = repository;
        this.patientRepository = patientRepository;
    }

    public void add(Test test, Long patientId) {
        Patient patient = patientRepository.getOne(patientId);
        test.setPatient(patient);
        this.repository.save(test);
    }
}
