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

### Explaining the Complexity Equations
  * The best case time complexity is O(n) with all of the sorting algorithms because when it is the best case, that means an already ascending arraylist or with all the same integers. The amount of items in the array, n, will be the same amount of passes required.
  * The worse case time complexity is 0(n^2) due to the nested for loop in all methods that ensure having to loop through 2 times each array means the squared passes. For example, changing the size of an array by the factor integer n will mean that the swaps amount will be affected by a factor of n^2.
    * For example, Arraylist wer has 6 items and Arraylist oop has 12 atoms, meaning that n is 2 because oop is 2 times the size of wer. After sorting, the swap amount of wer is 15 and for oop, 66. The factor of change from 15 to 66 is around 4, which is 2^2, following the equation. 
