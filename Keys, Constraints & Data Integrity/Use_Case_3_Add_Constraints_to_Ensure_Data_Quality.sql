-- Use Case 3: Add Constraints to Ensure Data Quality
-- Objective: Enforce required fields and validate death counts.

CREATE TABLE IF NOT EXISTS covid_cases (
    Country VARCHAR(100) NOT NULL,
    Date DATE NOT NULL,
    Confirmed_Cases INT NOT NULL,
    Deaths INT,
    Recoveries INT,
    Last_Updated TIMESTAMP,
    CONSTRAINT chk_deaths_not_exceed_confirmed
        CHECK (Deaths <= Confirmed_Cases)
);
