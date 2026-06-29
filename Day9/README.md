# three sum notes
# Three Sum Problem (Java)

## Overview
This program solves the classic **Three Sum** problem:
- Given an integer array, it finds all unique triplets `[a, b, c]` such that `a + b + c = 0`.
- Uses a `HashSet` to avoid duplicate triplets.

## Key Points
1. **Approach**:  
   - Iterate through the array with two nested loops.  
   - Use a `HashSet` (`seen`) to track complements and detect valid triplets.  

2. **Data Structures**:  
   - `HashSet<List<Integer>>` ensures uniqueness of triplets.  
   - `Arrays.asList()` converts triplets into list form for storage.  

3. **Output**:  
   - Prints all unique triplets that sum to zero.  
   - Example input: `{-1,0,1,2,-1,-4}` → Output: `[[-1,0,1], [-1,-1,2]]`.

4. **Usage**:  
   - Compile: `javac Threesum.java`  
   - Run: `java Threesum`  
   - Modify the `arr[]` in `main` to test with different inputs.

