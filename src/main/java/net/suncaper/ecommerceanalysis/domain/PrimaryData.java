package net.suncaper.ecommerceanalysis.domain;

public class PrimaryData {
    private int total_user;
    private int total_shop;
    private int total_brand;
    private int total_trade;
    private int day11_trade;

    public void setDay11_trade(int day11_trade) {
        this.day11_trade = day11_trade;
    }

    public int getDay11_trade() {
        return day11_trade;
    }

    public void setTotal_user(int total_user) {
        this.total_user = total_user;
    }

    public void setTotal_shop(int total_shop) {
        this.total_shop = total_shop;
    }

    public void setTotal_brand(int total_brand) {
        this.total_brand = total_brand;
    }

    public void setTotal_trade(int total_trade) {
        this.total_trade = total_trade;
    }

    public int getTotal_user() {
        return total_user;
    }

    public int getTotal_shop() {
        return total_shop;
    }

    public int getTotal_brand() {
        return total_brand;
    }

    public int getTotal_trade() {
        return total_trade;
    }
}
