# optimized 2D array search

### optimized 2D array search

- **Definition:** To return true if the target element is found else return false
- **Approach:** Binary search in 2D array
- **Idea:**
  - We check the row in which the target is there , to achieve the required time complexity.
  - then if the target row is found , then apply binary search to that row or array.
  - If the target row is not found update mid , as we took mid row as to change mid.
  
- **Complexity:** `O(log(m*n))` Time, `O(1)` Space.