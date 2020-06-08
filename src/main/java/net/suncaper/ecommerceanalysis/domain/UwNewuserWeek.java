package net.suncaper.ecommerceanalysis.domain;

public class UwNewuserWeek {
    private String week_num;
    private int total;

    public String getWeek() {
        return week_num;
    }

    public int getTotal() {
        return total;
    }

    public void setWeek(String week_num) {
        this.week_num = week_num;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
