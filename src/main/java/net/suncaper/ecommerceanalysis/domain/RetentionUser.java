package net.suncaper.ecommerceanalysis.domain;

public class RetentionUser {
    private double rate;
    private int session;
    private String today;

    public double getRate() {
        return rate;
    }

    public int getSession() {
        return session;
    }

    public String getToday() {
        return today;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setSession(int session) {
        this.session = session;
    }

    public void setToday(String today) {
        this.today = today;
    }
}
