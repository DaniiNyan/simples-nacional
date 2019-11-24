package com.daniinyan.poc.simplesnacional;

import com.daniinyan.poc.simplesnacional.domain.Company;
import com.daniinyan.poc.simplesnacional.repository.Attachment;
import com.daniinyan.poc.simplesnacional.repository.AttachmentFive;
import com.daniinyan.poc.simplesnacional.service.SimplesNacionalService;
import io.reactivex.rxjava3.core.Observable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        Attachment attachmentFive = new AttachmentFive();
        List<Company> companies = new ArrayList<>();
        Company companyOne = new Company(attachmentFive, 30_000D, 200_000D);
        Company companyTwo = new Company(attachmentFive, 100_000D, 750_000D);
        Company companyThree = new Company(attachmentFive, 500_000D, 4_000_000D);
        companies.add(companyOne);
        companies.add(companyTwo);
        companies.add(companyThree);

        SimplesNacionalService simplesNacionalService = new SimplesNacionalService();

        Observable.fromIterable(companies)
                .map(company -> simplesNacionalService.calculate(companies))
                .map(Map::values)
                .subscribe(System.out::println);
    }
}
