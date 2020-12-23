package com.zx.dao;

import com.zx.entity.Address;
import com.zx.entity.Person;

import java.util.List;


public interface AddressDao {
    public int save(Address address);
    public List<Address> query(Address address);
    public int updateP(Address address);
    public int deleteP(Address address);
}
