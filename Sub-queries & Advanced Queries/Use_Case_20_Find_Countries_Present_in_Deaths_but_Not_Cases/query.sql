-- Use Case 20: Find Countries Present in Deaths but Not Cases
-- Objective: Identify data inconsistencies where countries appear in one table but not another.

SELECT
    country_id,
    country_name
FROM covid_deaths
WHERE country_id NOT IN (
    SELECT country_id
    FROM covid_cases
)
GROUP BY country_id, country_name
ORDER BY country_name;
