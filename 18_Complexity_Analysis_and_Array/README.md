## Why is Complexity Analysis required ?


Sometimes, there are more than one way to solve a problem. So, We need to learn how to compare the
performance of different algorithms and choose the best one to solve a particular problem. While analyzing an
algorithm, we mostly consider time complexity and space complexity. To know how efficient an algorithm or a
program is, we need to do complexity analysis. 

# Time Complexity

● Applying the asymptotic analysis to measure the time requirement of an algorithm as a function of input
sizes is known as time complexity. We assume each instruction takes a constant amount of time for time complexity analysis.

● Total time complexity of a program is equal to the summation of all the running time of disconnected fragments.

## Need for Time Complexity 

When analyzing any algorithm, we need to evaluate the effectiveness of that algorithm. Accordingly, we need
to prefer the most optimized algorithm so as to save the time taken by it to execute. An example for the same
could be linear search and binary search. Let's suppose we need to search a given value in a sorted array of
size 8. This would take 8 iterations for linear search whereas it would just take log(8) ~ 3 iterations for binary
search to search the same element, thereby saving a lot of time. Time Complexity for both binary search and
linear search will be discussed in further lectures.


## Types of Time Complexity Analysis:


a. Worst Case Time Complexity: It is that case where the algorithm takes the longest time to complete its execution. It is represented by the Big-O notation. By default we calculate the worst case time complexity when we refer to the time complexity of a code.

b. Best Case Time Complexity: It is that case where the algorithm takes the least time to complete its execution. It is represented by the Omega Notation (Ω-Notation).

c. Average Case Time Complexity: As the name suggests, it gives average time for a program to complete its execution. It is represented by the theta notation (Θ-Notation).




# Space Complexity


Space complexity is a measure of the amount of memory an algorithm uses, in terms of the sizes of the input.
Like time complexity, it is often expressed using big O notation. 


## Need for Space Complexity 


The amount of space a system has can be limited and therefore we need to optimize the memory/space taken
by the algorithm to execute on that particular system with bounded space limits.

