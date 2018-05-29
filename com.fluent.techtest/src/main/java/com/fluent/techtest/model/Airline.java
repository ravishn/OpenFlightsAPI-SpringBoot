package com.fluent.techtest.model;

/**
 * Model class for Airline data
 */
public class Airline {

    //Airline ID	Unique OpenFlights identifier for this airline.
    String airlineId;

    //Name	Name of the airline.
    String airlineName;

    //Alias	Alias of the airline. For example, All Nippon Airways is commonly known as "ANA".
    String aliasName;

    //IATA	2-letter IATA code, if available.
    String IATA;

    //ICAO	3-letter ICAO code, if available.
    String ICAO;

    //Callsign	Airline callsign.
    String callsign;

    //Country	Country or territory where airline is incorporated.
    String country;

    //Active "Y" if the airline is or has until recently been operational, "N" if it is defunct. This field is not reliable: in particular, major airlines that stopped flying long ago, but have not had their IATA code reassigned (eg. Ansett/AN), will incorrectly show as "Y".
    String active;

    //getters and setters
    public String getAirlineId() {
        return airlineId;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public String getAliasName() {
        return aliasName;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    public String getIATA() {
        return IATA;
    }

    public void setIATA(String IATA) {
        this.IATA = IATA;
    }

    public String getICAO() {
        return ICAO;
    }

    public void setICAO(String ICAO) {
        this.ICAO = ICAO;
    }

    public String getCallsign() {
        return callsign;
    }

    public void setCallsign(String callsign) {
        this.callsign = callsign;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public void setAirlineId(String airlineId) {
        this.airlineId = airlineId;
    }
}
