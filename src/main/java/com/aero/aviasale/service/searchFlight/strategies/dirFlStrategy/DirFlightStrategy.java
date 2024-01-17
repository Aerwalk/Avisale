package com.aero.aviasale.service.searchFlight.strategies.dirFlStrategy;

import com.aero.aviasale.domain.entity.Flights;

import java.util.List;
/**
 * abbreviation Dir = Direct
 */
public interface DirFlightStrategy {
    List<List<Flights>> getDirFlights();
}
