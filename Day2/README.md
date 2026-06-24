# Two Sum\nNotes... and Kadanes algorithm
### Kadanes Algorithm

- **Definition:** To find the maximum subarray sum in an array.
- **Approach:** Using kadanes Algorithm
- **Idea:**
  - Maintain a `currentsum` and a `maximumsum`.
  - If `currentsum < 0`, then reset the currentsum=0
  - before reset compare the maximum of currentsum and maxsum then store to maxsum.
  
 ### TwoSum

  - **Definition:** Two add 2 numbers in an array and return the indices whose sum are equal to target
- **Approach:** Using nested for loops , Brute-force approach
- **Idea:**
  - initialize the two for loops one from i=0 and inner loop from j=i+1;
  - then check the condition if(nums[i]+nums[j]==target)
  - if condition satisfies return the indices in the form of array.
  
