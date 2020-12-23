package com.zx.entity;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Person {
    private String zx_name;
    private int zx_age;
    private int addres_num;

    private String[] hobbies;

    @Override
    public String toString() {
        return "Person{" +
                "zx_name='" + zx_name + '\'' +
                ", zx_age=" + zx_age +
                ", addres_num=" + addres_num +
                ", hobbies=" + Arrays.toString(hobbies) +
                ", address=" + address +
                ", lists=" + lists +
                ", sets=" + sets +
                ", map=" + map +
                '}';
    }

    private Address address;
    private List<Address> lists;
    private Set<String> sets;
    private Map<String, Object> map;


    public Person(String zx_name, int zx_age, int addres_num) {
        this.zx_name = zx_name;
        this.zx_age = zx_age;
        this.addres_num = addres_num;
    }

    public int getAddres_num() {
        return addres_num;
    }

    public void setAddres_num(int addres_num) {
        this.addres_num = addres_num;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Address> getLists() {
        return lists;
    }

    public void setLists(List<Address> lists) {
        this.lists = lists;
    }

    public Set<String> getSets() {
        return sets;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    Person(){

    }

    public Person(String zx_name, int zx_age) {
        this.zx_name = zx_name;
        this.zx_age = zx_age;
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
}
