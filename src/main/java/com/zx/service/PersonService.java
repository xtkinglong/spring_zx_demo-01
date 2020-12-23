package com.zx.service;

import com.zx.dao.AddressDao;
import com.zx.dao.PersonDao;
import com.zx.dao.impl.AddressDaoImpl;
import com.zx.dao.impl.PersonDaoImpl;
import com.zx.entity.Address;
import com.zx.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonDao personDao;
    @Autowired
    private AddressDao addressDao;

    public int addOnePerson(Person person, Address address){

        int save = personDao.save(person);
        int i = 1/0;
        int save1 = addressDao.save(address);

        if(save>0 && save1 >0){
            return 1;
        }else {
            return 0;
        }

    }

    public List<Person> getPersonQuery(Person person){
        List<Person> query = personDao.query(person);
        return query;
    }


}
