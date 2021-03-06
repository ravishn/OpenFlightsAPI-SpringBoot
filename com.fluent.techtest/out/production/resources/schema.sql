 CREATE TABLE IF NOT EXISTS AIRLINES
(
  AIRLINEID VARCHAR(200) PRIMARY KEY,
  NAME      VARCHAR(200),
  ALIAS     VARCHAR(200),
  IATA      VARCHAR(20),
  ICAO      VARCHAR(20),
  CALLSIGN  VARCHAR(200),
  COUNTRY   VARCHAR(200),
  ACTIVE    CHAR
);



CREATE TABLE IF NOT EXISTS AIRPORTS
(
  AIRPORTID VARCHAR(200) PRIMARY KEY,
  NAME      VARCHAR(200),
  CITY     VARCHAR(200),
  COUNTRY     VARCHAR(200),
  IATA      VARCHAR(20),
  ICAO      VARCHAR(20),
  LATITUDE  VARCHAR(200),
  LONGITUDE   VARCHAR(200),
  ALTITUDE    VARCHAR(200),
  TIMEZONE   VARCHAR(40),
  DST VARCHAR(200),
  TZDBTIMEZONE VARCHAR(200),
  TYPE VARCHAR(200),
  SOURCE VARCHAR(200)
);



CREATE TABLE IF NOT EXISTS ROUTES
(
  AIRLINE VARCHAR(30),
  AIRLINEID      VARCHAR(200),
  SOURCEAIRPORT     VARCHAR(50),
  SOURCEAIRPORTID      VARCHAR(200),
  DESTAIRPORT      VARCHAR(50),
  DESTAIRPORTID  VARCHAR(200),
  CODESHARE   CHAR,
  STOPS    CHAR,
  EQUIPMENT VARCHAR(40)
);