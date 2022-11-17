package com.javatechie.spring.cassandra.api.repo;

import com.javatechie.spring.cassandra.api.model.Person;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepo extends CassandraRepository<Person, Integer> {
}
