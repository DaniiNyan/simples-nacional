package com.daniinyan.poc.simplesnacional;

import com.daniinyan.poc.simplesnacional.domain.Attachment;
import com.daniinyan.poc.simplesnacional.domain.AttachmentFive;
import com.daniinyan.poc.simplesnacional.domain.Company;
import com.daniinyan.poc.simplesnacional.service.SimplesNacional;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SimplesNacionalTest {

    private Attachment attachmentFive = new AttachmentFive();
    private Company testCompany = new Company("Test", attachmentFive, 185000D);
    private SimplesNacional simplesNacional = new SimplesNacional();

    @Test
    public void shouldCalculateCorrectly() {
        Double result = simplesNacional.calculate(testCompany);
        assertEquals(2880D, result);
    }
}
