package com.sbnz.covid19cdss.service;

import com.sbnz.covid19cdss.model.Patient;
import com.sbnz.covid19cdss.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PatientService {

    private PatientRepository repository;

    @Autowired
    public PatientService(PatientRepository repository) {
        this.repository = repository;
    }

    public List<Patient> getAll() {
        return repository.findAll();
    }

    public boolean add(Patient patient) {
        repository.save(patient);
        return true;
    }

    public Patient getOne(Long id) {
        return repository.getOne(id);
    }
}
