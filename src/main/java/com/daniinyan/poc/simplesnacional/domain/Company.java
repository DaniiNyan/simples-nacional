package com.daniinyan.poc.simplesnacional.domain;

import com.daniinyan.poc.simplesnacional.repository.Attachment;

public class Company {

    private Attachment attachment;
    private Double calculationBasis;
    private Double lastYearRevenue;


    public Company(Attachment attachment, Double calculationBasis, Double lastYearRevenue) {
        this.attachment = attachment;
        this.calculationBasis = calculationBasis;
        this.lastYearRevenue = lastYearRevenue;
    }

    public Attachment getAttachment() {
        return attachment;
    }
    public Double getCalculationBasis() {
        return calculationBasis;
    }

    public Double getLastYearRevenue() {
        return lastYearRevenue;
    }
}
