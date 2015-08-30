1) Problem Statement  Map  
   
You are given a phone book that consists of people's names and their phone number.  
After that you will be given some person's name as query.    
For each query, print the phone number of that person.  
   
Input Format  
The first line will have an integer n denoting the number of entries in the phone book.   
Each entry consists of two lines: a name and the corresponding phone number.   
   
After these, there will be some queries. Each query will contain a person's name.   
Read the queries until end-of-file.   
  
Constraints:  
A person's name consists of only lower-case English letters and it may be in   
the format 'first-name last-name' or in the format 'first-name'.   
Each phone number has exactly 8 digits without any leading zeros.    
   
1≤n≤100000   
1≤Query≤100000  
   
Output Format    
For each case, print "Not found" if the person has no entry in the phone book.     
Otherwise, print the person's name and phone number. See sample output for the exact format.   
   
Sample Input   
3  
uncle sam  
99912222  
tom  
11122222   
harry  
12299933  
uncle sam  
uncle tom  
harry  
   
Sample Output  
uncle sam=99912222  
Not found   
harry=12299933   
  
Result is on SolutionMap.java file   
  
---------------------------------------------------------------------------------------------  
  
2) Problem Statement Stack  
  
A string containing only parentheses is balanced if the following is true:   
  
if it is an empty string  
if A and B are correct, AB is correct,  
if A is correct, (A) and {A} and [A] are also correct.  
Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})"    
  
Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.  

Given a string, determine if it is balanced or not.  
  
Input Format  
There will be multiple lines in the input file, each having a single non-empty string.   
You should read input till end-of-file.  
  
The part of the code that handles input operation is already provided in the editor.   
  
Output Format  
For each case, print 'true' if the string is balanced, 'false' otherwise.   
  
Sample Input   
{}()   
({()})   
{}(  
[]  

Sample Output  
true  
true  
false  
true  

Result is on SolutionStack.java file  

---------------------------------------------------------------------------------------------  
  
3) Problem Statement  Hashset   
   
In computer science, a set is an abstract data type that can store certain values,       
without any particular order, and no repeated values(Wikipedia).      
{1,2,3} is an example of a set, but {1,2,2} is not a set.   
Today you will learn how to use sets in java by solving this problem.  
   
You are given n pairs of strings. Two pairs (a,b) and (c,d) are identical if a=c and b=d.   
That also implies (a,b) is not same as (b,a). After taking each pair as input, you need to   
print number of unique pairs you currently have.  
  
Note: Brute force solution will not earn full points.  
   
Input Format    
In the first line, there will be an integer T denoting number of pairs.   
Each of the next T lines will contain two strings seperated by a single space.  
  
Constraints:  
1<=T<=100000  
Length of each string is atmost 5 and will consist lower case letters only.  
The testcases were generated randomly.  
  
Output Format    
Print T lines. In the ith line, print number of unique pairs you have after taking ith pair as input.  
  
Sample Input  
5  
john tom  
john mary  
john tom  
mary anna  
mary anna  
  
Sample Output  
1  
2  
2  
3  
3  
  
Explanation  
After taking the first input, you have only one pair: (john,tom)  
After taking the second input, you have two pairs: (john, tom) and (john, mary)   
After taking the third input, you still have two unique pairs.  
After taking the fourth input, you have three unique pairs: (john,tom), (john, mary) and (mary, anna)  
After taking the fifth input, you still have three unique pairs.  
  
Result is on SolutionHashset.java file  
  
---------------------------------------------------------------------------------------------  
  
4) Problem Statement Arraylist   
   
Some times its better to use dynamic size array, java Arraylist can provide    
you this feature. Try to solve this problem using Arraylist.  
   
You are given n lines. In each line there are zero or more integers. You need to answer a few   
queries where you need to tell the number located in yth position of xth line.   
  
Take your input from System.in.  
  
Input Format   
The first line has an integer n. In each of the next n lines there will be an integer d denoting   
number of integers on that line and then there will be d space-separated integers.   
In the next line there will be an integer q denoting number of queries.   
Each query will consist of two integers x and y.    
  
Constraints  
1<=n<=20000  
0<=d<=50000  
1<=q<=1000  
1<=x,y<=n  
  
Each number will fit in signed integer.   
Total number of integers in n lines will not cross 100000.  
  
Output Format   
In each line, output the number located in yth position of xth line.   
If there is no such position, just print "ERROR!"    
   
Sample Input  
5  
5 41 77 74 22 44  
1 12  
4 37 34 36 52  
0  
3 20 22 33  
5  
1 3  
3 4  
3 1  
4 3   
5 5   
  
Sample Output  
74  
52  
37  
ERROR!   
ERROR!  
  
Result is on SolutionArrayList.java file   
  
