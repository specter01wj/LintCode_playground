# Top K Frequent Words

> Given a non-empty list of words, return the k most frequent elements.
>
> Your answer should be sorted by frequency from highest to lowest. If two words have the same frequency, then the word with the lower alphabetical order comes first.

## Example

__1__:

```
Input: ["i", "love", "leetcode", "i", "love", "coding"], k = 2
Output: ["i", "love"]
Explanation: "i" and "love" are the two most frequent words.
    Note that "i" comes before "love" due to a lower alphabetical order.
```

__2__:

```
Input: ["the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"], k = 4
Output: ["the", "is", "sunny", "day"]
Explanation: "the", "is", "sunny" and "day" are the four most frequent words,
    with the number of occurrence being 4, 3, 2 and 1 respectively.
```

## Notice

- You may assume _k_ is always valid, 1 ≤ _k_ ≤ number of unique elements.
- Input words contain only lowercase letters.

## Follow up

- Try to solve it in `O(n log k)` time and `O(n)` extra space.

## Solution

- Max PQ and HeapSort. Implete my own priority queue. [Java](solution1.java)

## Note

Firstly, calculate the frequency of each word and store the result in a hashmap

Then, use `MaxPQ` and __HeapSort__ to sort the words.

## Source

[LeetCode 692](https://leetcode.com/problems/top-k-frequent-words/)