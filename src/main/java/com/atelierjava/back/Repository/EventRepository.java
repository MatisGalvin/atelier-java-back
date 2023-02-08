package com.atelierjava.back.Repository;

import com.atelierjava.back.Entity.Event;
import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<Event, Long> {
}
