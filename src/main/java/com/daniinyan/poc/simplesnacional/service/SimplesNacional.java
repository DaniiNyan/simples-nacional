package com.daniinyan.poc.simplesnacional.service;

import com.daniinyan.poc.simplesnacional.domain.Company;

public class SimplesNacional {

    private final Integer MONTHS = 10;

    public Double calculate(Company company) {
        Double lastYearRevenue = company.getLastYearRevenue();
        Double aliquot = company.getAliquot();
        Double deducePortion = company.getDeducePortion();

        Double result = (lastYearRevenue * aliquot) - deducePortion;
        Double effectiveAliquot = result / lastYearRevenue;

        Double monthRevenue = lastYearRevenue / MONTHS;
        return monthRevenue * effectiveAliquot;
    }

}
