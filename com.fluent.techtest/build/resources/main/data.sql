insert into AIRPORTS (select * from CSVREAD('airports.dat'));

insert into ROUTES (select * from CSVREAD('routes.dat'));

insert into AIRLINES(select * from CSVREAD('airlines.dat'));
