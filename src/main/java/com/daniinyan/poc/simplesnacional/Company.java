package com.daniinyan.poc.simplesnacional;

public class Company {
    private String name;
    private String attachment;
    private Double lastYearRevenue;

    public Company(String name, String attachment, Double lastYearRevenue) {
        this.name = name;
        this.attachment = attachment;
        this.lastYearRevenue = lastYearRevenue;
    }

    public String getName() {
        return name;
    }

    public String getAttachment() {
        return attachment;
    }

    public Double getLastYearRevenue() {
        return lastYearRevenue;
    }

    public Double getAliquot() {
        return 0.18;
    }

    public Double getDeducePortion() {
        return 4500D;
    }
}
