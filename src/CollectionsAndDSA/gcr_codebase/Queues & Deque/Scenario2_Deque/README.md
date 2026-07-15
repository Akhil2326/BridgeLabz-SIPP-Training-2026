# Scenario 2: Deque — Print Queue with Rush Job Support

## Problem Description
An office print server normally processes print jobs in the order they were submitted (FIFO). However, an admin needs the ability to push an urgent print job to the very front of the queue so it prints next, ahead of everything already waiting — while still allowing normal jobs to be added to the back as usual.

Task: Implement a job queue that supports `addLast` (a normal job is submitted), `addFirst` (an urgent job jumps to the front), and `removeFirst` (the printer picks up the next job).

## Implementation Details
We use a Double-Ended Queue (Deque) for this scenario. Java's `java.util.ArrayDeque` provides constant time $O(1)$ insertions and removals at both ends, making it the perfect implementation choice.
- Normal jobs are added to the back using `addLast()`.
- Urgent jobs are added to the front using `addFirst()`.
- Printer retrieves and processes jobs from the front using `removeFirst()`.
