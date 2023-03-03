package com.example.demo.postgres;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepositoryPostgres extends CrudRepository<Event, Integer> {

}
