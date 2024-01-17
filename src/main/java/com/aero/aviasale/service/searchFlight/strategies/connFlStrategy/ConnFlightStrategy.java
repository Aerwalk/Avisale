package com.aero.aviasale.service.searchFlight.strategies.connFlStrategy;

import com.aero.aviasale.domain.entity.Flights;

import java.util.List;

/**
 * abbreviation Conn = Connection
 */
public interface ConnFlightStrategy {
    List<List<Flights>> getConnFlights();
}
