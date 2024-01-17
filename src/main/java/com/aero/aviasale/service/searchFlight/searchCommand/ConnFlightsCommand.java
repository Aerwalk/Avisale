package com.aero.aviasale.service.searchFlight.searchCommand;

import com.aero.aviasale.domain.entity.Flights;
import com.aero.aviasale.service.searchFlight.strategies.connFlStrategy.ConnFlightStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Order(2)
public class ConnFlightsCommand implements SearchFlightCommand {

    private final List<ConnFlightStrategy> connFlights;

    @Autowired
    public ConnFlightsCommand(List<ConnFlightStrategy> connFlights) {
        this.connFlights = connFlights;
    }

    @Override
    public List<List<Flights>> getPossibleFlights() {
        List<List<Flights>> allConnFlights = new ArrayList<>();
        for (ConnFlightStrategy strategy : connFlights) {
            allConnFlights.addAll(strategy.getConnFlights());
        }
        return allConnFlights;
    }
}
