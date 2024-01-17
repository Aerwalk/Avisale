package com.aero.aviasale.service.searchFlight.tripType;

import com.aero.aviasale.domain.entity.Flights;
import com.aero.aviasale.domain.apiDto.resp.FlightDto;
import com.aero.aviasale.service.searchFlight.searchCommand.FlightType;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface TripTypeCollector {
    ResponseEntity<?> collectFoundedFlights(FlightType flightType);
    List<List<FlightDto>> collectToFlightDto(List<List<Flights>> flights);
}
