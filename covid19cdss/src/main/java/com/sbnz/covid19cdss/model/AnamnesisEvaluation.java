package com.sbnz.covid19cdss.model;

import org.kie.api.definition.type.PropertyReactive;

@PropertyReactive
public class AnamnesisEvaluation {
    private double healthRisk;
    private double infectionRisk;

    private double healthRistMultiplier;
    private double infectionRiskMultiplier;

    private boolean shouldTest;

    private RecoveryLocation recoveryLocation;

    public AnamnesisEvaluation() {
        this.healthRisk = 0;
        this.infectionRisk = 0;
        this.healthRistMultiplier = 1;
        this.infectionRiskMultiplier = 1;
    }

    public double getHealthRisk() {
        return healthRisk;
    }

    public void setHealthRisk(double healthRisk) {
        this.healthRisk = healthRisk;
    }

    public double getInfectionRisk() {
        return infectionRisk;
    }

    public void setInfectionRisk(double infectionRisk) {
        this.infectionRisk = infectionRisk;
    }
    public void setInfectionRisk(int infectionRisk) {
        this.infectionRisk = infectionRisk;
    }

    public boolean isShouldTest() {
        return shouldTest;
    }

    public void setShouldTest(boolean shouldTest) {
        this.shouldTest = shouldTest;
    }

    public RecoveryLocation getRecoveryLocation() {
        return recoveryLocation;
    }

    public void setRecoveryLocation(RecoveryLocation recoveryLocation) {
        this.recoveryLocation = recoveryLocation;
    }

    public double getHealthRistMultiplier() {
        return healthRistMultiplier;
    }

    public void setHealthRistMultiplier(double healthRistMultiplier) {
        this.healthRistMultiplier = healthRistMultiplier;
    }

    public double getInfectionRiskMultiplier() {
        return infectionRiskMultiplier;
    }

    public void setInfectionRiskMultiplier(double infectionRiskMultiplier) {
        this.infectionRiskMultiplier = infectionRiskMultiplier;
    }
}
