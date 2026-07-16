-- Use Case 18: Track COVID Waves - State-wise Analysis
-- Objective: Track whether each day represents a peak in confirmed cases for a specific state like 'Mumbai'.

SELECT
    state_name,
    date_recorded,
    confirmed_cases
FROM covid_state_cases csc
WHERE state_name = 'Mumbai'
  AND confirmed_cases > (
      SELECT AVG(confirmed_cases)
      FROM covid_state_cases csc2
      WHERE csc2.state_name = csc.state_name
  )
ORDER BY date_recorded;
