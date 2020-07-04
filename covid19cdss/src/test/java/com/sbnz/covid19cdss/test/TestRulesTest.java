package com.sbnz.covid19cdss.test;

import com.sbnz.covid19cdss.model.TestsReview;
import com.sbnz.covid19cdss.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.kie.api.KieServices;
import org.kie.api.builder.KieScanner;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TestRulesTest {


    private KieContainer kieContainer;

    public TestRulesTest() {
        KieServices ks = KieServices.Factory.get();
        KieContainer kContainer = ks
                .newKieContainer(ks.newReleaseId("sbnz.integracija", "drools-spring-kjar", "0.0.1-SNAPSHOT"));
        KieScanner kScanner = ks.newKieScanner(kContainer);
        kScanner.start(10_000);
        this.kieContainer = kContainer;
    }


    @Test
    public void OnlyOneNegative() {
        com.sbnz.covid19cdss.model.Test t1 = new com.sbnz.covid19cdss.model.Test();
        t1.setResult(false);
        t1.setTimestamp(new Date());

        List<com.sbnz.covid19cdss.model.Test> tests = new ArrayList<>();
        tests.add(t1);

        TestsReview review = new TestsReview();
        review.setDischarge(false);
        KieSession kieSession = kieContainer.newKieSession("cep_rulesSession");
//        kieSession.getAgenda().getAgendaGroup("Online form").setFocus();
        for (com.sbnz.covid19cdss.model.Test t : tests) {
            kieSession.insert(t);
        }
        kieSession.insert(review);
        kieSession.fireAllRules();
        kieSession.dispose();
        assertFalse(review.isDischarge());
    }

    @Test
    public void OnlyOnePositive() {
        Date currentTime = new Date();
        com.sbnz.covid19cdss.model.Test t1 = new com.sbnz.covid19cdss.model.Test();
        t1.setResult(true);
        t1.setTimestamp(currentTime);

        List<com.sbnz.covid19cdss.model.Test> tests = new ArrayList<>();
        tests.add(t1);

        TestsReview review = new TestsReview();
        review.setDischarge(false);
        KieSession kieSession = kieContainer.newKieSession("cep_rulesSession");
//        kieSession.getAgenda().getAgendaGroup("Online form").setFocus();
        for (com.sbnz.covid19cdss.model.Test t : tests) {
            kieSession.insert(t);
        }
        kieSession.insert(review);
        kieSession.fireAllRules();
        kieSession.dispose();
        assertFalse(review.isDischarge());

    }

    @Test
    public void LastTestPositive() {
        Date currentTime = new Date();
        com.sbnz.covid19cdss.model.Test t1 = new com.sbnz.covid19cdss.model.Test();
        t1.setResult(true);
        t1.setTimestamp(new Date(currentTime.getTime() + 30000));
        com.sbnz.covid19cdss.model.Test t2 = new com.sbnz.covid19cdss.model.Test();
        t2.setResult(false);
        t2.setTimestamp(new Date(currentTime.getTime() + 21000));
        com.sbnz.covid19cdss.model.Test t3 = new com.sbnz.covid19cdss.model.Test();
        t3.setResult(false);
        t3.setTimestamp(new Date(currentTime.getTime()));

        List<com.sbnz.covid19cdss.model.Test> tests = new ArrayList<>();
        tests.add(t1);
        tests.add(t2);
        tests.add(t3);

        TestsReview review = new TestsReview();
        review.setDischarge(false);
        KieSession kieSession = kieContainer.newKieSession("cep_rulesSession");
//        kieSession.getAgenda().getAgendaGroup("Online form").setFocus();
        for (com.sbnz.covid19cdss.model.Test t : tests) {
            kieSession.insert(t);
        }
        kieSession.insert(review);
        kieSession.fireAllRules();
        kieSession.dispose();
        assertFalse(review.isDischarge());

    }

    @Test
    public void LastTestNegative_HasNegative_HasPositiveInBetween() {
        Date currentTime = new Date();
        com.sbnz.covid19cdss.model.Test t1 = new com.sbnz.covid19cdss.model.Test();
        t1.setResult(false);
        t1.setTimestamp(new Date(currentTime.getTime() + 30000));
        com.sbnz.covid19cdss.model.Test t2 = new com.sbnz.covid19cdss.model.Test();
        t2.setResult(true);
        t2.setTimestamp(new Date(currentTime.getTime() + 15000));
        com.sbnz.covid19cdss.model.Test t3 = new com.sbnz.covid19cdss.model.Test();
        t3.setResult(false);
        t3.setTimestamp(new Date(currentTime.getTime()));

        List<com.sbnz.covid19cdss.model.Test> tests = new ArrayList<>();
        tests.add(t1);
        tests.add(t2);
        tests.add(t3);
        TestsReview review = new TestsReview();
        review.setDischarge(false);
        KieSession kieSession = kieContainer.newKieSession("cep_rulesSession");
//        kieSession.getAgenda().getAgendaGroup("Online form").setFocus();
        for (com.sbnz.covid19cdss.model.Test t : tests) {
            kieSession.insert(t);
        }
        kieSession.insert(review);
        kieSession.fireAllRules();
        kieSession.dispose();
        assertFalse(review.isDischarge());

    }

    @Test
    public void LastTestNegative_HasNegative_NoPositiveInBetween() {
        Date currentTime = new Date();
        com.sbnz.covid19cdss.model.Test t1 = new com.sbnz.covid19cdss.model.Test();
        t1.setResult(false);
        t1.setTimestamp(new Date(currentTime.getTime() + 30000));
        com.sbnz.covid19cdss.model.Test t2 = new com.sbnz.covid19cdss.model.Test();
        t2.setResult(false);
        t2.setTimestamp(new Date(currentTime.getTime() + 21000));
        com.sbnz.covid19cdss.model.Test t3 = new com.sbnz.covid19cdss.model.Test();
        t3.setResult(false);
        t3.setTimestamp(new Date(currentTime.getTime()));

        List<com.sbnz.covid19cdss.model.Test> tests = new ArrayList<>();
        tests.add(t1);
        tests.add(t2);
        tests.add(t3);

        TestsReview review = new TestsReview();
        review.setDischarge(false);
        KieSession kieSession = kieContainer.newKieSession("cep_rulesSession");
//        kieSession.getAgenda().getAgendaGroup("Online form").setFocus();
        for (com.sbnz.covid19cdss.model.Test t : tests) {
            kieSession.insert(t);
        }
        kieSession.insert(review);
        kieSession.fireAllRules();
        kieSession.dispose();
        assertTrue(review.isDischarge());

    }
}
