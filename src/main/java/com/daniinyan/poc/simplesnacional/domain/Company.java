package com.daniinyan.poc.simplesnacional.domain;

public class Company {
    private String name;
    private Attachment attachment;
    private Double lastYearRevenue;

    public Company(String name, Attachment attachment, Double lastYearRevenue) {
        this.name = name;
        this.attachment = attachment;
        this.lastYearRevenue = lastYearRevenue;

        this.attachment.setLastYearRevenue(this.lastYearRevenue);
    }

    public Double getLastYearRevenue() {
        return lastYearRevenue;
    }

    public Double getAliquot() {
        return attachment.getAliquot();
    }

    public Double getDeducePortion() {
        return attachment.getDeducePortion();
    }
}
