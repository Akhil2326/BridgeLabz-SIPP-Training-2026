# Use Case 3: Analyze Deaths by Continent

## Objective
Determine the total number of COVID deaths aggregated by continent to analyze geographical impact.

## Task
Use an INNER JOIN to combine the covid_cases table with a continents reference table and use GROUP BY to calculate total deaths per continent.

## Concepts Practiced
- Using INNER JOIN
- Implementing GROUP BY Clause
- Utilizing Aggregate Functions (SUM(), AVG(), MAX(), COUNT())
- Aggregating Data by Categories

## Query Explanation
- **INNER JOIN**: Links countries to deaths data and continents to countries
- **GROUP BY**: Aggregates data by continent
- **SUM()**: Calculates total deaths per continent
- **COUNT(DISTINCT ...)**: Counts unique countries and dates
- **AVG()**: Calculates average deaths
- **ORDER BY DESC**: Ranks continents by total deaths

## Tables Used
- `covid_deaths`: Contains death counts by country and date
- `countries`: Contains country reference information including continent_id
- `continents`: Contains continent information

## Expected Output
A summary showing total deaths, number of countries, and average deaths per continent, ranked by highest deaths first.
