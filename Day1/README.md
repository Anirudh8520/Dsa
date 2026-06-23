# Majority Element\nNotes...
### Majority Element

- **Definition:** An element that appears more than `n/2` times in an array.
- **Approach:** Moore's Voting Algorithm.
- **Idea:**
  - Maintain a `candidate` and a `count`.
  - If `count == 0`, make the current element the new candidate.
  - If `arr[i] == candidate`, increment `count`.
  - Otherwise, decrement `count`.
- **Complexity:** `O(n)` Time, `O(1)` Space.