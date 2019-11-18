package com.daniinyan.poc.simplesnacional.repository;

import io.reactivex.rxjava3.core.Observable;

public interface Attachment {
    Observable<Double> getReferenceAliquot(Double lastYearRevenue);
    Double getDeducePortion(Double lastYearRevenue);
}
