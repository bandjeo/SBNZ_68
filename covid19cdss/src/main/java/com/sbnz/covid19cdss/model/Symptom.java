package com.sbnz.covid19cdss.model;

public class Symptom {
    private String name;
    private SymptomType type;
    private int score;
    private boolean value;

    public Symptom(String name, SymptomType type, int score, boolean value) {
        this.name = name;
        this.type = type;
        this.score = score;
        this.value = value;
    }

    public Symptom() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SymptomType getType() {
        return type;
    }

    public void setType(SymptomType type) {
        this.type = type;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean isValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }
}
