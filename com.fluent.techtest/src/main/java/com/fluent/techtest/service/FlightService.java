package com.fluent.techtest.service;

import com.fluent.techtest.model.Flight;
import com.fluent.techtest.repository.FlightJdbcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Service class to fetch flight details from the request
 */
@Component
public class FlightService {

    //Database query class connected via JDBC
    @Autowired
    FlightJdbcRepository flightJdbcRepository;

    // List of flights to be returned to the caller
    List<Flight> flights;

    //Airport ID to be fetched from the request method
    String airportId;

    //Source AirportID to be fetched from the request method
    String sourceAirportId;

    //Destination AirportID to be fetched from the request method
    String destinationAirportId;

    /**
     * method to fetch all the flights coming in to an airport
     * @param airportId
     * @return flights
     */
    public List<Flight> getAllFlightsIn(String airportId) {

        this.airportId = airportId;

        flights = flightJdbcRepository.findFlightsInByDestinationAirportId(airportId);

        return flights;
    }

    /**
     * method to fetch all the flights going out from an airport
     * @param airportId
     * @return flights
     */
    public List<Flight> getAllFlightsOut(String airportId) {

        this.airportId = airportId;

        flights = flightJdbcRepository.findFlightsOutBySurceAirportId(airportId);

        return flights;
    }

    /**
     * method to fetch all flights between two airports
     * @param sourceAirportId
     * @param destinationAirportId
     * @return flights
     */
    public List<Flight> getAllFlightsBetweenAirportsByAirportId(String sourceAirportId, String destinationAirportId) {

        this.sourceAirportId = sourceAirportId;
        this.destinationAirportId = destinationAirportId;

        flights = flightJdbcRepository.findFlightsBetweenAirports(sourceAirportId, destinationAirportId);

        return flights;
    }
}
