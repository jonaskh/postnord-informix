package com.example.demo.informix;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepositoryInformix extends CrudRepository<Event, Integer> {

}
