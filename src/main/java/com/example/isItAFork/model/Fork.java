package com.example.isItAFork.model;

public class Fork {
    private String firstSiteName, secondSiteName;
    private Double firstOdd, secondOdd;
    private String firstTeamName, secondTeamName;

    public Fork(String firstSiteName, String secondSiteName, Double firstOdd, Double secondOdd, String firstTeamName, String secondTeamName) {
        this.firstSiteName = firstSiteName;
        this.secondSiteName = secondSiteName;
        this.firstOdd = firstOdd;
        this.secondOdd = secondOdd;
        this.firstTeamName = firstTeamName;
        this.secondTeamName = secondTeamName;
    }

    public String getFirstSiteName() {
        return firstSiteName;
    }
    public String getSecondSiteName() {
        return secondSiteName;
    }
    public Double getFirstOdd() {
        return firstOdd;
    }
    public Double getSecondOdd() {
        return secondOdd;
    }
    public String getFirstTeamName() {
        return firstTeamName;
    }
    public String getSecondTeamName() {
        return secondTeamName;
    }

    public void setFirstSiteName(String firstSiteName) {
        this.firstSiteName = firstSiteName;
    }
    public void setSecondSiteName(String secondSiteName) {
        this.secondSiteName = secondSiteName;
    }
    public void setFirstOdd(Double firstOdd) {
        this.firstOdd = firstOdd;
    }
    public void setSecondOdd(Double secondOdd) {
        this.secondOdd = secondOdd;
    }
    public void setFirstTeamName(String firstTeamName) {
        this.firstTeamName = firstTeamName;
    }
    public void setSecondTeamName(String secondTeamName) {
        this.secondTeamName = secondTeamName;
    }
}
