# Day1-session4Assignment4
## Problem Statement
Write a function that takes a list of Option of numbers and performs some arithmetic operation  
("Addition", "Subtraction", "Multiplication") passed to the function by the user.  
First convert List[Option[T]] to List[T] (use for expressions for this) and  
then perform the arithmetic function over it (make use of Pattern Matching for this).   

Sample Input: methodName((List(Some(1), Some(2), Some(3), Some(4)), "Addition")  
Sample Output: 10

## Solution
A class ArithmeticOperations contains mainly 4 methods->  
1-arithmeticOperationsOnList: which takes two input parameters list of option of Int(To perform the given operations on integer type data)  
and String which contains operation to be performed.
Pattern Matching is used to check the arithmetic operation and based on that the following methods are called.  
->sumOfNumbers: which returns sum of integers in list.
->subtractionOfNumbers: which returns subtraction of integers in list.  
->multiplicationOfNumbers: which returns multiplication of integers in a list.
