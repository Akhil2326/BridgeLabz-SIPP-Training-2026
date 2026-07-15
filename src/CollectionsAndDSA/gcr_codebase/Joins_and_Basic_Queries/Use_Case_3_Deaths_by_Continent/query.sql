-- Use Case 3: Analyze Deaths by Continent
-- Objective: Determine the total number of COVID deaths aggregated by continent
-- Concepts: INNER JOIN, GROUP BY, Aggregate Functions (SUM()), Aggregating Data by Categories

SELECT 
    cont.continent_id,
    cont.continent_name,
    SUM(cd.deaths) AS total_deaths,
    COUNT(DISTINCT cd.country_id) AS num_countries,
    AVG(cd.deaths) AS avg_deaths_per_country_record,
    MAX(cd.deaths) AS max_deaths_in_single_record
FROM covid_deaths cd
INNER JOIN countries c ON cd.country_id = c.country_id
INNER JOIN continents cont ON c.continent_id = cont.continent_id
GROUP BY cont.continent_id, cont.continent_name
ORDER BY total_deaths DESC;

-- Query with date range filter
SELECT 
    cont.continent_id,
    cont.continent_name,
    COUNT(DISTINCT cd.date_recorded) AS num_days_recorded,
    SUM(cd.deaths) AS total_deaths,
    COUNT(DISTINCT cd.country_id) AS num_countries
FROM covid_deaths cd
INNER JOIN countries c ON cd.country_id = c.country_id
INNER JOIN continents cont ON c.continent_id = cont.continent_id
WHERE cd.date_recorded BETWEEN '2020-01-01' AND '2021-12-31'
GROUP BY cont.continent_id, cont.continent_name
ORDER BY total_deaths DESC;

-- Query showing deaths by continent and month
SELECT 
    cont.continent_name,
    YEAR(cd.date_recorded) AS year_recorded,
    MONTH(cd.date_recorded) AS month_recorded,
    SUM(cd.deaths) AS monthly_deaths
FROM covid_deaths cd
INNER JOIN countries c ON cd.country_id = c.country_id
INNER JOIN continents cont ON c.continent_id = cont.continent_id
GROUP BY cont.continent_name, YEAR(cd.date_recorded), MONTH(cd.date_recorded)
ORDER BY cont.continent_name, year_recorded, month_recorded;
