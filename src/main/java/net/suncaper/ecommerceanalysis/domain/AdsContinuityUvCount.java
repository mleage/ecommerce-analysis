package net.suncaper.ecommerceanalysis.domain;

public class AdsContinuityUvCount {
    private String dt;
    private String wk_dt;
    private int continuity_count;

    public String getDt() {
        return dt;
    }

    public String getWk_dt() {
        return wk_dt;
    }

    public int getContinuity_count() {
        return continuity_count;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }

    public void setWk_dt(String wk_dt) {
        this.wk_dt = wk_dt;
    }

    public void setContinuity_count(int continuity_count) {
        this.continuity_count = continuity_count;
    }
}
