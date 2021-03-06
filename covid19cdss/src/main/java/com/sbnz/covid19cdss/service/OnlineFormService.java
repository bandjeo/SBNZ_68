package com.sbnz.covid19cdss.service;

import com.sbnz.covid19cdss.model.OnlineEvaluation;
import com.sbnz.covid19cdss.model.OnlineForm;
import com.sbnz.covid19cdss.model.OnlineInstruction;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OnlineFormService {


    private final KieContainer kieContainer;

    @Autowired
    public OnlineFormService(KieContainer kieContainer) {
        this.kieContainer = kieContainer;
    }

    public OnlineInstruction evaulateOnlineForm(OnlineForm form) {
        OnlineEvaluation evaluation = new OnlineEvaluation();
        evaluation.setInstruction(OnlineInstruction.StayHome);
        KieSession kieSession = kieContainer.newKieSession("rulesSession");
//        kieSession.getAgenda().getAgendaGroup("Online form").setFocus();
        kieSession.insert(evaluation);
        kieSession.insert(form);
        kieSession.fireAllRules();
        kieSession.dispose();
        return evaluation.getInstruction();
    }
}
