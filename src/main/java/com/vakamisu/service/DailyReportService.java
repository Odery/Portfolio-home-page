package com.vakamisu.service;

import com.vakamisu.report.DailyReport;
import com.vakamisu.report.Report;

import javax.servlet.http.HttpServletRequest;
import java.util.TimerTask;

public class DailyReportService implements ReportService {

    private DailyReport dailyReport;
    private TimerTask timerTask;

    public DailyReportService(DailyReport dailyReport, TimerTask timerTask) {
        this.timerTask = timerTask;
        this.dailyReport = dailyReport;
    }

    @Override
    public void runDailyReport() {
        dailyReport.startReportSchedule(timerTask);
    }

    @Override
    public void persistUser(HttpServletRequest request) {
        //TODO: TDD FIRST
    }

    @Override
    public Report getReport() {
        //TODO: TDD FIRST
        return null;
    }

    @Override
    public boolean isRunning() {
        return dailyReport.isRunning();
    }
}
