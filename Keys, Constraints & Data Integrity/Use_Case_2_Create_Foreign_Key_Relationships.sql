-- Use Case 2: Create Foreign Key Relationships
-- Objective: Establish referential integrity between COVID records and country reference data.

CREATE TABLE IF NOT EXISTS countries (
    Country VARCHAR(100) PRIMARY KEY,
    Region VARCHAR(100),
    Population BIGINT
);

CREATE TABLE IF NOT EXISTS covid_cases (
    Country VARCHAR(100) NOT NULL,
    Date DATE NOT NULL,
    Confirmed_Cases INT,
    Deaths INT,
    Recoveries INT,
    Last_Updated TIMESTAMP,
    PRIMARY KEY (Country, Date),
    CONSTRAINT fk_covid_cases_country
        FOREIGN KEY (Country) REFERENCES countries(Country)
);
