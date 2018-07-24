package com.vakamisu.report;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import pl.pojo.tester.api.FieldPredicate;
import pl.pojo.tester.api.assertion.Assertions;
import pl.pojo.tester.api.assertion.Method;

import java.util.TimerTask;

import static org.junit.Assert.assertTrue;

public class DailyReportTest {

    //Given
    private DailyReport dailyReport;
    private TimerTask timerTask;

    @Before
    public void beforeEachTest() {
        dailyReport = new DailyReport();
        timerTask = Mockito.spy(TimerTask.class);
    }

    @Test
    public void shouldSendReportOnceTimeComes() {
        //When
        dailyReport.startReportSchedule(timerTask);

        //Then
        Mockito.verify(timerTask, Mockito.timeout(999)).run();
    }

    @Test
    public void shouldRunSchedule() {
        //When
        dailyReport.startReportSchedule(timerTask);

        //Then
        assertTrue(dailyReport.isRunning());
    }

    @Test
    public void testSetters() {
        //Given
        final Class<?> dailyReport = DailyReport.class;

        //Then
        Assertions.assertPojoMethodsFor(dailyReport, FieldPredicate.include("timeFrom", "loopTime"))
                .testing(Method.SETTER).areWellImplemented();
    }
}
