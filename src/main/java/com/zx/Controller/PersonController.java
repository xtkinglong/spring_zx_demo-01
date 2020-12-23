package com.zx.Controller;

import com.zx.entity.Address;
import com.zx.entity.Person;
import com.zx.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class PersonController {
    @Autowired
    private PersonService personService;

    @Transactional
    public int addPerAndAdd(Person person, Address address){

        System.out.println(person);
        System.out.println(address);

        int i = personService.addOnePerson(person, address);

        return i;
    }

    public List<Person> getPersonCon(Person person){
        List<Person> personQuery = personService.getPersonQuery(person);

        return personQuery;
    }
}
