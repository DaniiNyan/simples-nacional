package com.daniinyan.poc.simplesnacional.domain;

public class AttachmentFive implements Attachment {

    private final Double ALIQUOT_ONE = 0.155;
    private final Double ALIQUOT_TWO = 0.18;
    private final Double ALIQUOT_THREE = 0.195;
    private final Double ALIQUOT_FOUR = 0.205;
    private final Double ALIQUOT_FIVE = 0.23;
    private final Double ALIQUOT_SIX = 0.305;

    private final Double DEDUCE_ONE = 0D;
    private final Double DEDUCE_TWO = 4_500D;
    private final Double DEDUCE_THREE = 9_900D;
    private final Double DEDUCE_FOUR = 17_100D;
    private final Double DEDUCE_FIVE = 62_100D;
    private final Double DEDUCE_SIX = 540_000D;

    private Integer group;
    private Double lastYearRevenue;

    @Override
    public Double getAliquot() {
        switch (this.group) {
            case 1: return ALIQUOT_ONE;
            case 2: return ALIQUOT_TWO;
            case 3: return ALIQUOT_THREE;
            case 4: return ALIQUOT_FOUR;
            case 5: return ALIQUOT_FIVE;
            case 6: return ALIQUOT_SIX;
            default: return 0D;
        }
    }

    @Override
    public Double getDeducePortion() {
        switch (this.group) {
            case 1: return DEDUCE_ONE;
            case 2: return DEDUCE_TWO;
            case 3: return DEDUCE_THREE;
            case 4: return DEDUCE_FOUR;
            case 5: return DEDUCE_FIVE;
            case 6: return DEDUCE_SIX;
            default: return 0D;
        }
    }

    @Override
    public void setLastYearRevenue(Double lastYearRevenue) {
        this.lastYearRevenue = lastYearRevenue;
        setGroup();
    }

    @Override
    public void setGroup() {
        if (this.lastYearRevenue <= 180_000) {
            this.group = 1;

        } else if (this.lastYearRevenue <= 360_000) {
            this.group = 2;

        } else if (this.lastYearRevenue <= 720_000) {
            this.group = 3;

        } else if (this.lastYearRevenue <= 1_800_000) {
            this.group = 4;

        } else if (this.lastYearRevenue <= 3_600_000) {
            this.group = 5;

        } else if (this.lastYearRevenue <= 4_800_000) {
            this.group = 6;
        }
    }
}
