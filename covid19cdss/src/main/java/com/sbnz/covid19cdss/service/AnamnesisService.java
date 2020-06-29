package com.sbnz.covid19cdss.service;

import com.sbnz.covid19cdss.model.*;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnamnesisService {


    private final KieContainer kieContainer;

    @Autowired
    public AnamnesisService(KieContainer kieContainer) {
        this.kieContainer = kieContainer;
    }

    public AnamnesisEvaluation evaluateAnamnesis(Anamnesis anamnesis) {
        AnamnesisEvaluation evaluation = new AnamnesisEvaluation();
        List<Symptom> symptoms = getAnamnesisSymptoms(anamnesis);
        evaluation.setRecoveryLocation(RecoveryLocation.Home);
        KieSession kieSession = kieContainer.newKieSession("anamnesis_rulesSession");
        kieSession.insert(anamnesis);
        kieSession.insert(evaluation);
        for (Symptom s : symptoms) {
            kieSession.insert(s);
        }
        kieSession.fireAllRules();
        kieSession.dispose();
        return evaluation;
    }

    public List<Symptom> getAnamnesisSymptoms(Anamnesis anamnesis) {
        List<Symptom> symptoms = new ArrayList<>();

        symptoms.add(new Symptom("asthma", SymptomType.RiskGroup, 0, anamnesis.isAsthma()));
        symptoms.add(new Symptom("chronicKidney", SymptomType.RiskGroup, 0, anamnesis.isChronicKidney()));
        symptoms.add(new Symptom("chronicLung", SymptomType.RiskGroup, 0, anamnesis.isChronicLung()));
        symptoms.add(new Symptom("diabetes", SymptomType.RiskGroup, 0, anamnesis.isDiabetes()));
        symptoms.add(new Symptom("hemoglobinDisorder", SymptomType.RiskGroup, 0, anamnesis.isHemoglobinDisorder()));
        symptoms.add(new Symptom("immunocompromised", SymptomType.RiskGroup, 0, anamnesis.isImmunocompromised()));
        symptoms.add(new Symptom("liverDisease", SymptomType.RiskGroup, 0, anamnesis.isLiverDisease()));
        symptoms.add(new Symptom("heartConditions", SymptomType.RiskGroup, 0, anamnesis.isHeartConditions()));

        symptoms.add(new Symptom("fever", SymptomType.Normal, SymptomScores.fever, anamnesis.isFever()));
        symptoms.add(new Symptom("dryCough", SymptomType.Normal, SymptomScores.dryCough, anamnesis.isDryCough()));
        symptoms.add(new Symptom("tiredness", SymptomType.Normal, SymptomScores.tiredness, anamnesis.isTiredness()));
        symptoms.add(new Symptom("aches", SymptomType.Normal, SymptomScores.aches, anamnesis.isAches()));
        symptoms.add(new Symptom("soreThroat", SymptomType.Normal, SymptomScores.soreThroat, anamnesis.isSoreThroat()));
        symptoms.add(new Symptom("diarrhoea", SymptomType.Normal, SymptomScores.diarrhoea, anamnesis.isDiarrhoea()));
        symptoms.add(new Symptom("conjuctivits", SymptomType.Normal, SymptomScores.conjuctivits, anamnesis.isConjuctivits()));
        symptoms.add(new Symptom("headache", SymptomType.Normal, SymptomScores.headache, anamnesis.isHeadache()));
        symptoms.add(new Symptom("lossOfTasteOrSmell", SymptomType.Normal, SymptomScores.lossOfTasteOrSmell, anamnesis.isLossOfTasteOrSmell()));
        symptoms.add(new Symptom("rashDiscolouration", SymptomType.Normal, SymptomScores.rashDiscolouration, anamnesis.isRashDiscolouration()));
        symptoms.add(new Symptom("difficultyBreathing", SymptomType.Normal, SymptomScores.difficultyBreathing, anamnesis.isDifficultyBreathing()));
        symptoms.add(new Symptom("chestPains", SymptomType.Normal, SymptomScores.chestPains, anamnesis.isChestPains()));
        symptoms.add(new Symptom("lossOfSpeachOrMovement", SymptomType.Normal, SymptomScores.lossOfSpeachOrMovement, anamnesis.isLossOfSpeachOrMovement()));

        return symptoms;
    }
}
