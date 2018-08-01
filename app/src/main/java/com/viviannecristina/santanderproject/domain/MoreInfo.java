package com.viviannecristina.santanderproject.domain;

import com.google.gson.annotations.SerializedName;

public class MoreInfo {

    private Month month;
    private Year year;
    @SerializedName("12months")
    private TwelveMonths months;


    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public TwelveMonths getMonths() {
        return months;
    }

    public void setMonths(TwelveMonths months) {
        this.months = months;
    }

    private class Month {

        private Double fund;
        @SerializedName("CDI")
        private Double cdi;

    }

    private class Year {

        private Double fund;
        @SerializedName("CDI")
        private Double cdi;

    }

   private class TwelveMonths {

        private Double fund;
        @SerializedName("CDI")
        private Double cdi;

    }

}
