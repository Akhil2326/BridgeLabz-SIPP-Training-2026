# Scenario 5: Reverse String

## Problem Description
Write a Java program to reverse a given string using a LIFO Stack.

## Implementation Details
We push all characters of the input string onto a Stack one by one. Once all characters are pushed, we pop them from the Stack and append them to a `StringBuilder`. Because Stacks operate on LIFO (Last In, First Out) order, popping the characters automatically reverses the string.
