-- Use Case 4: Calculate Average New Deaths Per Day
-- Objective: Track the global trend of average daily COVID deaths over time
-- Concepts: Aggregate Functions (AVG()), ORDER BY, Calculating Averages, Sorting Results

SELECT 
    cd.date_recorded,
    SUM(cd.deaths) AS total_deaths_per_day,
    COUNT(DISTINCT cd.country_id) AS num_countries_reporting,
    AVG(cd.deaths) AS avg_deaths_per_country,
    MIN(cd.deaths) AS min_deaths,
    MAX(cd.deaths) AS max_deaths
FROM covid_deaths cd
GROUP BY cd.date_recorded
ORDER BY cd.date_recorded ASC;

-- Query to calculate 7-day rolling average
SELECT 
    cd.date_recorded,
    SUM(cd.deaths) AS daily_deaths,
    AVG(SUM(cd.deaths)) OVER (
        ORDER BY cd.date_recorded 
        ROWS BETWEEN 6 PRECEDING AND CURRENT ROW
    ) AS seven_day_rolling_avg
FROM covid_deaths cd
GROUP BY cd.date_recorded
ORDER BY cd.date_recorded ASC;

-- Query to calculate average deaths per month
SELECT 
    YEAR(cd.date_recorded) AS year,
    MONTH(cd.date_recorded) AS month,
    AVG(daily_deaths) AS avg_deaths_per_day
FROM (
    SELECT 
        cd.date_recorded,
        SUM(cd.deaths) AS daily_deaths
    FROM covid_deaths cd
    GROUP BY cd.date_recorded
) AS daily_totals
GROUP BY YEAR(cd.date_recorded), MONTH(cd.date_recorded)
ORDER BY year, month;

-- Query to find peak death days
SELECT TOP 10
    cd.date_recorded,
    SUM(cd.deaths) AS total_deaths
FROM covid_deaths cd
GROUP BY cd.date_recorded
ORDER BY total_deaths DESC;
