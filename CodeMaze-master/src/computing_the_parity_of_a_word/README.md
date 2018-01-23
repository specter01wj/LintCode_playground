# Computing The Parity of A Word

> The parity of a binary word is `1` if the number of `1`s in the word is odd; otherwise it is `0`.
>
> Parity checks are used to detect single bit errors in data storage and communication. It is fairly straightforward to write code that computes the parity of a single 64-bit word.
>
> How would you compute the parity of a very large number of 64-bit words?

## Example

The parity of `1101` is `1`, and the parity of `10001000` is `0`

## Solution

## Hint

Use a lookup table, but don't use 2^64 entries!

## Source

EPI 4.1 (C++ P28, Java P25)