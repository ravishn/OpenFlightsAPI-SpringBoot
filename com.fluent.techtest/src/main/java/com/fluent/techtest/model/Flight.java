package com.fluent.techtest.model;

/**
 * Model class for Flight data
 */
public class Flight {

    String airportName;

    String airlineId;

    String airlineName;

    String destinataionAirportId;

    String sourceAirportId;

    String active;

    String stops;

    //getters and setters
    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getStops() {
        return stops;
    }

    public void setStops(String stops) {
        this.stops = stops;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public String getAirlineId() {
        return airlineId;
    }

    public void setAirlineId(String airlineId) {
        this.airlineId = airlineId;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public String getDestinataionAirportId() {
        return destinataionAirportId;
    }

    public void setDestinataionAirportId(String destinataionAirportId) {
        this.destinataionAirportId = destinataionAirportId;
    }

    public void setSourceAirportId(String sourceAirportId) {
        this.sourceAirportId = sourceAirportId;
    }

    public String getSourceAirportId() {
        return sourceAirportId;
    }
}
