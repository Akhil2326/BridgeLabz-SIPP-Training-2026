# Use Case 4: Calculate Average New Deaths Per Day

## Objective
Track the global trend of average daily COVID deaths over time.

## Task
Use the aggregate function AVG() on daily death counts across all countries, ordered by date.

## Concepts Practiced
- Using Aggregate Functions (AVG(), SUM(), COUNT(), MIN(), MAX())
- Implementing ORDER BY Clause
- Calculating Averages
- Sorting Query Results
- Window Functions for rolling averages

## Query Explanation
- **GROUP BY**: Aggregates data by date to get daily totals
- **AVG()**: Calculates average deaths per country on each day
- **SUM()**: Calculates total deaths across all countries per day
- **ORDER BY ASC**: Sorts results chronologically
- **OVER() window function**: Calculates rolling averages over a 7-day window
- **ROWS BETWEEN**: Defines the range for rolling calculations

## Tables Used
- `covid_deaths`: Contains death counts by country and date

## Expected Output
A time-series view showing daily death totals, average deaths per country, and optional rolling averages to identify trends.
