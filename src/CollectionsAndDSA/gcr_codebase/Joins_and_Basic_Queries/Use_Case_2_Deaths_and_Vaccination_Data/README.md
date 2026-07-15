# Use Case 2: Join COVID Deaths and Vaccination Data

## Objective
Consolidate death counts and vaccination statuses for all countries into a single view, including those with missing vaccination data.

## Task
Perform a LEFT JOIN between the covid_deaths and covid_vaccines tables to show death counts and vaccination status for all countries, even if vaccination data is missing.

## Concepts Practiced
- Using LEFT JOIN
- Handling Missing or NULL Data
- Linking Related Tables
- Comprehensive Data Retrieval

## Query Explanation
- **LEFT JOIN**: Keeps all rows from the left table (covid_deaths) and matches with the right table (covid_vaccines) where possible
- **ON Condition**: Matches records based on both country_id and date
- **COALESCE()**: Replaces NULL values with default values for better readability
- **WHERE cv.country_id IS NULL**: Identifies countries with missing vaccination data

## Tables Used
- `covid_deaths`: Contains death counts by country and date
- `covid_vaccines`: Contains vaccination data by country and date

## Expected Output
A comprehensive view showing death counts alongside vaccination data where available, and NULL or default values where vaccination data is missing.
