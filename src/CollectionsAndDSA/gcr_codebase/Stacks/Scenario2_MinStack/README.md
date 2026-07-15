# Scenario 2: Min Stack

## Problem Description
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time \(O(1)\).

- `push(val)` -- Push element val onto stack.
- `pop()` -- Removes the element on the top of the stack.
- `top()` -- Get the top element.
- `getMin()` -- Retrieve the minimum element in the stack.

## Implementation Details
We use two stacks:
1. `stack` to store all elements.
2. `minStack` to keep track of the minimum elements. When an element is pushed, if it's less than or equal to the current minimum, it is also pushed onto the `minStack`. When an element is popped from the main stack, if it equals the top of the `minStack`, it is also popped from the `minStack`.
