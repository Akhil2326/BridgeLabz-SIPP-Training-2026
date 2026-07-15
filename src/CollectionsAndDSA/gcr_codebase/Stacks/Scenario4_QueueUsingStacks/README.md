# Scenario 4: Queue Using Stacks

## Problem Description
Implement a First In First Out (FIFO) queue using only two stacks. The implemented queue should support all the functions of a normal queue:
- `enqueue(x)` -- Push element x to the back of queue.
- `dequeue()` -- Removes the element from the front of queue.
- `peek()` -- Get the front element.
- `isEmpty()` -- Return whether the queue is empty.

## Implementation Details
We use two stacks:
1. `stack1` for incoming elements (enqueue operation).
2. `stack2` for outgoing elements (dequeue/peek operations).
When dequeue or peek is called and `stack2` is empty, we transfer all elements from `stack1` to `stack2`. This reverses their order, achieving FIFO behavior using two LIFO stacks.
