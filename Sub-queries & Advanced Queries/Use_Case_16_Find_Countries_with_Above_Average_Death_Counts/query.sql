-- Use Case 16: Find Countries with Above-Average Death Counts
-- Objective: Identify countries with a death count exceeding the global average using a sub-query.

SELECT
    country_id,
    country_name,
    deaths
FROM covid_deaths
WHERE deaths > (
    SELECT AVG(deaths)
    FROM covid_deaths
)
ORDER BY deaths DESC;
