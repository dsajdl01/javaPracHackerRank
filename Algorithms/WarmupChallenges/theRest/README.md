1) Problem Statement Staircase

Your teacher has given you the task to draw the structure of a staircase.   
Being an expert programmer, you decided to make a program for the same.   
You are given the height of the staircase.  
You need to print a staircase as shown in the example.  
  
Input Format  
 
You are given an integer N depicting the height of the staircase.  
  
Constraints   
1≤N≤100 
Output Format 
 
Draw a staircase of height N in the format given below. 
 
For example:  
  
     #  
    ##   
   ###   
  ####    
 #####   
######   
Staircase of height 6, note that last line has 0 spaces before it.  
 
Sample Input 
  
6  
Sample Output  
  
     #  
    ##  
   ###  
  ####   
 #####   
######   
  
result is SolutionStaircase.java  
  
------------------------------------------------------------------------------------------  
2) Problem Statement Time Conversion  
  
You are given time in AM/PM format. Convert this into a 24 hour format.  
  
Note Midnight is 12:00:00AM or 00:00:00 and 12 Noon is 12:00:00PM.  
  
Input Format  
  
Input consists of time in the AM/PM format i.e. hh:mm:ssAM or hh:mm:ssPM   
where  
01≤hh≤12  
00≤mm≤59   
00≤ss≤59  
  
Output Format  
  
You need to print the time in 24 hour format i.e. hh:mm:ss   
where  
00≤hh≤23  
00≤mm≤59  
00≤ss≤59  
 
Sample Input  
 
07:05:45PM 
Sample Output 
  
19:05:45  
  
Result is SolutionTimeConversion.java file  

------------------------------------------------------------------------------------------ 
  
3) Problem Statement Library Fine    
  
The Head Librarian at a library wants you to make a program that calculates the fine   
for returning the book after the return date.   
You are given the actual and the expected return dates. Calculate the fine as follows:  
  
If the book is returned on or before the expected return date,   
no fine will be charged, in other words fine is 0.  
If the book is returned in the same month as the expected return date,   
Fine = 15 Hackos × Number of late days   
If the book is not returned in the same month but in the same year as the expected return date,   
Fine = 500 Hackos × Number of late months  
If the book is not returned in the same year, the fine is fixed at 10000 Hackos.  
  
Input Format  
You are given the actual and the expected return dates in D M Y format respectively.   
There are two lines of input. The first line contains the D M Y values for the actual   
return date and the next line contains the D M Y values for the expected return date.  
  
Constraints   
1≤D≤31   
1≤M≤12   
1≤Y≤3000    

Output Format    
Output a single value equal to the fine.  
  
Sample Input  
  
9 6 2015  
6 6 2015  
Sample Output  
  
45  
Explanation  
 
Since the actual date is 3 days later than expected, fine is calculated as 15×3=45 Hackos.  
 
Result is SolutionLibraryFine.java file
  
------------------------------------------------------------------------------------------    
  
4) Problem Statement long factorials  
  
You are given an integer N. Print the factorial of this number.  
  
N!=N×(N−1)×(N−2)×⋯×3×2×1  
Note: Factorials of N>20 can't be stored even in a 64−bit long long variable.   
Big integers must be used for such calculations. Languages like Java, Python, Ruby etc.   
can handle big integers but we need to write    
additional code in C/C++ to handle such large values.  
   
We recommend solving this challenge using BigIntegers.  
Input Format   
Input consists of a single integer N.   
  
Constraints   
1≤N≤100  
   
Output Format   
Output the factorial of N.  
  
Sample Input  
25  
  
Sample Output  
15511210043330985984000000  
  
Result is SolutioFnactorials.java file  
