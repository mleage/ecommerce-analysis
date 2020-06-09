package net.suncaper.ecommerceanalysis.domain;

public class CityConsumeAbility {
    private String province;
    private double ability;

    public void setProvince(String province) {
        this.province = province;
    }

    public void setAbility(double ability) {
        this.ability = ability;
    }

    public String getProvince() {
        return province;
    }

    public double getAbility() {
        return ability;
    }
}
