package com.aero.aviasale.repository;

import com.aero.aviasale.domain.entity.Tickets;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketsRepository extends JpaRepository<Tickets, String> {

}
