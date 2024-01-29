package br.com.max.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import br.com.max.model.Person;

@Service
public class PersonServices {

	private final AtomicLong counter = new AtomicLong();
	private Logger logger = Logger.getLogger(PersonServices.class.getName());

	public Person create(Person person) {
		logger.info("Create one person!");
		return person;
	}

	public Person update(Person person) {
		logger.info("Update one person!");
		return person;
	}

	public void delete(String id) {
		logger.info("Delete one person!");
	}

	public List<Person> findAll() {
		List<Person> listPerson = new ArrayList<Person>();
		for (int i = 0; i < 8; i++) {
			Person person = mockPerson(i);
			listPerson.add(person);
		}
		return listPerson;
	}

	private Person mockPerson(int i) {
		logger.info("Finding all people");
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Person name: " + i);
		person.setLastName("Last name: " + i);
		person.setAddress("Some address in Brasil: " + i);
		person.setGender("Male");
		return person;
	}

	public Person findById(String id) {

		logger.info("Finding One Person");
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Leandro");
		person.setLastName("Costa");
		person.setAddress("Uberlândia - Minas Gerais - Brasil");
		person.setGender("Male");
		return person;
	}

}
