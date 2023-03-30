package com.atelierjava.back.Repository;

import com.atelierjava.back.Entity.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<Ticket, Long> {
}
