-- Use Case 1: Define Primary Keys in COVID Tables
-- Objective: Ensure each country has only one COVID record per reporting date.

CREATE TABLE IF NOT EXISTS covid_cases (
    Country VARCHAR(100) NOT NULL,
    Date DATE NOT NULL,
    Confirmed_Cases INT,
    Deaths INT,
    Recoveries INT,
    Last_Updated TIMESTAMP,
    PRIMARY KEY (Country, Date)
);
