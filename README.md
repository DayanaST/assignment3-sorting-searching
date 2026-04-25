# assignment3-sorting-searching

Description: In this project,I introduced my skills in basic and advanced sorting algorithms.My project shows the most efficient way of searching and sorting information.
Purpose:To compare the work of algorithms on arrays of different sizes and data types.
4)Analysis Questions:
Which sorting algorithm performed faster? Why?
Merge Sort showed  better results on medium and large arrays (100 and 1000 elements). This is because Merge Sort has a time complexity of O(nlogn), splitting the array into parts, while Insertion Sort has a complexity of O(n2) and requires much more comparisons and shifts of elements as the data size increases.

How does performance change with input size?
When the array size increases from 10 to 1000 elements, the execution time of Insertion Sort grows very quickly.The execution time of Merge Sort also increases, but much more slowly and linearly, which makes it more stable for large data.

How does sorted vs unsorted data affect performance?
Insertion Sort: Works at maximum speed O(n) on already sorted data, as the inner loop is practically not executed. The type of data in Merge Sort as random or sorted practically does not affect its speed, as the algorithm in any case performs a full splitting and merging of the array.

Do the results match the expected Big-O complexity?
Yes, the results confirm the theory. Insertion Sort:O(n2) on random data and O(n) on sorted data. Merge Sort: Stable O(nlogn) Binary Search: Logarithmic difficulty of O(logn), which is confirmed by instant search even in an array of 1000 elements.

Which searching algorithm is more efficient? Why?
Binary Search is much more efficient than Linear Search, especially on large arrays. While Linear Search at worst examines every element O(n), Binary Search divides the workspace in half each time, reaching the goal in the minimum number of steps O(log n).

Why does Binary Search require a sorted array?  
Binary search works on the principle of eliminating half of the elements after each comparison. If the array is not sorted, we cannot say with certainty in which half the desired number is relative to the "middle," and the logic of the algorithm breaks down.

Algorithm descroption:
1.Insertion Sort:basic Sorting: the algotithm iterates through the elements one by one and inserts each into the correct position in the already sorted part of the array.Big(0) notation is O(n2) in the worst case and O(n) in the best case on sorted data.

Merge Sort:advanced Sorting:Uses the divide and conquer principle. Recursively divides the array in half, sorts the parts, and merges them back. Big(O) notation is the O(nlogn) in all cases.

Binary search:Searches for an element in a sorted array, each time dividing the search range in half.Big(O) notation is O(log n)

Experiment Results:
 Size | Data Type | Insertion Sort | Merge Sort | Binary Search 
 
   10   | Random    | 5,800 ns       | 12,700 ns  | 2,400 ns      
   100  | Random    | 76,300 ns      | 55,200 ns  | 1,100 ns      
   1000 | Random    | 2,787,400 ns   | 154,900 ns | 1,100 ns      
   1000 | Sorted    | 4,300 ns       | 76,700 ns  | 1,100 ns      

   Conclusion:
   While completing this assignment, I saw how Big-O theory works in reality, particularly on large sizes. With 1000 elements, Merge Sort worked almost 18 times faster than Insertion Sort. This proves that choosing the right algorithm determines everything. I also noticed that on small arrays (10 elements), regular insertion sometimes is not inferior to merge sort, which turns out to be due to the absence of extra function calls and recursion. While doing this project, I understood how to work with Big(O) notations of different types and arrays.
