# Scenario 4: Sliding Window Maximum — Real-Time Network Throughput Alerting

## Problem Description
A network monitoring dashboard receives a continuous stream of throughput readings, one per second. For alerting purposes, it needs to display the maximum throughput seen in the trailing `k`-second window at all times, updating efficiently as each new reading arrives, without re-scanning the last `k` readings from scratch every second.

Task: Given a stream (or array) of throughput readings and a window size `k`, compute the maximum reading within every trailing window of size `k`.

## Implementation Details
We implement an efficient $O(N)$ amortized time solution using a Monotonic Deque.
- The deque stores indices of elements.
- Values of indices in the deque are kept in decreasing order from front to back.
- When sliding the window, we evict indices that are out of the $k$-second window from the front.
- Before adding a new reading, we evict indices with smaller or equal values from the back, as they can never be the maximum in the current or future windows.
- The maximum value of the current window is always at the front of the deque.
