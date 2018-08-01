package com.viviannecristina.santanderproject.domain;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Screen {

    private String title;
    private String fundName;
    @SerializedName("whatIs")
    private String whatIs;
    private String definition;
    private String riskTitle;
    private String infoTitle;

    private MoreInfo moreInfo;
    @SerializedName("risk")
    private Risk risk;
    private List<DownInfo> downInfo;


    private List<Info> info;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName;
    }

    public String getWhatIs() {
        return whatIs;
    }

    public void setWhatIs(String whatIs) {
        this.whatIs = whatIs;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getRiskTitle() {
        return riskTitle;
    }

    public void setRiskTitle(String riskTitle) {
        this.riskTitle = riskTitle;
    }

    public String getInfoTitle() {
        return infoTitle;
    }

    public void setInfoTitle(String infoTitle) {
        this.infoTitle = infoTitle;
    }

    public List<DownInfo> getDownInfo() {
        return downInfo;
    }

    public void setDownInfo(List<DownInfo> downInfo) {
        this.downInfo = downInfo;
    }

    public List<Info> getInfo() {
        return info;
    }

    public void setInfo(List<Info> info) {
        this.info = info;
    }

    public MoreInfo getMoreInfo() {
        return moreInfo;
    }

    public void setMoreInfo(MoreInfo moreInfo) {
        this.moreInfo = moreInfo;
    }

    public Risk getRisk() {
        return risk;
    }

    public void setRisk(Risk risk) {
        this.risk = risk;
    }
}
