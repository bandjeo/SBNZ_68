package com.sbnz.covid19cdss.model;

public class TestsReview {
    private boolean oneNegativeTest = true;

    private boolean discharge = false;

    public TestsReview() {
    }

    public boolean isOneNegativeTest() {
        return oneNegativeTest;
    }

    public void setOneNegativeTest(boolean oneNegativeTest) {
        this.oneNegativeTest = oneNegativeTest;
    }

    public boolean isDischarge() {
        return discharge;
    }

    public void setDischarge(boolean discharge) {
        this.discharge = discharge;
    }
}
