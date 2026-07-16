-- Use Case 17: Identify Countries Exceeding Case Threshold
-- Objective: Find countries where maximum confirmed cases exceed 1 million using a sub-query.

SELECT
    country_id,
    country_name
FROM countries
WHERE country_id IN (
    SELECT country_id
    FROM covid_cases
    GROUP BY country_id
    HAVING MAX(confirmed_cases) > 1000000
)
ORDER BY country_name;
