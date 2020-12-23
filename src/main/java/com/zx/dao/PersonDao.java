package com.zx.dao;

import com.zx.entity.Person;

import java.util.List;


public interface PersonDao {
    public int save(Person person);
    public List<Person> query(Person person);
    public int updateP(Person person);
    public int deleteP(Person person);
}
