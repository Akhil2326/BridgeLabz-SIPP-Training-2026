-- Use Case 1: Find Highest Confirmed Cases using INNER JOIN
-- Objective: Retrieve the country with the highest number of confirmed COVID cases on a specific date
-- Concepts: INNER JOIN, Combining Data from Multiple Tables, Filtering by Date, MAX values

SELECT 
    c.country_id,
    c.country_name,
    cc.date_recorded,
    cc.confirmed_cases
FROM covid_cases cc
INNER JOIN countries c ON cc.country_id = c.country_id
WHERE cc.date_recorded = '2020-12-31'  -- Specify your date here
ORDER BY cc.confirmed_cases DESC
LIMIT 1;

-- Alternative query to show top 10 countries with highest confirmed cases on a specific date
SELECT 
    c.country_id,
    c.country_name,
    cc.date_recorded,
    cc.confirmed_cases
FROM covid_cases cc
INNER JOIN countries c ON cc.country_id = c.country_id
WHERE cc.date_recorded = '2020-12-31'  -- Specify your date here
ORDER BY cc.confirmed_cases DESC
LIMIT 10;
