-- Use Case 4: Set Default Values
-- Objective: Automatically assign default values during data insertion.

CREATE TABLE IF NOT EXISTS covid_cases (
    Country VARCHAR(100),
    Date DATE,
    Confirmed_Cases INT,
    Deaths INT,
    Recoveries INT DEFAULT 0,
    Last_Updated TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
