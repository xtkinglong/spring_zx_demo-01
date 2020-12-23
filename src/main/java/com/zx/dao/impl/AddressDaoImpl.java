package com.zx.dao.impl;

import com.zx.dao.AddressDao;
import com.zx.entity.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AddressDaoImpl implements AddressDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int save(Address address) {
        String sql = "insert into zx_address (privnce, city ,town, person_num) values(?,?,?,?)";

        int update = jdbcTemplate.update(sql, "陕西", "西安", "子兮", 10);

        return update;
    }

    public List<Address> query(Address address) {
        return null;
    }

    public int updateP(Address address) {
        return 0;
    }

    public int deleteP(Address address) {
        return 0;
    }
}
