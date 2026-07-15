# Use Case 1: Find Highest Confirmed Cases using INNER JOIN

## Objective
Retrieve the country with the highest number of confirmed COVID cases on a specific date by joining relevant tables.

## Task
Use an INNER JOIN to find the country with the highest number of confirmed cases on a specific date by joining the covid_cases table with the countries reference table.

## Concepts Practiced
- Using INNER JOIN
- Combining Data from Multiple Tables
- Filtering Data by Date
- Retrieving Maximum Values

## Query Explanation
- **INNER JOIN**: Combines rows from both tables where there is a match on country_id
- **WHERE Clause**: Filters data for a specific date
- **ORDER BY DESC**: Sorts results in descending order of confirmed cases
- **LIMIT 1**: Returns only the country with the highest cases

## Tables Used
- `covid_cases`: Contains daily COVID case data
- `countries`: Contains country reference information

## Expected Output
The query returns the country name and the number of confirmed cases on the specified date.
