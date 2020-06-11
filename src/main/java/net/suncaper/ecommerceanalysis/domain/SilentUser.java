package net.suncaper.ecommerceanalysis.domain;

public class SilentUser {
    private int silent_user_count;
    private String curdate;

    public int getSilent_user_count() {
        return silent_user_count;
    }

    public String getCurdate() {
        return curdate;
    }

    public void setSilent_user_count(int silent_user_count) {
        this.silent_user_count = silent_user_count;
    }

    public void setCurdate(String curdate) {
        this.curdate = curdate;
    }
}
