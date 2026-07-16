# Use Case 5: Find Countries with Highest Infection Rates

## Objective
Identify and rank countries based on their overall infection rates.

## Task
Calculate the infection_rate = (Confirmed_Cases / Population) * 100 using arithmetic operations and use ORDER BY to rank countries.

## Concepts Practiced
- Using Arithmetic Operations in Queries
- Implementing ORDER BY Clause
- Ranking and Sorting Data
- Calculating Derived Metrics
- Using ROUND() for formatting
- Window Functions (ROW_NUMBER(), RANK())

## Query Explanation
- **Arithmetic Operation**: (Confirmed_Cases / Population) * 100 calculates infection rate percentage
- **ROUND()**: Formats the result to 2 decimal places
- **ROW_NUMBER()**: Assigns a sequential rank to countries
- **RANK()**: Assigns ranks allowing for ties
- **OVER()**: Defines the window for ranking functions
- **CASE Statement**: Categorizes infection severity
- **ORDER BY DESC**: Sorts countries by highest infection rate first

## Tables Used
- `covid_cases`: Contains confirmed case counts by country and date
- `countries`: Contains country reference information including population

## Expected Output
A ranked list of countries showing their infection rate as a percentage of population, useful for comparing the relative impact of COVID across different nations.
