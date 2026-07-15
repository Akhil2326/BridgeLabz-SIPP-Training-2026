# Scenario 1: Circular Queue — Fixed-Size Network Packet Buffer

## Problem Description
A network interface driver holds incoming packets in a fixed-size buffer before they're processed by the application layer. The buffer size is fixed by hardware constraints, and packets are always processed in the order they arrived (FIFO). The buffer needs to reuse space from packets that have already been processed, without ever shifting existing packets around in memory.

Task: Implement a fixed-capacity queue backed by an array that supports enqueue (a packet arrives) and dequeue (a packet is processed), reusing freed slots via wraparound.

## Implementation Details
We use an array-based circular queue. To avoid shifting elements, we track:
- `front` index pointing to the next packet to process.
- `count` showing the number of elements currently in the buffer.
Modulo arithmetic `%` allows index wraparound back to `0` when indexes run past the end of the array.
If the queue is full, we reject incoming packets.
