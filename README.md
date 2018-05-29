# OpenFlightsAPI-SpringBoot
SpringBoot application integrated with OpenFlights data to get flights information from airports, airlines and routes

# Steps to run the API
1. Run Application.java - main Spring boot application
2. data.sql should accept relative path of the .dat files, if the application fails to launch, try providing the absolute path of the .dat files. Some versions of H2 database have this bug
3. Once the application is running, make a note of the port(should be 8080 by default)
4. Run the endpoint /flights/in/{airportId} for flights flying in to the airport
Ex. http://localhost:8080/flights/in/2290 should return the JSON response
[
    {
        "airportName": "Memanbetsu Airport",
        "airlineId": "1",
        "airlineName": "Private flight",
        "destinataionAirportId": "2290",
        "sourceAirportId": null,
        "active": null,
        "stops": null
    },
    {
        "airportName": "Memanbetsu Airport",
        "airlineId": "3",
        "airlineName": "1Time Airline",
        "destinataionAirportId": "2290",
        "sourceAirportId": null,
        "active": null,
        "stops": null
    },
    {
        "airportName": "Memanbetsu Airport",
        "airlineId": "10",
        "airlineName": "40-Mile Air",
        "destinataionAirportId": "2290",
        "sourceAirportId": null,
        "active": null,
        "stops": null
    },
    ...
]

5. Run the endpoint /flights/out/{airportId} for flights flying out from the airport
Ex. http://localhost:8080/flights/out/2290 should return the JSON response
[
    {
        "airportName": "Memanbetsu Airport",
        "airlineId": "1",
        "airlineName": "Private flight",
        "destinataionAirportId": null,
        "sourceAirportId": "2290",
        "active": null,
        "stops": null
    },
    {
        "airportName": "Memanbetsu Airport",
        "airlineId": "3",
        "airlineName": "1Time Airline",
        "destinataionAirportId": null,
        "sourceAirportId": "2290",
        "active": null,
        "stops": null
    },
    {
        "airportName": "Memanbetsu Airport",
        "airlineId": "10",
        "airlineName": "40-Mile Air",
        "destinataionAirportId": null,
        "sourceAirportId": "2290",
        "active": null,
        "stops": null
    },
    ...
]

6. Run the endpoint /flights/route/{sourceAirportId}/{destinationAirportId} for flights flying between two airports
Ex. http://localhost:8080/flights/route/3393/3361 should return the JSON response
[
    {
        "airportName": null,
        "airlineId": null,
        "airlineName": "Private flight",
        "destinataionAirportId": "3361",
        "sourceAirportId": "3393",
        "active": "Y",
        "stops": "0"
    },
    {
        "airportName": null,
        "airlineId": null,
        "airlineName": "1Time Airline",
        "destinataionAirportId": "3361",
        "sourceAirportId": "3393",
        "active": "Y",
        "stops": "0"
    },
    {
        "airportName": null,
        "airlineId": null,
        "airlineName": "40-Mile Air",
        "destinataionAirportId": "3361",
        "sourceAirportId": "3393",
        "active": "Y",
        "stops": "0"
    },
    ...
]
