package com.zty.springbootdata;

import com.zty.Repository.PersonRepository;
import com.zty.domain.Address;
import com.zty.domain.Family;
import com.zty.domain.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTests {

    @Autowired
    private PersonRepository personRepository;


    @Test
    public void test(){
        Person person=new Person();
        person.setLastname("6");
        person.setFirstname("老");
        Address address = new Address();
        address.setCity("北京");
        person.setAddress(address);
        Family family = new Family();
        family.setType("父亲");
        family.setUsername("66");
        ArrayList<Family> families = new ArrayList<>();
        families.add(family);
        person.setFamilyList(families);
        personRepository.save(person);
    }
}
