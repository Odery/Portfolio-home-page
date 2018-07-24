package com.vakamisu.service;

import com.vakamisu.report.Report;

import javax.servlet.http.HttpServletRequest;

public interface ReportService {

    void runDailyReport();

    void persistUser(HttpServletRequest request);

    Report getReport();

    boolean isRunning();
}
