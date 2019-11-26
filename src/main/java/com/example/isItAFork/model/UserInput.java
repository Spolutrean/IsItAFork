package com.example.isItAFork.model;

public class UserInput {
    private String firstTeamName = "Team #1", secondTeamName = "Team #2";
    private String firstSiteName = "Site #1", secondSiteName = "Site #2";
    private Double firstSiteOdd1, firstSiteOdd2;
    private Double secondSiteOdd1, secondSiteOdd2;
    //private List<EventInformation> events = new ArrayList<>();

    public void setFirstTeamName(String firstTeamName) {
        this.firstTeamName = firstTeamName;
    }
    public void setSecondTeamName(String secondTeamName) {
        this.secondTeamName = secondTeamName;
    }
    public void setFirstSiteName(String firstSiteName) {
        this.firstSiteName = firstSiteName;
    }
    public void setSecondSiteName(String secondSiteName) {
        this.secondSiteName = secondSiteName;
    }
    public void setFirstSiteOdd1(Double firstSiteOdd1) {
        this.firstSiteOdd1 = firstSiteOdd1;
    }
    public void setFirstSiteOdd2(Double firstSiteOdd2) {
        this.firstSiteOdd2 = firstSiteOdd2;
    }
    public void setSecondSiteOdd1(Double secondSiteOdd1) {
        this.secondSiteOdd1 = secondSiteOdd1;
    }
    public void setSecondSiteOdd2(Double secondSiteOdd2) {
        this.secondSiteOdd2 = secondSiteOdd2;
    }

    public String getFirstTeamName() {
        return firstTeamName;
    }
    public String getSecondTeamName() {
        return secondTeamName;
    }
    public String getFirstSiteName() {
        return firstSiteName;
    }
    public String getSecondSiteName() {
        return secondSiteName;
    }
    public Double getFirstSiteOdd1() {
        return firstSiteOdd1;
    }
    public Double getFirstSiteOdd2() {
        return firstSiteOdd2;
    }
    public Double getSecondSiteOdd1() {
        return secondSiteOdd1;
    }
    public Double getSecondSiteOdd2() {
        return secondSiteOdd2;
    }

    public class EventInformation {
        public String siteName;
        public Double firstOdd, secondOdd;

        public void setSiteName(String siteName) {
            this.siteName = siteName;
        }
        public void setFirstOdd(Double firstOdd) {
            this.firstOdd = firstOdd;
        }
        public void setSecondOdd(Double secondOdd) {
            this.secondOdd = secondOdd;
        }

        public String getSiteName() {
            return siteName;
        }
        public Double getFirstOdd() {
            return firstOdd;
        }
        public Double getSecondOdd() {
            return secondOdd;
        }
    }
}
