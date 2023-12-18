Sorted Array Deduplication
--------------------------

Introduction
------------
This Java program demonstrates a solution to remove duplicates from a sorted array, allowing at most two identical elements and returning the new length of the array.

Usage
-----
The primary method for this functionality is determineSolution, which takes a sorted integer array as input and modifies it in-place to satisfy the given conditions. The method returns the new length of the array after deduplication.

  public static int determineSolution(int[] inputArray)

Examples
--------
Example 1

int[] inputArray1 = {1,1,1,2,2,3};
int answer = determineSolution(inputArray1);
// Output: 5
// Note: the first five elements of the array are 1, 1, 2, 2, and 3

Example 2

int[] inputArray2 = {0,1,3,3,9,9,9,9,9};
int answer = determineSolution(inputArray2);
// Output: 6
// Note: the first six elements of the array are 0, 1, 3, 3, 9, and 9

Example 3

int[] inputArray3 = {};
int answer = determineSolution(inputArray3);
// Output: 0
// Note: the array is empty

Example 4

int[] inputArray4 = {1,1,1,4,4,4,4,2,2,2,2,2,5,6,7,3,3,2,1};
int answer = determineSolution(inputArray4);
// Output: 11
// Note: the first eleven elements of the array are 1, 1, 2, 2, 2, 3, 4, 4, 5, 6, and 7

Running the Examples
--------------------
To test the provided examples, execute the main method in the Main class. Each example prints the output and the expected result for validation.

  public static void main(String[] args)

Conclusion
----------
This program provides a simple and efficient solution for deduplicating a sorted array with a constraint on the number of identical elements. Feel free to adapt and integrate this code into your Java projects. If you encounter any issues or have suggestions for improvements, please don't hesitate to reach out.