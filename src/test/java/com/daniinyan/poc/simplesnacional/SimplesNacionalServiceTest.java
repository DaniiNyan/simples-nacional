package com.daniinyan.poc.simplesnacional;

import com.daniinyan.poc.simplesnacional.domain.Company;
import com.daniinyan.poc.simplesnacional.repository.Attachment;
import com.daniinyan.poc.simplesnacional.repository.AttachmentFive;
import com.daniinyan.poc.simplesnacional.service.SimplesNacionalService;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SimplesNacionalServiceTest {

    @Test
    public void shouldCalculateCorrectly() {
        Attachment attachmentFive = new AttachmentFive();
        Company company = new Company(attachmentFive, 30_000D, 200_000D);

        SimplesNacionalService simplesNacionalService = new SimplesNacionalService();
        assertEquals(1299D, simplesNacionalService.calculate(company));
    }
}
