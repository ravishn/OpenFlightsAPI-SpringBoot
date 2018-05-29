package com.fluent.techtest.model;

/**
 * Model class for Airport data
 */
public class Airport {

    //Airport ID	Unique OpenFlights identifier for this airport.
    String airportId;

    //Name	Name of airport. May or may not contain the City name.
    String airportName;

    //City	Main city served by airport. May be spelled differently from Name.
    String city;

    //Country	Country or territory where airport is located. See countries.dat to cross-reference to ISO 3166-1 codes.
    String country;

    //IATA	3-letter IATA code. Null if not assigned/unknown.
    String iata;

    //ICAO	4-letter ICAO code. Null if not assigned.
    String icao;

    //Latitude	Decimal degrees, usually to six significant digits. Negative is South, positive is North.
    Double latitude;

    //Longitude	Decimal degrees, usually to six significant digits. Negative is West, positive is East.
    Double longitude;

    //Altitude	In feet.
    int altitude;

    //Timezone	Hours offset from UTC. Fractional hours are expressed as decimals, eg. India is 5.5.
    int timezoneOffset;

    //DST	Daylight savings time. One of E (Europe), A (US/Canada), S (South America), O (Australia), Z (New Zealand), N (None) or U (Unknown). See also: Help: Time
    String DST;

    //Timezone database time zone	Timezone in "tz" (Olson) format, eg. "America/Los_Angeles".
    String timezone;

    //Type	Type of the airport. Value "airport" for air terminals, "station" for train stations, "port" for ferry terminals and "unknown" if not known. In airports.csv, only type=airport is included.
    String type;

    //Source
    String source;

    //getters and setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAirportId() {
        return airportId;
    }

    public void setAirportId(String airportId) {
        this.airportId = airportId;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getIata() {
        return iata;
    }

    public void setIata(String iata) {
        this.iata = iata;
    }

    public String getIcao() {
        return icao;
    }

    public void setIcao(String icao) {
        this.icao = icao;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public int getTimezoneOffset() {
        return timezoneOffset;
    }

    public void setTimezoneOffset(int timezoneOffset) {
        this.timezoneOffset = timezoneOffset;
    }

    public String getDST() {
        return DST;
    }

    public void setDST(String DST) {
        this.DST = DST;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

}
