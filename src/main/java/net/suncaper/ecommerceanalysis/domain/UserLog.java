package net.suncaper.ecommerceanalysis.domain;

public class UserLog {
    public int getTotalUser() {
        return totalUser;
    }

    public void setTotalUser(int totalUser) {
        this.totalUser = totalUser;
    }

    public int getTotalStore() {
        return totalStore;
    }

    public void setTotalStore(int totalStore) {
        this.totalStore = totalStore;
    }

    public int getTotalBrand() {
        return totalBrand;
    }

    public void setTotalBrand(int totalBrand) {
        this.totalBrand = totalBrand;
    }

    public int getDoubleEleven() {
        return doubleEleven;
    }

    public void setDoubleEleven(int doubleEleven) {
        this.doubleEleven = doubleEleven;
    }

    public int getTotalDeal() {
        return totalDeal;
    }

    public void setTotalDeal(int totalDeal) {
        this.totalDeal = totalDeal;
    }

    public int getMale() {
        return male;
    }

    public void setMale(int male) {
        this.male = male;
    }

    public int getFemale() {
        return female;
    }

    public void setFemale(int female) {
        this.female = female;
    }

    private int totalUser;
    private int totalStore;
    private int totalBrand;
    private int doubleEleven;
    private int totalDeal;
    private int male;
    private int female;

}
