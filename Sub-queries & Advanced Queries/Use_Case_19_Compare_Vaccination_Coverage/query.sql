-- Use Case 19: Compare Vaccination Coverage
-- Objective: Perform comprehensive coverage analysis by combining vaccinated and unvaccinated population counts.

SELECT
    country_id,
    country_name,
    vaccinated_population AS population_count,
    'Vaccinated' AS coverage_type
FROM vaccination_coverage
WHERE vaccinated_population > 0

UNION

SELECT
    country_id,
    country_name,
    unvaccinated_population AS population_count,
    'Unvaccinated' AS coverage_type
FROM vaccination_coverage
WHERE unvaccinated_population > 0
ORDER BY country_name, coverage_type;
