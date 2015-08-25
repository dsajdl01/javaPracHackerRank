Problem Statement BigInteger  

In this problem you have to add and multiply huge numbers! These numbers are so big   
that you can't contain them in any ordinary data types like long integer.  

Use the power of Java's BigInteger class and solve this problem.  

Input Format  
There will be two lines containing two numbers, a and b.  
The numbers are non-negative and can have maximum 200 digits.  

Output Format  
Output two lines. The first line should contain a+b, and the second  
line should contain a×b. Don't print any leading zeros.   
 

Sample Input  
1234  
20   

Sample Output  
1254  
24680   

Explanation   
1234+20=1254  
1234*20=24680  

result is on SolutionBigInteger.java file  

.............................................................................................    

2) Problem Statement BigDecimal  

Java BigDecimal class can handle arbitrary-precision signed decimal numbers.  
Lets test your knowledge on them!  

You are given n real numbers, sort them in descending order!   
Read data from System.in.  

Note: You should take input as string, convert it to BigDecimal and print it using    
System.out.println after sorting without changing anything.  

Input Format  
The first line will consist an integer n, each of the next n lines will contain a real number.     
n will be at most 200. The numbers can have at most 300 digits!  

Output Format  
Print the numbers in descending orders, one number in each line.   

Sample Input   
5  
-100  
50  
0  
56.6  
90 

Sample Output  
90  
56.6  
50  
0  
-100  


