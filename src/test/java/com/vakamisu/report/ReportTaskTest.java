package com.vakamisu.report;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ReportTaskTest {

    //Given
    private ReportTask reportTask;

    private ReportToFile toFile;
    private ReportDAO service;
    private ReportSender sender;

    @Before
    public void beforeEachTest() {
        toFile = Mockito.mock(ReportToFile.class);
        service = Mockito.mock(ReportDAO.class);
        sender = Mockito.mock(ReportSender.class);

        reportTask = new ReportTask(service, toFile, sender);
    }

    @Test
    public void shouldRetrieveReportFromReportServiceImpl() {
        //When
        reportTask.run();

        //Then
        Mockito.verify(service).getReport();
    }

    @Test
    public void shouldSendRetrievedReportToEmail() {
        //When
        reportTask.run();

        //Then
        Mockito.verify(sender).sendReport(null);
    }

    @Test
    public void shouldConvertReportToFile() {
        //When
        reportTask.run();

        //Then
        Mockito.verify(toFile).convertReport(null);
    }
}
