package com.daniinyan.poc.simplesnacional.domain;

public class Tax {

    private Double from;
    private Double to;
    private Double referenceAliquot;
    private Double deducePortion;

    public Double getFrom() {
        return from;
    }

    public Tax from(Double from) {
        this.from = from;
        return this;
    }

    public Double getTo() {
        return to;
    }

    public Tax to(Double to) {
        this.to = to;
        return this;
    }

    public Double getReferenceAliquot() {
        return referenceAliquot;
    }

    public Tax referenceAliquot(Double referenceAliquot) {
        this.referenceAliquot = referenceAliquot;
        return this;
    }

    public Double getDeducePortion() {
        return deducePortion;
    }

    public Tax deducePortion(Double deducePortion) {
        this.deducePortion = deducePortion;
        return this;
    }
}
