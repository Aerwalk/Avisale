package com.aero.aviasale.controller.searchFlights;

import com.aero.aviasale.domain.apiDto.req.SearchDto;
import com.aero.aviasale.service.SearchQueryService;
import com.aero.aviasale.service.searchFlight.tripType.RoundTripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/round-trip")
@Validated
public class RoundTripController {
    private final RoundTripService roundTripService;
    private final SearchQueryService queryService;

    @Autowired
    public RoundTripController(RoundTripService roundTripService, SearchQueryService queryService) {
        this.roundTripService = roundTripService;
        this.queryService = queryService;
    }

    @PostMapping("/search")
    public ResponseEntity<?> searchFlights(@RequestBody @NotNull SearchDto searchDto) {
        queryService.setSearchDto(searchDto);
        return roundTripService.collectFoundedFlights(searchDto.getFlightType());
    }
}
