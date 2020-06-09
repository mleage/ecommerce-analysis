package net.suncaper.ecommerceanalysis.domain;

public class ItemTop10 {
    public int getItem_id() {
        return Item_id;
    }

    public void setItem_id(int Item_id) {
        this.Item_id = Item_id;
    }

    public int getTotals() {
        return total;
    }

    public void setTotals(int totals) {
        this.total = total;
    }

    private int Item_id;
    private int total;
}
