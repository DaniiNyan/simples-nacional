package com.daniinyan.poc.simplesnacional.service;

import com.daniinyan.poc.simplesnacional.domain.Company;
import com.daniinyan.poc.simplesnacional.repository.Attachment;

public class SimplesNacionalService {

    public Double calculate(Company company) {
        Double effectiveAliquot = getEffectiveAliquot(company);
        return company.getCalculationBasis() * effectiveAliquot;
    }

    private Double getEffectiveAliquot(Company company) {
        Attachment attachment = company.getAttachment();
        Double lastYearRevenue = company.getLastYearRevenue();
        Double referenceAliquot = attachment.getReferenceAliquot(lastYearRevenue);
        Double deducePortion = attachment.getDeducePortion(lastYearRevenue);

        return (lastYearRevenue * referenceAliquot) - deducePortion;
    }
}
