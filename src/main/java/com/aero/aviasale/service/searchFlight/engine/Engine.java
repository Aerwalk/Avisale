package com.aero.aviasale.service.searchFlight.engine;

import com.aero.aviasale.domain.entity.Flights;
import com.aero.aviasale.service.searchFlight.searchCommand.FlightType;

import java.util.List;

public interface Engine {
    List<List<Flights>> start(FlightType flightType);
}
