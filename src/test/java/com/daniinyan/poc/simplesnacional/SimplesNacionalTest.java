package com.daniinyan.poc.simplesnacional;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SimplesNacionalTest {

    private Company testCompany = new Company("Test", "Test", 185000D);
    private SimplesNacional simplesNacional = new SimplesNacional();

    @Test
    public void shouldCalculateCorrectly() {
        Double result = simplesNacional.calculate(testCompany);
        assertEquals(2880D, result);
    }
}
