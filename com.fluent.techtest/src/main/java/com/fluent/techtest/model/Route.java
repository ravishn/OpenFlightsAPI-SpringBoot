package com.fluent.techtest.model;

/**
 * Model class for Route data
 */
public class Route {

    //Airline	2-letter (IATA) or 3-letter (ICAO) code of the airline.
    String IATA;

    //Airline ID	Unique OpenFlights identifier for airline (see Airline).
    String airlineId;

    //Source airport	3-letter (IATA) or 4-letter (ICAO) code of the source airport.
    String sourceAirport;

    //Source airport ID	Unique OpenFlights identifier for source airport (see Airport)
    String sourceAirportId;

    //Destination airport	3-letter (IATA) or 4-letter (ICAO) code of the destination airport.
    String destinationAirport;

    //Destination airport ID	Unique OpenFlights identifier for destination airport (see Airport)
    String destinationAirportId;

    //Codeshare	"Y" if this flight is a codeshare (that is, not operated by Airline, but another carrier), empty otherwise.
    String codeshare;

    //Stops	Number of stops on this flight ("0" for direct)
    int numberOfStops;

    //Equipment	3-letter codes for plane type(s) generally used on this flight, separated by spaces
    String equipment;

    //getters and setters
    public String getIATA() {
        return IATA;
    }

    public void setIATA(String IATA) {
        this.IATA = IATA;
    }

    public String getAirlineId() {
        return airlineId;
    }

    public void setAirlineId(String airlineId) {
        this.airlineId = airlineId;
    }

    public String getSourceAirport() {
        return sourceAirport;
    }

    public void setSourceAirport(String sourceAirport) {
        this.sourceAirport = sourceAirport;
    }

    public String getSourceAirportId() {
        return sourceAirportId;
    }

    public void setSourceAirportId(String sourceAirportId) {
        this.sourceAirportId = sourceAirportId;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public void setDestinationAirport(String destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    public String getDestinationAirportId() {
        return destinationAirportId;
    }

    public void setDestinationAirportId(String destinationAirportId) {
        this.destinationAirportId = destinationAirportId;
    }

    public String getCodeshare() {
        return codeshare;
    }

    public void setCodeshare(String codeshare) {
        this.codeshare = codeshare;
    }

    public int getNumberOfStops() {
        return numberOfStops;
    }

    public void setNumberOfStops(int numberOfStops) {
        this.numberOfStops = numberOfStops;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }
}
