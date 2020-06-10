package com.sbnz.covid19cdss.test;

import com.sbnz.covid19cdss.model.Anamnesis;
import com.sbnz.covid19cdss.model.AnamnesisEvaluation;
import com.sbnz.covid19cdss.model.RecoveryLocation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.kie.api.KieServices;
import org.kie.api.builder.KieScanner;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AnamnesisRulesTest {

    private KieContainer kieContainer;

    public AnamnesisRulesTest() {
        KieServices ks = KieServices.Factory.get();
        KieContainer kContainer = ks
                .newKieContainer(ks.newReleaseId("sbnz.integracija", "drools-spring-kjar", "0.0.1-SNAPSHOT"));
        KieScanner kScanner = ks.newKieScanner(kContainer);
        kScanner.start(10_000);
        this.kieContainer = kContainer;
    }

    @Test
    public void resultNotTest() {
        Anamnesis anamnesis = new Anamnesis();
        anamnesis.setAge(20);
        anamnesis.setWeight(70);
        anamnesis.setHeight(170);
        anamnesis.setGender(0);
        anamnesis.setTravelled(false);
        anamnesis.setInContact(false);
        anamnesis.setFever(false);
        anamnesis.setDryCough(false);
        anamnesis.setTiredness(false);
        anamnesis.setAches(false);
        anamnesis.setSoreThroat(false);
        anamnesis.setDiarrhoea(false);
        anamnesis.setConjuctivits(false);
        anamnesis.setHeadache(false);
        anamnesis.setLossOfTasteOrSmell(false);
        anamnesis.setRashDiscolouration(false);
        anamnesis.setDifficultyBreathing(false);
        anamnesis.setChestPains(false);
        anamnesis.setLossOfTasteOrSmell(false);
        anamnesis.setAsthma(false);
        anamnesis.setChronicKidney(false);
        anamnesis.setChronicLung(false);
        anamnesis.setDiabetes(false);
        anamnesis.setHemoglobinDisorder(false);
        anamnesis.setImmunocompromised(false);
        anamnesis.setLiverDisease(false);
        anamnesis.setHeartConditions(false);

        AnamnesisEvaluation evaluation = new AnamnesisEvaluation();
        evaluation.setRecoveryLocation(RecoveryLocation.Home);
        KieSession kieSession = kieContainer.newKieSession("rulesSession");
        kieSession.insert(anamnesis);
        kieSession.insert(evaluation);
        kieSession.fireAllRules();
        kieSession.dispose();

        assertFalse(evaluation.isShouldTest());
        assertEquals(evaluation.getHealthRisk(), 0, 0.1);
        assertEquals(evaluation.getHealthRistMultiplier(), 1, 0.1);
        assertEquals(evaluation.getInfectionRisk(), 0 ,0.1);
        assertEquals(evaluation.getInfectionRiskMultiplier(), 1, 0.1);

    }

    @Test
    public void resultTest() {
        Anamnesis anamnesis = new Anamnesis();
        anamnesis.setAge(20);
        anamnesis.setWeight(70);
        anamnesis.setHeight(170);
        anamnesis.setGender(0);
        anamnesis.setTravelled(true);
        anamnesis.setInContact(true);
        anamnesis.setFever(true);
        anamnesis.setDryCough(false);
        anamnesis.setTiredness(true);
        anamnesis.setAches(false);
        anamnesis.setSoreThroat(false);
        anamnesis.setDiarrhoea(false);
        anamnesis.setConjuctivits(true);
        anamnesis.setHeadache(false);
        anamnesis.setLossOfTasteOrSmell(true);
        anamnesis.setRashDiscolouration(false);
        anamnesis.setDifficultyBreathing(false);
        anamnesis.setChestPains(false);
        anamnesis.setLossOfTasteOrSmell(false);
        anamnesis.setAsthma(false);
        anamnesis.setChronicKidney(false);
        anamnesis.setChronicLung(false);
        anamnesis.setDiabetes(false);
        anamnesis.setHemoglobinDisorder(false);
        anamnesis.setImmunocompromised(false);
        anamnesis.setLiverDisease(false);
        anamnesis.setHeartConditions(false);

        AnamnesisEvaluation evaluation = new AnamnesisEvaluation();
        evaluation.setRecoveryLocation(RecoveryLocation.Home);
        KieSession kieSession = kieContainer.newKieSession("rulesSession");
        kieSession.insert(anamnesis);
        kieSession.insert(evaluation);
        kieSession.fireAllRules();
        kieSession.dispose();

        assertTrue(evaluation.isShouldTest());
        assertEquals(evaluation.getHealthRisk(), 4, 0.1);
        assertEquals(evaluation.getHealthRistMultiplier(), 1, 0.1);
        assertEquals(evaluation.getInfectionRisk(), 3 ,0.1);
        assertEquals(evaluation.getInfectionRiskMultiplier(), 4, 0.1);
    }

    @Test
    public void resultHome() {
        Anamnesis anamnesis = new Anamnesis();
        anamnesis.setAge(20);
        anamnesis.setWeight(70);
        anamnesis.setHeight(170);
        anamnesis.setGender(0);
        anamnesis.setTravelled(false);
        anamnesis.setInContact(false);
        anamnesis.setFever(false);
        anamnesis.setDryCough(false);
        anamnesis.setTiredness(false);
        anamnesis.setAches(false);
        anamnesis.setSoreThroat(false);
        anamnesis.setDiarrhoea(false);
        anamnesis.setConjuctivits(false);
        anamnesis.setHeadache(false);
        anamnesis.setLossOfTasteOrSmell(false);
        anamnesis.setRashDiscolouration(false);
        anamnesis.setDifficultyBreathing(false);
        anamnesis.setChestPains(false);
        anamnesis.setLossOfTasteOrSmell(false);
        anamnesis.setAsthma(false);
        anamnesis.setChronicKidney(false);
        anamnesis.setChronicLung(false);
        anamnesis.setDiabetes(false);
        anamnesis.setHemoglobinDisorder(false);
        anamnesis.setImmunocompromised(false);
        anamnesis.setLiverDisease(false);
        anamnesis.setHeartConditions(false);

        AnamnesisEvaluation evaluation = new AnamnesisEvaluation();
        evaluation.setRecoveryLocation(RecoveryLocation.Home);
        KieSession kieSession = kieContainer.newKieSession("rulesSession");
        kieSession.insert(anamnesis);
        kieSession.insert(evaluation);
        kieSession.fireAllRules();
        kieSession.dispose();

        assertEquals(evaluation.getRecoveryLocation(), RecoveryLocation.Home);
        assertEquals(evaluation.getHealthRisk(), 0, 0.1);
        assertEquals(evaluation.getHealthRistMultiplier(), 1, 0.1);
        assertEquals(evaluation.getInfectionRisk(), 0 ,0.1);
        assertEquals(evaluation.getInfectionRiskMultiplier(), 1, 0.1);
    }

    @Test
    public void resultIsolatedCare() {
        Anamnesis anamnesis = new Anamnesis();
        anamnesis.setAge(20);
        anamnesis.setWeight(70);
        anamnesis.setHeight(170);
        anamnesis.setGender(0);
        anamnesis.setTravelled(true);
        anamnesis.setInContact(true);
        anamnesis.setFever(false);
        anamnesis.setDryCough(true);
        anamnesis.setTiredness(true);
        anamnesis.setAches(false);
        anamnesis.setSoreThroat(false);
        anamnesis.setDiarrhoea(false);
        anamnesis.setConjuctivits(false);
        anamnesis.setHeadache(false);
        anamnesis.setLossOfTasteOrSmell(true);
        anamnesis.setRashDiscolouration(true);
        anamnesis.setDifficultyBreathing(false);
        anamnesis.setChestPains(false);
        anamnesis.setLossOfTasteOrSmell(false);
        anamnesis.setAsthma(false);
        anamnesis.setChronicKidney(false);
        anamnesis.setChronicLung(false);
        anamnesis.setDiabetes(false);
        anamnesis.setHemoglobinDisorder(false);
        anamnesis.setImmunocompromised(false);
        anamnesis.setLiverDisease(false);
        anamnesis.setHeartConditions(false);

        AnamnesisEvaluation evaluation = new AnamnesisEvaluation();
        evaluation.setRecoveryLocation(RecoveryLocation.Home);
        KieSession kieSession = kieContainer.newKieSession("rulesSession");
        kieSession.insert(anamnesis);
        kieSession.insert(evaluation);
        kieSession.fireAllRules();
        kieSession.dispose();

        assertEquals(evaluation.getRecoveryLocation(), RecoveryLocation.IsolatedCare);
        assertEquals(evaluation.getHealthRisk(), 4, 0.1);
        assertEquals(evaluation.getHealthRistMultiplier(), 1, 0.1);
        assertEquals(evaluation.getInfectionRisk(), 3 ,0.1);
        assertEquals(evaluation.getInfectionRiskMultiplier(), 4, 0.1);
    }

    @Test
    public void resultHospitalCare() {
        Anamnesis anamnesis = new Anamnesis();
        anamnesis.setAge(65);
        anamnesis.setWeight(70);
        anamnesis.setHeight(170);
        anamnesis.setGender(0);
        anamnesis.setTravelled(false);
        anamnesis.setInContact(true);
        anamnesis.setFever(true);
        anamnesis.setDryCough(false);
        anamnesis.setTiredness(false);
        anamnesis.setAches(true);
        anamnesis.setSoreThroat(true);
        anamnesis.setDiarrhoea(false);
        anamnesis.setConjuctivits(true);
        anamnesis.setHeadache(true);
        anamnesis.setLossOfTasteOrSmell(true);
        anamnesis.setRashDiscolouration(false);
        anamnesis.setDifficultyBreathing(false);
        anamnesis.setChestPains(false);
        anamnesis.setLossOfTasteOrSmell(false);
        anamnesis.setAsthma(false);
        anamnesis.setChronicKidney(false);
        anamnesis.setChronicLung(false);
        anamnesis.setDiabetes(false);
        anamnesis.setHemoglobinDisorder(false);
        anamnesis.setImmunocompromised(false);
        anamnesis.setLiverDisease(false);
        anamnesis.setHeartConditions(false);

        AnamnesisEvaluation evaluation = new AnamnesisEvaluation();
        evaluation.setRecoveryLocation(RecoveryLocation.Home);
        KieSession kieSession = kieContainer.newKieSession("rulesSession");
        kieSession.insert(anamnesis);
        kieSession.insert(evaluation);
        kieSession.fireAllRules();
        kieSession.dispose();

        assertEquals(evaluation.getRecoveryLocation(), RecoveryLocation.HospitalCare);
        assertEquals(evaluation.getHealthRisk(), 6, 0.1);
        assertEquals(evaluation.getHealthRistMultiplier(), 2.5, 0.1);
        assertEquals(evaluation.getInfectionRisk(), 5 ,0.1);
        assertEquals(evaluation.getInfectionRiskMultiplier(), 2, 0.1);
    }

    @Test
    public void resultIntensiveCare() {
        Anamnesis anamnesis = new Anamnesis();
        anamnesis.setAge(65);
        anamnesis.setWeight(70);
        anamnesis.setHeight(170);
        anamnesis.setGender(0);
        anamnesis.setTravelled(true);
        anamnesis.setInContact(false);
        anamnesis.setFever(false);
        anamnesis.setDryCough(false);
        anamnesis.setTiredness(false);
        anamnesis.setAches(false);
        anamnesis.setSoreThroat(false);
        anamnesis.setDiarrhoea(false);
        anamnesis.setConjuctivits(false);
        anamnesis.setHeadache(false);
        anamnesis.setLossOfTasteOrSmell(false);
        anamnesis.setRashDiscolouration(false);
        anamnesis.setDifficultyBreathing(false);
        anamnesis.setChestPains(true);
        anamnesis.setLossOfTasteOrSmell(true);
        anamnesis.setAsthma(false);
        anamnesis.setChronicKidney(false);
        anamnesis.setChronicLung(false);
        anamnesis.setDiabetes(false);
        anamnesis.setHemoglobinDisorder(true);
        anamnesis.setImmunocompromised(false);
        anamnesis.setLiverDisease(false);
        anamnesis.setHeartConditions(false);

        AnamnesisEvaluation evaluation = new AnamnesisEvaluation();
        evaluation.setRecoveryLocation(RecoveryLocation.Home);
        KieSession kieSession = kieContainer.newKieSession("rulesSession");
        kieSession.insert(anamnesis);
        kieSession.insert(evaluation);
        kieSession.fireAllRules();
        kieSession.dispose();

        assertEquals(evaluation.getRecoveryLocation(), RecoveryLocation.IntensiveCare);
        assertEquals(evaluation.getHealthRisk(), 55, 0.1);
        assertEquals(evaluation.getHealthRistMultiplier(), 2.5, 0.1);
        assertEquals(evaluation.getInfectionRisk(), 2 ,0.1);
        assertEquals(evaluation.getInfectionRiskMultiplier(), 2, 0.1);
    }


}
