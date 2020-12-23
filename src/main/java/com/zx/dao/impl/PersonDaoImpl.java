package com.zx.dao.impl;

import com.zx.dao.PersonDao;
import com.zx.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonDaoImpl implements PersonDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    public int save(Person person) {
        String sql = "insert into zx_person (zx_name, zxAge , addres_num) values (?,?,?)";
        int update = jdbcTemplate.update(sql, "zixi", 18,10);

        return update;

    }

    public List<Person> query(Person person) {

        String sql = "select * from zx_person where zx_name = ?";
        List<Person> zixi = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Person.class), person.getZx_name());
        System.out.println("------------------------------");
        for (Person person1 : zixi) {
            System.out.println(person1);
        }
        System.out.println("------------------------------");
        return zixi;
    }

    public int updateP(Person person) {
        return 0;
    }

    public int deleteP(Person person) {
        return 0;
    }
}
