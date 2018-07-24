package com.vakamisu.report;

import org.junit.Test;
import pl.pojo.tester.api.assertion.Assertions;

//POJO test with pojo-test lib
public class ReportTest {

    @Test
    public void shouldPassAllPojoTests() {
        //Given
        final Class<?> reportTestClass = Report.class;

        //Then
        Assertions.assertPojoMethodsFor(reportTestClass).areWellImplemented();
    }
}
