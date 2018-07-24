package com.vakamisu.report;

import java.util.TimerTask;

public class ReportTask extends TimerTask {

    private ReportDAO service;
    private ReportToFile toFile;
    private ReportSender sender;

    private Report report;

    public ReportTask(ReportDAO service, ReportToFile toFile, ReportSender sender) {
        this.service = service;
        this.toFile = toFile;
        this.sender = sender;
    }

    @Override
    public void run() {
        report = service.getReport();
        Object object = toFile.convertReport(report);
        sender.sendReport(object);
    }

}
