package com.zx.entity;

import com.oracle.javafx.jmx.SGMXBean;

public class Address {
    private String privnce;
    private String city;
    private String town;
    private int person_num;

    @Override
    public String toString() {
        return "Address{" +
                "privnce='" + privnce + '\'' +
                ", city='" + city + '\'' +
                ", town='" + town + '\'' +
                ", person_num=" + person_num +
                '}';
    }

    public Address(String privnce, String city, String town, int person_num) {
        this.privnce = privnce;
        this.city = city;
        this.town = town;
        this.person_num = person_num;
    }

    public int getPerson_num() {
        return person_num;
    }

    public void setPerson_num(int person_num) {
        this.person_num = person_num;
    }

    public Address() {
    }

    public String getPrivnce() {
        return privnce;
    }

    public void setPrivnce(String privnce) {
        this.privnce = privnce;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }
}
