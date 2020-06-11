package net.suncaper.ecommerceanalysis.domain;

public class Contuinity3Week {
    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }

    public String getWk_dt() {
        return wk_dt;
    }

    public void setWk_dt(String wk_dt) {
        this.wk_dt = wk_dt;
    }

    public int getContinuity_count() {
        return continuity_count;
    }

    public void setContinuity_count(int continuity_count) {
        this.continuity_count = continuity_count;
    }

    private String dt;
    private String wk_dt;
    int continuity_count;



}
