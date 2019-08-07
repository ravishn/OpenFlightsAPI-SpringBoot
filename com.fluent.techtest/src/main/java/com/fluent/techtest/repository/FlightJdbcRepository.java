package com.fluent.techtest.repository;

import com.fluent.techtest.model.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Class to fetch flight data from the in-memory database and return to the service class
 */
@Repository
public class FlightJdbcRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    Flight flight;

    String getAllFlightsInQuery;

    String getALlFlightsOutQuery;

    String getAllFlightsBetweenAirportsQuery;

    /**
     * RowMapper implementation for fetching flights coming in to an airport
     */
    class FlightsInRowMapper implements RowMapper<Flight> {

        public Flight mapRow(ResultSet rs, int rowNum) throws SQLException {

            flight = new Flight();
            flight.setSourceAirportId(rs.getString("SOURCEAIRPORTID"));
            flight.setDestinataionAirportId(rs.getString("DESTAIRPORTID"));
            flight.setAirlineName(rs.getString("AIRLINENAME"));
            flight.setAirlineId(rs.getString("AIRLINEID"));
            flight.setAirportName(rs.getString("AIRPORTNAME"));
            flight.setActive(rs.getString("ACTIVE"));

            return flight;
        }
    }

    /**
     * RowMapper implementation for fetching flights going out from an airport
     */
    class FlightsOutRowMapper implements RowMapper<Flight> {

        public Flight mapRow(ResultSet rs, int rowNum) throws SQLException {

            flight = new Flight();
            flight.setSourceAirportId(rs.getString("SOURCEAIRPORTID"));
            flight.setDestinataionAirportId(rs.getString("DESTAIRPORTID"));
            flight.setAirlineName(rs.getString("AIRLINENAME"));
            flight.setAirlineId(rs.getString("AIRLINEID"));
            flight.setAirportName(rs.getString("AIRPORTNAME"));
            flight.setActive(rs.getString("ACTIVE"));

            return flight;
        }
    }

    /**
     * RowMapper implementation for the flight between two airports
     */
    class FLightsBetweenAirportsRowMapper implements RowMapper<Flight> {

        public Flight mapRow(ResultSet rs, int rowNum) throws SQLException {

            flight = new Flight();
            flight.setSourceAirportId(rs.getString("SOURCEAIRPORTID"));
            flight.setDestinataionAirportId(rs.getString("DESTAIRPORTID"));
            flight.setAirlineName(rs.getString("AIRLINENAME"));
            flight.setAirlineId(rs.getString("AIRLINEID"));
            flight.setActive(rs.getString("ACTIVE"));
            flight.setStops(rs.getString("STOPS"));

            return flight;
        }
    }

    /**
     * Query method for flights in
     * @param airportId
     * @return List of flights
     */
    public List<Flight> findFlightsInByDestinationAirportId(String airportId) {

        getAllFlightsInQuery = "select " +
                "AIRPORTS.NAME as AIRPORTNAME, " +
                "AIRLINES.NAME as AIRLINENAME, " +
                "SOURCEAIRPORTID, " + 
                "DESTAIRPORTID, " +
                "AIRLINES.AIRLINEID as AIRLINEID, " +
                "ACTIVE " +
                "from AIRPORTS, ROUTES, AIRLINES " +
                "where AIRPORTID = DESTAIRPORTID " +
                "and DESTAIRPORTID = '" +airportId+ "' " +
                "and AIRLINES.ACTIVE = 'Y' " +
                "LIMIT 100;";

        return jdbcTemplate.query(getAllFlightsInQuery, new FlightsInRowMapper());
    }

    /**
     * Query method for flights out
     * @param airportId
     * @return List of flights
     */
    public List<Flight> findFlightsOutBySurceAirportId(String airportId) {

        getALlFlightsOutQuery = "select " +
        		"AIRPORTS.NAME as AIRPORTNAME, " +
                "AIRLINES.NAME as AIRLINENAME, " +
                "SOURCEAIRPORTID, " + 
                "DESTAIRPORTID, " +
                "AIRLINES.AIRLINEID as AIRLINEID, " +
                "ACTIVE " +
                "from AIRPORTS, ROUTES, AIRLINES " +
                "where AIRPORTID = SOURCEAIRPORTID " +
                "and SOURCEAIRPORTID = '" +airportId+ "' " +
                "and AIRLINES.ACTIVE = 'Y' " +
                "LIMIT 100;";

        return jdbcTemplate.query(getALlFlightsOutQuery, new FlightsOutRowMapper());
    }

    /**
     * Query method for flights between airports
     * @param sourceAirportId
     * @param destinationAirportId
     * @return List of flights
     */
    public List<Flight> findFlightsBetweenAirports(String sourceAirportId, String destinationAirportId) {

        getAllFlightsBetweenAirportsQuery = "SELECT " +
        		"SOURCEAIRPORTID, " +
                "DESTAIRPORTID, " +
                "SOURCEAIRPORT, " +
                "DESTAIRPORT, " +
                "AIRLINES.AIRLINEID as AIRLINEID, " +
                "AIRLINES.NAME AS AIRLINENAME, " +
                "STOPS, " +
                "ACTIVE " +
                "FROM ROUTES, AIRLINES " +
                "WHERE SOURCEAIRPORTID = '" +sourceAirportId+ "' " +
                "AND DESTAIRPORTID = '" +destinationAirportId+ "' " +
                "AND ACTIVE = 'Y' " +
                "ORDER BY STOPS ASC " +
                "LIMIT 100;";

        return jdbcTemplate.query(getAllFlightsBetweenAirportsQuery, new FLightsBetweenAirportsRowMapper());
    }
}
