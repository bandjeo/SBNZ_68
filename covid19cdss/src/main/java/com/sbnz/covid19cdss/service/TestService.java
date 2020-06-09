package com.sbnz.covid19cdss.service;

import com.sbnz.covid19cdss.model.Patient;
import com.sbnz.covid19cdss.model.Test;
import com.sbnz.covid19cdss.model.TestsReview;
import com.sbnz.covid19cdss.repository.PatientRepository;
import com.sbnz.covid19cdss.repository.TestRepository;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    private TestRepository repository;

    private PatientRepository patientRepository;

    private final KieContainer kieContainer;

    @Autowired
    public TestService(TestRepository repository, PatientRepository patientRepository, KieContainer kieContainer) {
        this.repository = repository;
        this.patientRepository = patientRepository;
        this.kieContainer = kieContainer;
    }

    public void add(Test test, Long patientId) {
        Patient patient = patientRepository.getOne(patientId);
        test.setPatient(patient);
        this.repository.save(test);
    }

    public boolean resonateTests(Long patientId) {
        List<Test> tests = repository.findAllByPatientId(patientId);
        TestsReview review = new TestsReview();
        review.setDischarge(false);
        KieSession kieSession = kieContainer.newKieSession("cep_rulesSession");
//        kieSession.getAgenda().getAgendaGroup("Online form").setFocus();
        for (Test t : tests) {
            kieSession.insert(t);
        }
        kieSession.insert(review);
        kieSession.fireAllRules();
        kieSession.dispose();
        return review.isDischarge();
    }
}
