package com.sbnz.covid19cdss.model;

public class OnlineEvaluation {

    private double score;
    private double scoreMultiplier;
    private OnlineInstruction instruction;

    public OnlineEvaluation() {
        this.score = 0;
        this.scoreMultiplier = 1;
    }

    public OnlineEvaluation(double score, double scoreMultiplier, OnlineInstruction instruction) {
        this.score = score;
        this.scoreMultiplier = scoreMultiplier;
        this.instruction = instruction;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getScoreMultiplier() {
        return scoreMultiplier;
    }

    public void setScoreMultiplier(double scoreMultiplier) {
        this.scoreMultiplier = scoreMultiplier;
    }

    public OnlineInstruction getInstruction() {
        return instruction;
    }

    public void setInstruction(OnlineInstruction instruction) {
        this.instruction = instruction;
    }
}
