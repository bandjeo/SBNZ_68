package com.sbnz.covid19cdss.model;

public class OnlineForm {
    // personal info
    private int age;
    private boolean riskGroup;
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

    public OnlineForm() {
    }

    public OnlineForm(int age, boolean riskGroup, boolean fever, boolean dryCough, boolean tiredness, boolean aches,
                      boolean soreThroat, boolean diarrhoea, boolean conjuctivits, boolean headache,
                      boolean loosOfTaseOrSmell, boolean rashDiscolouration, boolean difficultyBreathing,
                      boolean chestPains, boolean lossOfSpeachOrMovement, boolean travelled, boolean inContact) {
        this.age = age;
        this.riskGroup = riskGroup;
        this.travelled = travelled;
        this.inContact = inContact;
        this.fever = fever;
        this.dryCough = dryCough;
        this.tiredness = tiredness;
        this.aches = aches;
        this.soreThroat = soreThroat;
        this.diarrhoea = diarrhoea;
        this.conjuctivits = conjuctivits;
        this.headache = headache;
        this.lossOfTasteOrSmell = loosOfTaseOrSmell;
        this.rashDiscolouration = rashDiscolouration;
        this.difficultyBreathing = difficultyBreathing;
        this.chestPains = chestPains;
        this.lossOfSpeachOrMovement = lossOfSpeachOrMovement;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isRiskGroup() {
        return riskGroup;
    }

    public void setRiskGroup(boolean riskGroup) {
        this.riskGroup = riskGroup;
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
}
