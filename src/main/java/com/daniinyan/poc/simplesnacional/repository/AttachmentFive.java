package com.daniinyan.poc.simplesnacional.repository;

import com.daniinyan.poc.simplesnacional.domain.Tax;
import io.reactivex.rxjava3.core.Observable;

import java.util.ArrayList;
import java.util.List;

public class AttachmentFive implements Attachment {

    private List<Tax> taxes = new ArrayList<>();

    public AttachmentFive() {
        taxes.add(new Tax().from(0D).to(180_000D)
                .referenceAliquot(0.155).deducePortion(0D));

        taxes.add(new Tax().from(180_000.01).to(360_000D)
                .referenceAliquot(0.18).deducePortion(4_500D));

        taxes.add(new Tax().from(360_000.01).to(720_000D)
                .referenceAliquot(0.195).deducePortion(9_900D));

        taxes.add(new Tax().from(720_000.01).to(1_800_000D)
                .referenceAliquot(0.205).deducePortion(17_100D));

        taxes.add(new Tax().from(1_800_000.01).to(3_600_000D)
                .referenceAliquot(0.23).deducePortion(62_100D));

        taxes.add(new Tax().from(3_600_000.01).to(4_800_000D)
                .referenceAliquot(0.305).deducePortion(540_000D));
    }

    @Override
    public Observable<Double> getReferenceAliquot(Double lastYearRevenue) {
        return Observable.fromIterable(taxes)
                .filter(tax -> lastYearRevenue >= tax.getFrom() && lastYearRevenue <= tax.getTo())
                .map(Tax::getReferenceAliquot);
    }

    @Override
    public Double getDeducePortion(Double lastYearRevenue) {
        return null;
    }
}
