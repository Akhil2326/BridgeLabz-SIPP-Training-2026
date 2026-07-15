# Scenario 3: Priority Queue (Min-Heap) — Hospital ER Triage

## Problem Description
A hospital emergency room assigns every incoming patient a triage priority number, where a lower number means more urgent (1 = most critical, 5 = least urgent). Regardless of arrival order, the next patient called in for treatment should always be the one with the lowest (most urgent) priority number currently waiting.

Task: Given a stream of incoming patients, each with a priority number, implement a system that always serves the most urgent currently-waiting patient next.

## Implementation Details
We use a Priority Queue (which implements a Min-Heap under the hood in Java) with a custom comparator.
- Patients are admitted using `admitPatient()`, which offers them to the priority queue.
- Patients are served using `callNextPatient()`, which polls the patient with the lowest priority number.
- Insertion and deletion take $O(\log N)$ time, while checking the highest priority patient takes $O(1)$ time.
