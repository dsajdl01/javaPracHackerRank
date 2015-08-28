1) Problem Statement 1D Array (Easy)   
  
You are given an array of n integers. A sub-array is "Negative"   
if sum of all the integers in that sub-array is negative.   
Count the number of "Negative sub-arrays" in the input array.    
  
Note: Subarrays are contiguous chunks of the main array.   
For example if the array is {1,2,3,5} then some of the subarrays    
are {1}, {1,2,3}, {2,3,5}, {1,2,3,5} etc.   
But {1,2,5} is not an subarray as it is not contiguous.     
   
Input Format  
The first line consists an integer n. The next line will contain n   
space seperated integers. Value of n will be at most 100.   
The numbers in the array will range between -10000 to 10000.   
  
Output Format   
Print the answer to the problem.  
   
Sample Input  
5   
1 -2 4 -5 1   

Sample Output   
9  
  
Explanation  
These are the ranges of the 9 negative subarrays in this sample:   
[0:1]  
[0:3]  
[0:4]   
[1:1]  
[1:3]  
[1:4]  
[2:3]  
[3:3]  
[3:4]  
  
Assume that the index is 0 based.  

Result is on SolutionArray1DEasy.java file

----------------------------------------------------------------------------------   
  
2) Problem Statement 1D Array (Hard)  
  
In this problem you will test your knowledge on the Java 1D array.  
   
You are playing a game on your cellphone. You are given an array of length n,    
indexed from 0 to n−1. Each element of the array is either 0 or 1.   
You can only move to an index which contains 0. At first you are at the 0th position.   
In each move you can do one of the following things:   
  
Walk one step forward or backward.  
Make a jump of exactly length m forward.  
That means you can move from position x to x+1, x−1 or x+m in one move.   
The new position must contain 0. Also you can move to any position greater than n-1.  
  
You can't move backward from position 0.   
If you move to any position greater than n−1, you win the game.   
  
Given the array and the length of the jump, you need to    
determine if it's possible to win the game or not.   
  
Input Format   
In the first line there will be an integer T denoting the number of test cases.   
Each test case will consist of two lines. The first line will contain two integers, n and m.    
On the second line there will be n space-sperated integers, each of which is either 0 or 1.   
     
Constraints:  
1<=T<=5000  
2≤n≤100  
0≤m≤100  
The first integer of the array is always 0.   
  
Output Format  
For each case output "YES" if it's possible to win the game, output "NO" otherwise.  
  
Sample Input  
4  
5 3   
0 0 0 0 0   
6 5   
0 0 0 1 1 1   
6 3   
0 0 1 1 1 0   
3 1   
0 1 0   
  
Sample Output   
YES   
YES   
NO   
NO   
   
Explanation   
In the first case you can just walk to reach the end of the array.<br>    
In the second case, you can walk to index 1 or 2 and jump from there.   
In the third case, jump length is too low, you can't reach the end of the array.   
In the fourth case, jump length is 1, so it doesn't matter    
if you jump or walk, you can't reach the end.   
   
Result is on Solution1DArrayHard.java file  

------------------------------------------------------------------------------------    
  
3) Problem Statement 2D Array
  
You are given a 6*6 2D array. You have to find the sum of all the hourglasses     
within the array. An hourglass in an array is a portion shaped like this:   
   
a b c  
  d   
e f g   
For example, if we create an hourglass using the number 1 within   
an array full of zeros, it may look like this:  
  
1 1 1 0 0 0  
0 1 0 0 0 0  
1 1 1 0 0 0  
0 0 0 0 0 0  
0 0 0 0 0 0  
0 0 0 0 0 0  
   
Actually there are many hourglasses in the array above.   
The three leftmost hourglasses are the following:  
  
1 1 1     1 1 0     1 0 0   
  1         0         0   
1 1 1     1 1 0     1 0 0  
  
The sum of an hourglass is the sum of all the numbers within it.   
The sum for the hourglasses above are 7, 4, and 2, respectively.  
  
In this problem you have to print the largest sum among all the hourglasses in the array.     
   
Input Format   
There will be exactly 6 lines, each containing 6 integers seperated by spaces.   
Each integer will be between -9 and 9 inclusive.   
   
Output Format   
Print the answer to this problem on a single line.    
   
Sample Input  
1 1 1 0 0 0  
0 1 0 0 0 0  
1 1 1 0 0 0  
0 0 2 4 4 0  
0 0 0 2 0 0  
0 0 1 2 4 0  
  
Sample Output   
19  

Explanation   
The hourglass which has the largest sum is:   
2 4 4  
  2    
1 2 4   
    
Result is on Solution2DArray.java file   

-------------------------------------------------------------------------   

