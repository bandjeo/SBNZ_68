package com.sbnz.covid19cdss.service;

import com.sbnz.covid19cdss.model.*;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OnlineFormService {


    private final KieContainer kieContainer;

    @Autowired
    public OnlineFormService(KieContainer kieContainer) {
        this.kieContainer = kieContainer;
    }

    public OnlineEvaluation evaulateOnlineForm(OnlineForm form) {
        OnlineEvaluation evaluation = new OnlineEvaluation();
        List<Symptom> symptoms = getOnlineFormSymptoms(form);
        evaluation.setInstruction(OnlineInstruction.StayHome);
        KieSession kieSession = kieContainer.newKieSession("online_form_rulesSession");
//        kieSession.getAgenda().getAgendaGroup("Online form").setFocus();
        kieSession.insert(evaluation);
        for (Symptom s : symptoms) {
            kieSession.insert(s);
        }
        kieSession.insert(form);
        kieSession.fireAllRules();
        kieSession.dispose();
        return evaluation;
    }

    public List<Symptom> getOnlineFormSymptoms(OnlineForm onlineForm) {
        List<Symptom> symptoms = new ArrayList<>();
        symptoms.add(new Symptom("fever", SymptomType.Normal, SymptomScores.fever, onlineForm.isFever()));
        symptoms.add(new Symptom("dryCough", SymptomType.Normal, SymptomScores.dryCough, onlineForm.isDryCough()));
        symptoms.add(new Symptom("tiredness", SymptomType.Normal, SymptomScores.tiredness, onlineForm.isTiredness()));
        symptoms.add(new Symptom("aches", SymptomType.Normal, SymptomScores.aches, onlineForm.isAches()));
        symptoms.add(new Symptom("soreThroat", SymptomType.Normal, SymptomScores.soreThroat, onlineForm.isSoreThroat()));
        symptoms.add(new Symptom("diarrhoea", SymptomType.Normal, SymptomScores.diarrhoea, onlineForm.isDiarrhoea()));
        symptoms.add(new Symptom("conjuctivits", SymptomType.Normal, SymptomScores.conjuctivits, onlineForm.isConjuctivits()));
        symptoms.add(new Symptom("headache", SymptomType.Normal, SymptomScores.headache, onlineForm.isHeadache()));
        symptoms.add(new Symptom("lossOfTasteOrSmell", SymptomType.Normal, SymptomScores.lossOfTasteOrSmell, onlineForm.isLossOfTasteOrSmell()));
        symptoms.add(new Symptom("rashDiscolouration", SymptomType.Normal, SymptomScores.rashDiscolouration, onlineForm.isRashDiscolouration()));
        symptoms.add(new Symptom("difficultyBreathing", SymptomType.Normal, SymptomScores.difficultyBreathing, onlineForm.isDifficultyBreathing()));
        symptoms.add(new Symptom("chestPains", SymptomType.Normal, SymptomScores.chestPains, onlineForm.isChestPains()));
        symptoms.add(new Symptom("lossOfSpeachOrMovement", SymptomType.Normal, SymptomScores.lossOfSpeachOrMovement, onlineForm.isLossOfSpeachOrMovement()));



        return symptoms;
    }
}
