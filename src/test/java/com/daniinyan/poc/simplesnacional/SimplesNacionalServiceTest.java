package com.daniinyan.poc.simplesnacional;

import com.daniinyan.poc.simplesnacional.domain.Company;
import com.daniinyan.poc.simplesnacional.repository.Attachment;
import com.daniinyan.poc.simplesnacional.repository.AttachmentFive;
import com.daniinyan.poc.simplesnacional.service.SimplesNacionalService;
import org.junit.Test;

import java.util.ArrayList;
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
}
