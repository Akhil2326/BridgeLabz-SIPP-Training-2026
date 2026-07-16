-- Use Case 2: Join COVID Deaths and Vaccination Data
-- Objective: Consolidate death counts and vaccination statuses for all countries
-- Including those with missing vaccination data
-- Concepts: LEFT JOIN, Handling NULL Data, Linking Related Tables, Comprehensive Data Retrieval

SELECT 
    cd.country_id,
    cd.country_name,
    cd.date_recorded,
    cd.deaths,
    cv.vaccination_date,
    cv.people_vaccinated,
    cv.fully_vaccinated,
    cv.vaccination_status
FROM covid_deaths cd
LEFT JOIN covid_vaccines cv 
    ON cd.country_id = cv.country_id 
    AND cd.date_recorded = cv.vaccination_date
ORDER BY cd.country_id, cd.date_recorded, cv.vaccination_date;

-- Alternative query with NULL handling for better readability
SELECT 
    cd.country_id,
    cd.country_name,
    cd.date_recorded,
    cd.deaths,
    COALESCE(cv.vaccination_date, 'N/A') AS vaccination_date,
    COALESCE(cv.people_vaccinated, 0) AS people_vaccinated,
    COALESCE(cv.fully_vaccinated, 0) AS fully_vaccinated,
    COALESCE(cv.vaccination_status, 'No Data') AS vaccination_status
FROM covid_deaths cd
LEFT JOIN covid_vaccines cv 
    ON cd.country_id = cv.country_id 
    AND cd.date_recorded = cv.vaccination_date
ORDER BY cd.country_id, cd.date_recorded;

-- Query to find countries with missing vaccination data
SELECT 
    cd.country_id,
    cd.country_name,
    COUNT(*) AS death_records_without_vaccine_data
FROM covid_deaths cd
LEFT JOIN covid_vaccines cv 
    ON cd.country_id = cv.country_id 
    AND cd.date_recorded = cv.vaccination_date
WHERE cv.country_id IS NULL
GROUP BY cd.country_id, cd.country_name
ORDER BY COUNT(*) DESC;
