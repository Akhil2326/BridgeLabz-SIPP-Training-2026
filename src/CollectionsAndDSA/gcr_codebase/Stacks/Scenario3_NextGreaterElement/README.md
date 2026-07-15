# Scenario 3: Next Greater Element

## Problem Description
Given an array, find the next greater element for each element. The next greater element for an element `x` is the first greater element on its right side in the array. Elements for which no greater element exists should be marked as `-1`.

## Implementation Details
We implement an efficient \(O(N)\) solution using a Monotonic Stack. We traverse the array from right to left, maintaining a stack of elements. For each element:
1. We pop elements from the stack that are smaller than or equal to the current element.
2. If the stack is empty, the next greater element is `-1`. Otherwise, it is the top of the stack.
3. We push the current element onto the stack.
