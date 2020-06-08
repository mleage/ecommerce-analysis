package net.suncaper.ecommerceanalysis.domain;

public class MerchantTop10 {
    public int getMerchant_id() {
        return merchant_id;
    }

    public void setMerchant_id(int merchant_id) {
        this.merchant_id = merchant_id;
    }

    public int getTotals() {
        return totals;
    }

    public void setTotals(int totals) {
        this.totals = totals;
    }

    private int merchant_id;
    private int totals;
}
