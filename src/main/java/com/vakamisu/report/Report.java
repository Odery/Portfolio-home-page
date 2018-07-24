package com.vakamisu.report;

import java.sql.Date;
import java.util.Objects;

public class Report {
    private String ip;
    private String country;
    private String browser;
    private String locale;
    private Date date;

    public Report(String ip, String country, String browser, String locale, Date date) {
        this.ip = ip;
        this.country = country;
        this.browser = browser;
        this.locale = locale;
        this.date = date;
    }

    public Report(String ip, String browser, String locale, Date date) {
        this.ip = ip;
        this.browser = browser;
        this.locale = locale;
        this.date = date;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Report{" +
                "'ip=" + ip + '\'' +
                ", country=" + country +
                ", browser=" + browser +
                ", locale=" + locale +
                ", date=" + date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Report report = (Report) o;
        return Objects.equals(ip, report.ip) &&
                Objects.equals(country, report.country) &&
                Objects.equals(browser, report.browser) &&
                Objects.equals(locale, report.locale) &&
                Objects.equals(date, report.date);
    }

    @Override
    public int hashCode() {

        return Objects.hash(ip, country, browser, locale, date);
    }
}
