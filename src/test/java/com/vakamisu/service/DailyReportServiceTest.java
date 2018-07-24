package com.vakamisu.service;

import com.vakamisu.report.DailyReport;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.TimerTask;

import static org.junit.Assert.assertTrue;

public class DailyReportServiceTest {

    @Test
    public void shouldStartDailyReport() {
        //Given
        DailyReport dailyReport = new DailyReport();
        TimerTask timerTask = Mockito.spy(TimerTask.class);
        DailyReportService service = new DailyReportService(dailyReport, timerTask);

        //When
        service.runDailyReport();

        //Then
        assertTrue(service.isRunning());
    }
}
