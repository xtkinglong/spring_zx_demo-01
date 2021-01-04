package com.zx.entity;

public class Usert {
    private int id;
    private String zx_name;
    private int zx_age;
    private int addres_num;
    private Address address;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Usert{" +
                "zx_name='" + zx_name + '\'' +
                ", zx_age=" + zx_age +
                ", addres_num=" + addres_num +
                ", address=" + address +
                '}';
    }

    public Usert() {
    }

    public Usert(String zx_name, int zx_age, int addres_num) {
        this.zx_name = zx_name;
        this.zx_age = zx_age;
        this.addres_num = addres_num;
    }

    public Usert(String zx_name, int zx_age, int addres_num, Address address) {
        this.zx_name = zx_name;
        this.zx_age = zx_age;
        this.addres_num = addres_num;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getZx_name() {
        return zx_name;
    }

    public void setZx_name(String zx_name) {
        this.zx_name = zx_name;
    }

    public int getZx_age() {
        return zx_age;
    }

    public void setZx_age(int zx_age) {
        this.zx_age = zx_age;
    }

    public int getAddres_num() {
        return addres_num;
    }

    public void setAddres_num(int addres_num) {
        this.addres_num = addres_num;
    }
}
