# Scenario 1: Balanced Parentheses

## Problem Description
Write a Java program to check if a given expression contains balanced parentheses. An expression is balanced if:
1. Open brackets are closed by the same type of brackets.
2. Open brackets are closed in the correct order.

## Implementation Details
We use a standard LIFO Stack (`java.util.Stack`) to push opening brackets and pop/compare them when closing brackets are encountered.
