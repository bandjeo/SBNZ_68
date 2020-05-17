package com.sbnz.covid19cdss.model;

public class OnlineEvaluation {

    private double score;
    private double scoreMultiplier;
    private String status;

    public OnlineEvaluation() {
        score = 0;
        this.scoreMultiplier = 1;
    }

    public OnlineEvaluation(double score, String status, double scoreMultiplier) {
        this.score = score;
        this.status = status;
        this.scoreMultiplier = scoreMultiplier;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getScoreMultiplier() {
        return scoreMultiplier;
    }

    public void setScoreMultiplier(double scoreMultiplier) {
        this.scoreMultiplier = scoreMultiplier;
    }
}
