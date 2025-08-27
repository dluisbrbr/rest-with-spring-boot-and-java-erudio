package br.com.dluisbrbr.request.converters;

import br.com.dluisbrbr.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {

    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    public List<Person> findAll(){
        logger.info("Find ALL person");
        List<Person> ps = new ArrayList<Person>();
        for (int i = 0; i < 8; i++) {
            Person p = mockPerson(i);
            ps.add(p);
        }
        return ps;
    }

    private Person mockPerson(int i) {
        Person p = new Person();
        p.setId(counter.incrementAndGet());
        p.setFirstName("FirstName " + i);
        p.setLastName("LastName " + i);
        p.setAddress("Some address in Brasil" + i);
        p.setGender("Male");
        return p;
    }


    public Person findById(String id){
        logger.info("Find one person");

        Person p = new Person();
        p.setId(counter.incrementAndGet());
        p.setFirstName("Dalton");
        p.setLastName("Boer");
        p.setAddress("São Paulo - SP - Brasil");
        p.setGender("Male");
        return p;
    }

    public Person create(Person p){
        logger.info("Create one person");
        return p;
    }

    public Person update(Person p){
        logger.info("Updating one person");
        return p;
    }

    public void delete(String id) {
        logger.info("Deleting one person");
    }

}
