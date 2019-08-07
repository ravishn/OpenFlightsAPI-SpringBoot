insert into AIRPORTS (select * from CSVREAD('C:\Users\nagarajr\git\OpenFlightsAPI-SpringBoot\com.fluent.techtest\src\main\resources\airports.dat'));

insert into ROUTES (select * from CSVREAD('C:\Users\nagarajr\git\OpenFlightsAPI-SpringBoot\com.fluent.techtest\src\main\resources\routes.dat'));

insert into AIRLINES(select * from CSVREAD('C:\Users\nagarajr\git\OpenFlightsAPI-SpringBoot\com.fluent.techtest\src\main\resources\airlines.dat'));
