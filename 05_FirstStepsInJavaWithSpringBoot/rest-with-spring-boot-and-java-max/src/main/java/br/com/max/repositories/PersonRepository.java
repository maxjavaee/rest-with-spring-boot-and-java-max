package br.com.max.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.max.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}
