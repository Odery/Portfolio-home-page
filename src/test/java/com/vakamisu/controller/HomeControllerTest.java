package com.vakamisu.controller;

import com.vakamisu.service.ReportService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import javax.servlet.http.HttpServletRequest;

import static org.junit.Assert.assertEquals;

public class HomeControllerTest {

    //Given
    private HomeController controller;
    private ReportService service;

    @Before
    public void beforeEachTest() {
        controller = new HomeController();
        service = Mockito.mock(ReportService.class);
    }

    @Test
    public void shouldReturnHomePage() {
        //When
        String rightPage = controller.showHomePage();

        //Then
        assertEquals("home", rightPage);

    }

    @Test
    public void mustInitializeReportService() {
        //When
        controller.initialize(service, null);

        //Then
        Mockito.verify(service).runDailyReport();
    }

    @Test
    public void mustPersistCurrentUser() {
        //Given
        HttpServletRequest request = Mockito.mock(HttpServletRequest.class);

        //When
        controller.initialize(service, request);

        //Then
        Mockito.verify(service).persistUser(request);
    }

    @Test
    public void dontReRunReportServiceIfItsRunning() {
        //Given
        Mockito.when(service.isRunning()).thenReturn(true);

        //When
        controller.initialize(service, null);

        //Then
        Mockito.verify(service, Mockito.atMost(0)).runDailyReport();
    }

}
