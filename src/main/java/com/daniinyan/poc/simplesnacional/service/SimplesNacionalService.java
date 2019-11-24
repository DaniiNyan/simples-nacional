package com.daniinyan.poc.simplesnacional.service;

import com.daniinyan.poc.simplesnacional.domain.Company;
import com.daniinyan.poc.simplesnacional.repository.Attachment;
import io.reactivex.rxjava3.core.Observable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimplesNacionalService {

    public Map<Company, Double> calculate(List<Company> companies) {
        final Map<Company, Double> simplesNacional = new HashMap<>();

        Observable.fromIterable(companies)
                .map(this::getEffectiveAliquot)
                .subscribe(company -> {
                    final Double result = company.getCalculationBasis() * company.getEffectiveAliquot();
                     simplesNacional.put(company, result);
                });

        return simplesNacional;
    }

    private Company getEffectiveAliquot(Company company) {
        Attachment attachment = company.getAttachment();
        Double lastYearRevenue = company.getLastYearRevenue();

        Observable.fromIterable(attachment.getTaxes())
                .filter(tax -> lastYearRevenue >= tax.getFrom() && lastYearRevenue <= tax.getTo())
                .map(tax -> {
                    final Double effectiveAliquot =
                            ((lastYearRevenue * tax.getReferenceAliquot()) - tax.getDeducePortion()) / lastYearRevenue;
                    company.setEffectiveAliquot(effectiveAliquot);
                    return tax;
                })
                .subscribe();

        return company;
    }
}
