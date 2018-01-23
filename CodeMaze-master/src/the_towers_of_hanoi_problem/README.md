# The Towers of Hanoi Problem

> A peg contains rings in sorted order, with the largest ring being the lowest. You are to transfer these rings to another peg, which is initially empty.
>
> Write a program which prints a sequence of operations that transfers _n_ rings from one peg to another. You have third peg, which is initially empty. The only operation you can perform is taking a single ring from the top of one peg and placing it on the top of another peg. You must never place a larger ring above a smaller ring.

## Solution

[Java](solution1.java)

## Hint

If you know how to transfer the top `n - 1` rings, how does that help move the `n`th ring?

## Source

EPI 15.1 (Java P251)