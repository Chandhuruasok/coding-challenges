SELECT SUM(CITY.POPULATION) FROM COUNTRY INNER JOIN CITY ON COUNTRY.CODE=CITY.COUNTRYCODE WHERE COUNTRY.CONTINENT="Asia";
