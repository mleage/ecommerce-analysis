package net.suncaper.ecommerceanalysis.domain;

public class BrandTop10 {
    public int getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(int brand_id) {
        this.brand_id = brand_id;
    }

    public int getTotals() {
        return total;
    }

    public void setTotals(int totals) {
        this.total = total;
    }

    private int brand_id;
    private int total;
}
