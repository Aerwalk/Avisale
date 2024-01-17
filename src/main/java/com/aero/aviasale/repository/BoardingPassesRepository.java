package com.aero.aviasale.repository;

import com.aero.aviasale.domain.entity.BoardingPasses;
import com.aero.aviasale.domain.entity.compositeKeys.TicketNoFlightIdPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardingPassesRepository extends JpaRepository<BoardingPasses, TicketNoFlightIdPK> {

}
