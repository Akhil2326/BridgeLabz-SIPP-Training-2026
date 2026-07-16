-- Use Case 5: Prevent Duplicate Country-Date Entries
-- Objective: Ensure one COVID record exists per country and reporting date.

CREATE TABLE IF NOT EXISTS covid_cases (
    Country VARCHAR(100) NOT NULL,
    Date DATE NOT NULL,
    Confirmed_Cases INT,
    Deaths INT,
    Recoveries INT,
    Last_Updated TIMESTAMP,
    UNIQUE (Country, Date)
);
