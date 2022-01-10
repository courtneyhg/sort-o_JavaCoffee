## sort-o_JavaCoffee
### Java Coffee: Jason Yang, Yuki Feng, Courtney Huang
Song of the Week: Baby Shark by Pinkfong

### Bubble Sort
  * Best Case: The numbers are from least to greatest (already sorted) or the numbers are all the same.
  * Worst Case: The numbers are from greatest to least.

When the size of the arrays are the same, it takes the same number of passes to
sort it. However, we looked at how many times numbers were swapped. In our best
cases, it took 0 swaps and 6 passes. Meanwhile, in our worst case, it took 15 swaps
and 6 passes.

  * Best Case Time Complexity: O(n)
  * Worst Case Time Complexity: O(n^2)

### Selection Sort
  * No best or worst cases.

Selection sort is a bit different from Bubble and Insertion because the time complexity for the best case and worse case is the same. Regardless of whether the elements are already in ascending or descending order, the algorithm will go through the entire array O(n^2) times. The passes and swaps always remain the same no matter how the arrays are ordered.

Time Complexity for all cases: O(n^2)

### Insertion Sort
  * Best Case: The numbers are from least to greatest (already sorted) or the numbers are all the same.
  * Worst Case: The numbers are from greatest to least.

When the size of the arrays are the same, it takes the same number of passes to sort it. However, we looked at how many times numbers were swapped. In our best cases, it took 0 swaps and 5 passes. Meanwhile, in our worst case, it took 15 swaps and 5 passes. In the best case, it would take n-1 comparisons because adjacent elements are being compared. Once the algorithm reaches the second to last element and compares it with the last, it stops. In the worst case scenario, each element will have to be compared with all the other elements because the list is in the completely opposite order you want it to be in.

  * Best Case Time Complexity: O(n)
  * Worst Case Time Complexity: O(n^2)
