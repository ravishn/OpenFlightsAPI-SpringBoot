insert into AIRPORTS (select * from CSVREAD('/Users/ravish/Desktop/dev/tech_tests/OpenFlightsAPI/com.fluent.techtest/src/main/resources/airports.dat'));

insert into ROUTES (select * from CSVREAD('/Users/ravish/Desktop/dev/tech_tests/OpenFlightsAPI/com.fluent.techtest/src/main/resources/routes.dat'));

insert into AIRLINES(select * from CSVREAD('/Users/ravish/Desktop/dev/tech_tests/OpenFlightsAPI/com.fluent.techtest/src/main/resources/airlines.dat'));



