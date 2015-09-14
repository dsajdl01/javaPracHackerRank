1) Problem Simple Array Sum

You are given an array of integers of size N. You need to print the  
sum of the elements of the array.  
   
Input Format   
The first line of the input consists of an integer N.   
The next line contains N space-separated integers describing the array.  
  
Constraints   
1≤N≤1000    
0≤A[i]≤1000   
   
Output Format   
Output a single value equal to the sum of the elements of the array.   
  
Sample Input  
   
6  
1 2 3 4 10 11   
Sample Output   
   
31   
Explanation   
1+2+3+4+10+11=31   

result is file SolutionSimpleArrSum.java

-------------------------------------------------------------------------------  
  
2)  Problem Statement A Very Big Sum  
  
You are given an array of integers of size N.  
You need to print the sum of the elements of the array.  
  
Note: The range of the 32-bit integer is −231 to 231−1 or [−2147483648,2147483647].    
When we add several integer values, the resulting sum might exceed this range.     
You might need to use long long int in C/C++ or long data type in Java to store such sums.   
   
Input Format   
The first line of the input consists of an integer N.   
The next line contains N space-separated integers describing the array.  
  
Constraints   
1≤N≤10   
0≤A[i]≤1010  
  
Output Format    
Output a single value equal to the sum of the elements of the array.  
  
Sample Input  
5   
1000000001 1000000002 1000000003 1000000004 1000000005     
  
Sample Output   
5000000015  
  
resullt is SolutionVeryBigSum.java   
 
------------------------------------------------------------------------------  
3) Problem Statement  Diagonal Difference   

You are given a square matrix of size N×N.   
Calculate the absolute difference of the sums across the two main diagonals.   

Input Format

The first line contains a single integer N.   
The next N lines contain N integers (each) describing the matrix.  

Constraints  
1≤N≤100   
−100≤A[i]≤100  
Output Format  
Output a single integer equal to the absolute difference in the sums across the diagonals.   

Sample Input  
3  
11 2 4   
4 5 6   
10 8 -12  

Sample Output   
15  

Explanation  
The first diagonal of the matrix is:
11  
    5  
        -12  
Sum across the first diagonal = 11+5-12= 4   

The second diagonal of the matrix is:  
        4   
    5   
10  
Sum across the second diagonal = 4+5+10 = 19    
Difference: |4-19| =15  

Result is SolutionDiagonalDiff.java  

------------------------------------------------------------------------------   
  
4) Problem Statement  Plus Minus  
  
You're given an array containing integer values.   
You need to print the fraction of count of positive numbers, negative numbers   
and zeroes to the total numbers. Print the value of the fractions correct to 3 decimal places.  
  
Input Format  
First line contains N, which is the size of the array.   
Next line contains N integers A1,A2,A3,⋯,AN, separated by space.   
   
Constraints   
1≤N≤100   
−100≤Ai≤100  
Output Format   
Output three values on different lines equal to the fraction of count of positive numbers,     
negative numbers and zeroes to the total numbers respectively correct to 3 decimal places.  
  
Sample Input  
6   
-4 3 -9 0 4 1  
  
Sample Output   
0.500  
0.333  
0.167   
   
Explanation   
There are 3 positive numbers, 2 negative numbers and 1 zero in the array. 
Fraction of the positive numbers, negative numbers and zeroes   
are 36=0.500, 26=0.333 and 16=0.167 respectively.  
   
Note This challenge introduces precision problems. You can even print output to 4 decimal   
places and above but only the difference at 3rd decimal digit is noted.   
That is the reason you'll notice testcases have much higher precision   
(more decimal places) than required. 
Answers with absolute error upto 10−4 will be accepted.
   
Result is SolutionPlusMinus.java  
   