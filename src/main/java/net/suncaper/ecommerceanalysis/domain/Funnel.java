package net.suncaper.ecommerceanalysis.domain;

public class Funnel {
    private int action;
    private int total;

    public int getAction() {
        return action;
    }

    public int getTotal() {
        return total;
    }

    public void setAction(int action) {
        this.action = action;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
