package com.sbnz.covid19cdss.model;

import org.kie.api.definition.type.PropertyReactive;

public class Anamnesis {
    // personal info
    private int age;
    private int weight;
    private int height;
    private int gender;
    private boolean travelled;
    private boolean inContact;
    // common symptoms
    private boolean fever;
    private boolean dryCough;
    private boolean tiredness;
    // uncommon symptoms
    private boolean aches;
    private boolean soreThroat;
    private boolean diarrhoea;
    private boolean conjuctivits;
    private boolean headache;
    private boolean lossOfTasteOrSmell;
    private boolean rashDiscolouration;
    // severe symptoms
    private boolean difficultyBreathing;
    private boolean chestPains;
    private boolean lossOfSpeachOrMovement;
    // underlying conditions
    private boolean asthma;
    private boolean chronicKidney;
    private boolean chronicLung;
    private boolean diabetes;
    private boolean hemoglobinDisorder;
    private boolean immunocompromised;
    private boolean liverDisease;
    private boolean heartConditions;




    private boolean riskGroup;
    private boolean obese;


    public Anamnesis() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public boolean isTravelled() {
        return travelled;
    }

    public void setTravelled(boolean travelled) {
        this.travelled = travelled;
    }

    public boolean isInContact() {
        return inContact;
    }

    public void setInContact(boolean inContact) {
        this.inContact = inContact;
    }

    public boolean isFever() {
        return fever;
    }

    public void setFever(boolean fever) {
        this.fever = fever;
    }

    public boolean isDryCough() {
        return dryCough;
    }

    public void setDryCough(boolean dryCough) {
        this.dryCough = dryCough;
    }

    public boolean isTiredness() {
        return tiredness;
    }

    public void setTiredness(boolean tiredness) {
        this.tiredness = tiredness;
    }

    public boolean isAches() {
        return aches;
    }

    public void setAches(boolean aches) {
        this.aches = aches;
    }

    public boolean isSoreThroat() {
        return soreThroat;
    }

    public void setSoreThroat(boolean soreThroat) {
        this.soreThroat = soreThroat;
    }

    public boolean isDiarrhoea() {
        return diarrhoea;
    }

    public void setDiarrhoea(boolean diarrhoea) {
        this.diarrhoea = diarrhoea;
    }

    public boolean isConjuctivits() {
        return conjuctivits;
    }

    public void setConjuctivits(boolean conjuctivits) {
        this.conjuctivits = conjuctivits;
    }

    public boolean isHeadache() {
        return headache;
    }

    public void setHeadache(boolean headache) {
        this.headache = headache;
    }

    public boolean isLossOfTasteOrSmell() {
        return lossOfTasteOrSmell;
    }

    public void setLossOfTasteOrSmell(boolean lossOfTasteOrSmell) {
        this.lossOfTasteOrSmell = lossOfTasteOrSmell;
    }

    public boolean isRashDiscolouration() {
        return rashDiscolouration;
    }

    public void setRashDiscolouration(boolean rashDiscolouration) {
        this.rashDiscolouration = rashDiscolouration;
    }

    public boolean isDifficultyBreathing() {
        return difficultyBreathing;
    }

    public void setDifficultyBreathing(boolean difficultyBreathing) {
        this.difficultyBreathing = difficultyBreathing;
    }

    public boolean isChestPains() {
        return chestPains;
    }

    public void setChestPains(boolean chestPains) {
        this.chestPains = chestPains;
    }

    public boolean isLossOfSpeachOrMovement() {
        return lossOfSpeachOrMovement;
    }

    public void setLossOfSpeachOrMovement(boolean lossOfSpeachOrMovement) {
        this.lossOfSpeachOrMovement = lossOfSpeachOrMovement;
    }

    public boolean isAsthma() {
        return asthma;
    }

    public void setAsthma(boolean asthma) {
        this.asthma = asthma;
    }

    public boolean isChronicKidney() {
        return chronicKidney;
    }

    public void setChronicKidney(boolean chronicKidney) {
        this.chronicKidney = chronicKidney;
    }

    public boolean isChronicLung() {
        return chronicLung;
    }

    public void setChronicLung(boolean chronicLung) {
        this.chronicLung = chronicLung;
    }

    public boolean isDiabetes() {
        return diabetes;
    }

    public void setDiabetes(boolean diabetes) {
        this.diabetes = diabetes;
    }

    public boolean isHemoglobinDisorder() {
        return hemoglobinDisorder;
    }

    public void setHemoglobinDisorder(boolean hemoglobinDisorder) {
        this.hemoglobinDisorder = hemoglobinDisorder;
    }

    public boolean isImmunocompromised() {
        return immunocompromised;
    }

    public void setImmunocompromised(boolean immunocompromised) {
        this.immunocompromised = immunocompromised;
    }

    public boolean isLiverDisease() {
        return liverDisease;
    }

    public void setLiverDisease(boolean liverDisease) {
        this.liverDisease = liverDisease;
    }

    public boolean isHeartConditions() {
        return heartConditions;
    }

    public void setHeartConditions(boolean heartConditions) {
        this.heartConditions = heartConditions;
    }

    public boolean isRiskGroup() {
        return riskGroup;
    }

    public void setRiskGroup(boolean riskGroup) {
        this.riskGroup = riskGroup;
    }

    public boolean isObese() {
        return obese;
    }

    public void setObese(boolean obese) {
        this.obese = obese;
    }
}
