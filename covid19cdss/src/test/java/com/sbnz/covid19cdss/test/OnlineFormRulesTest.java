package com.sbnz.covid19cdss.test;

import com.sbnz.covid19cdss.model.OnlineEvaluation;
import com.sbnz.covid19cdss.model.OnlineForm;
import com.sbnz.covid19cdss.model.OnlineInstruction;
import com.sbnz.covid19cdss.service.OnlineFormService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.kie.api.KieServices;
import org.kie.api.builder.KieScanner;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class OnlineFormRulesTest {

    private KieContainer kieContainer;

    @Autowired
    private OnlineFormService service;

    public OnlineFormRulesTest() {
        KieServices ks = KieServices.Factory.get();
        KieContainer kContainer = ks
                .newKieContainer(ks.newReleaseId("sbnz.integracija", "drools-spring-kjar", "0.0.1-SNAPSHOT"));
        KieScanner kScanner = ks.newKieScanner(kContainer);
        kScanner.start(10_000);
        this.kieContainer = kContainer;
    }

    @Test
    public void resultHome() {
        OnlineForm form = new OnlineForm();
        form.setAge(20);
        form.setRiskGroup(false);
        form.setTravelled(false);
        form.setInContact(false);
        form.setFever(false);
        form.setDryCough(false);
        form.setTiredness(false);
        form.setAches(false);
        form.setSoreThroat(false);
        form.setDiarrhoea(false);
        form.setConjuctivits(false);
        form.setHeadache(false);
        form.setLossOfTasteOrSmell(false);
        form.setRashDiscolouration(false);
        form.setDifficultyBreathing(false);
        form.setChestPains(false);
        form.setLossOfSpeachOrMovement(false);

        OnlineEvaluation evaluation = service.evaulateOnlineForm(form);

        assertEquals(evaluation.getInstruction(), OnlineInstruction.StayHome);
        assertEquals(evaluation.getScore(), 0, 0.1);
        assertEquals(evaluation.getScoreMultiplier(), 1, 0.1);
    }

    @Test
    public void resultHealthCenter() {
        OnlineForm form = new OnlineForm();
        form.setAge(20);
        form.setRiskGroup(true);
        form.setTravelled(false);
        form.setInContact(true);
        form.setFever(false);
        form.setDryCough(true);
        form.setTiredness(true);
        form.setAches(false);
        form.setSoreThroat(false);
        form.setDiarrhoea(false);
        form.setConjuctivits(false);
        form.setHeadache(false);
        form.setLossOfTasteOrSmell(true);
        form.setRashDiscolouration(false);
        form.setDifficultyBreathing(false);
        form.setChestPains(false);
        form.setLossOfSpeachOrMovement(false);

        OnlineEvaluation evaluation = service.evaulateOnlineForm(form);

        assertEquals(evaluation.getInstruction(), OnlineInstruction.VisitHealthCenter);
        assertEquals(evaluation.getScore(), 7, 0.1);
        assertEquals(evaluation.getScoreMultiplier(), 2, 0.1);
    }

    @Test
    public void resultHospital() {
        OnlineForm form = new OnlineForm();
        form.setAge(65);
        form.setRiskGroup(true);
        form.setTravelled(true);
        form.setInContact(false);
        form.setFever(false);
        form.setDryCough(true);
        form.setTiredness(false);
        form.setAches(false);
        form.setSoreThroat(false);
        form.setDiarrhoea(false);
        form.setConjuctivits(false);
        form.setHeadache(false);
        form.setLossOfTasteOrSmell(true);
        form.setRashDiscolouration(false);
        form.setDifficultyBreathing(false);
        form.setChestPains(false);
        form.setLossOfSpeachOrMovement(false);

        OnlineEvaluation evaluation = service.evaulateOnlineForm(form);

        assertEquals(evaluation.getInstruction(), OnlineInstruction.VisitHospital);
        assertEquals(evaluation.getScore(), 6, 0.1);
        assertEquals(evaluation.getScoreMultiplier(), 5, 0.1);
    }

    @Test
    public void resultEmergency() {
        OnlineForm form = new OnlineForm();
        form.setAge(65);
        form.setRiskGroup(false);
        form.setTravelled(false);
        form.setInContact(false);
        form.setFever(false);
        form.setDryCough(false);
        form.setTiredness(true);
        form.setAches(false);
        form.setSoreThroat(false);
        form.setDiarrhoea(false);
        form.setConjuctivits(false);
        form.setHeadache(false);
        form.setLossOfTasteOrSmell(false);
        form.setRashDiscolouration(false);
        form.setDifficultyBreathing(true);
        form.setChestPains(false);
        form.setLossOfSpeachOrMovement(false);

        OnlineEvaluation evaluation = service.evaulateOnlineForm(form);

        assertEquals(evaluation.getInstruction(), OnlineInstruction.GoToEmergencyHospital);
        assertEquals(evaluation.getScore(), 51, 0.1);
        assertEquals(evaluation.getScoreMultiplier(), 2.5, 0.1);
    }
}
