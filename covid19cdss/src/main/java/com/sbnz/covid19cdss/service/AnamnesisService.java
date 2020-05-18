package com.sbnz.covid19cdss.service;

import com.sbnz.covid19cdss.model.*;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnamnesisService {


    private final KieContainer kieContainer;

    @Autowired
    public AnamnesisService(KieContainer kieContainer) {
        this.kieContainer = kieContainer;
    }

    public AnamnesisEvaluation evaluateAnamnesis(Anamnesis anamnesis) {
        AnamnesisEvaluation evaluation = new AnamnesisEvaluation();
        evaluation.setRecoveryLocation(RecoveryLocation.Home);
        KieSession kieSession = kieContainer.newKieSession("rulesSession");
//        kieSession.getAgenda().getAgendaGroup("Online form").setFocus();
        kieSession.insert(anamnesis);
        kieSession.insert(evaluation);
        kieSession.fireAllRules();
        kieSession.dispose();
        return evaluation;
    }
}
