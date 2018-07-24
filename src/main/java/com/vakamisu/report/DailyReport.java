package com.vakamisu.report;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class DailyReport {

    private Timer timer;
    private boolean running;
    private Calendar timeFrom;
    private long loopTime;

    public DailyReport() {
        timer = new Timer();

        timeFrom = Calendar.getInstance();
        timeFrom.set(Calendar.HOUR_OF_DAY, 1);
        timeFrom.set(Calendar.MINUTE, 0);
        timeFrom.set(Calendar.SECOND, 0);

        loopTime = TimeUnit.MILLISECONDS.convert(1, TimeUnit.DAYS);
    }

    public void startReportSchedule(TimerTask timerTask) {
        timer.schedule(timerTask, timeFrom.getTime(), loopTime);
        running = true;
    }

    public boolean isRunning() {
        return running;
    }

    public void setTimeFrom(Calendar timeFrom) {
        this.timeFrom = timeFrom;
    }

    public void setLoopTime(long loopTime) {
        this.loopTime = loopTime;
    }
}
