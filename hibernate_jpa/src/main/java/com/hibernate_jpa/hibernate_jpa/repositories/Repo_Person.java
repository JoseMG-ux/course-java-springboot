package com.hibernate_jpa.hibernate_jpa.repositories;

import org.springframework.data.repository.CrudRepository;
import com.hibernate_jpa.hibernate_jpa.entities.Person;

public interface Repo_Person extends CrudRepository<Person, Long> {
    
}
