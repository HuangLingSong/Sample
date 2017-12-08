package com.xrom.ssh.service.impl;

import com.xrom.ssh.entity.Person;
import com.xrom.ssh.repository.PersonRepository;
import com.xrom.ssh.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by XRom
 * On 11/16/2017.11:58 PM
 */
@Service
public class PersonServiceImpl implements PersonService {

    @Autowired(required = true)
    private PersonRepository personRepository;

    @Override
    public Long savePerson() {
        Person person = new Person();
        person.setUsername("黄凌淞");
        person.setPhone("18408287865");
        person.setAddress("chenDu");
        person.setRemark("this is Test");
        return personRepository.save(person);
    }
}
