package com.daniinyan.poc.simplesnacional;

import com.daniinyan.poc.simplesnacional.domain.Company;
import com.daniinyan.poc.simplesnacional.repository.Attachment;
import com.daniinyan.poc.simplesnacional.repository.AttachmentFive;
import com.daniinyan.poc.simplesnacional.service.SimplesNacionalService;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;

public class SimplesNacionalServiceTest {

    @Test
    public void shouldCalculateCorrectly() {
        Attachment attachmentFive = new AttachmentFive();
        List<Company> companies = new ArrayList<>();
        Company company = new Company(attachmentFive, 30_000D, 200_000D);
        companies.add(company);

        SimplesNacionalService simplesNacionalService = new SimplesNacionalService();
        Map<Company, Double> result = simplesNacionalService.calculate(companies);
        assertEquals(4725D, result.get(company));
    }

    @Test
    public void shouldCalculateMultipleCompanies() {
        Attachment attachmentFive = new AttachmentFive();
        List<Company> companies = new ArrayList<>();
        Company companyOne = new Company(attachmentFive, 30_000D, 200_000D);
        Company companyTwo = new Company(attachmentFive, 100_000D, 750_000D);
        Company companyThree = new Company(attachmentFive, 500_000D, 4_000_000D);
        companies.add(companyOne);
        companies.add(companyTwo);
        companies.add(companyThree);

        SimplesNacionalService simplesNacionalService = new SimplesNacionalService();
        Map<Company, Double> result = simplesNacionalService.calculate(companies);

        assertEquals(4725D, result.get(companyOne));
        assertEquals(18220D, result.get(companyTwo));
        assertEquals(85000D, result.get(companyThree));
    }
}
