-- Use Case 5: Find Countries with Highest Infection Rates
-- Objective: Identify and rank countries based on their overall infection rates
-- Concepts: Arithmetic Operations, ORDER BY, Ranking, Calculating Derived Metrics

SELECT 
    c.country_id,
    c.country_name,
    c.population,
    MAX(cc.confirmed_cases) AS total_confirmed_cases,
    ROUND((MAX(cc.confirmed_cases) / c.population) * 100, 2) AS infection_rate_percentage,
    ROUND((MAX(cc.confirmed_cases) / c.population) * 100000, 2) AS cases_per_100k,
    ROW_NUMBER() OVER (ORDER BY (MAX(cc.confirmed_cases) / c.population) * 100 DESC) AS rank
FROM covid_cases cc
INNER JOIN countries c ON cc.country_id = c.country_id
GROUP BY c.country_id, c.country_name, c.population
ORDER BY infection_rate_percentage DESC;

-- Query to find infection rates at a specific date
SELECT 
    c.country_id,
    c.country_name,
    c.population,
    cc.confirmed_cases,
    ROUND((cc.confirmed_cases / c.population) * 100, 2) AS infection_rate_percentage,
    RANK() OVER (ORDER BY (cc.confirmed_cases / c.population) * 100 DESC) AS rank
FROM covid_cases cc
INNER JOIN countries c ON cc.country_id = c.country_id
WHERE cc.date_recorded = '2021-12-31'  -- Specify your date here
ORDER BY infection_rate_percentage DESC
LIMIT 20;

-- Query with infection rate categories
SELECT 
    c.country_name,
    c.population,
    MAX(cc.confirmed_cases) AS total_cases,
    ROUND((MAX(cc.confirmed_cases) / c.population) * 100, 2) AS infection_rate,
    CASE 
        WHEN (MAX(cc.confirmed_cases) / c.population) * 100 > 10 THEN 'Very High'
        WHEN (MAX(cc.confirmed_cases) / c.population) * 100 > 5 THEN 'High'
        WHEN (MAX(cc.confirmed_cases) / c.population) * 100 > 1 THEN 'Medium'
        ELSE 'Low'
    END AS infection_severity
FROM covid_cases cc
INNER JOIN countries c ON cc.country_id = c.country_id
GROUP BY c.country_id, c.country_name, c.population
ORDER BY infection_rate DESC;

-- Query to compare infection rates over time
SELECT 
    cc.date_recorded,
    c.country_name,
    cc.confirmed_cases,
    c.population,
    ROUND((cc.confirmed_cases / c.population) * 100, 2) AS infection_rate_percentage
FROM covid_cases cc
INNER JOIN countries c ON cc.country_id = c.country_id
WHERE c.country_name IN ('India', 'USA', 'Brazil', 'France', 'Germany')
ORDER BY c.country_name, cc.date_recorded ASC;
