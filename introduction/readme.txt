
1) Problem Statement - Looping 
In this problem you will test your knowledge of Java loops. 
Given three integers a , b , and n , output the following series:  

a+2^0*b,a+2^0*b+2^1*b,......,a+2^0*b+2^1*b+...+2^n-1*b 
Input Format 
The first line will contain the number of testcases t. Each of the next t  
lines will have three integers, a , b , and n. 
Constraints: 
0=a,b=50  
1=n=15  

Output Format 
Print the answer to each test case in seperate lines. 


Sample Input 
2 
0 2 10 
5 3 5 

Sample Output 
2 6 14 30 62 126 254 510 1022 2046 
8 14 26 50 98   

Explanation   
In the first case:  
1st term=0+1*2=2 
2nd term=0+1*2+2*2=6 
3rd term=0+1*2+2*2+4*2=14 
and so on. 

Result is on SolutionCount.java file  

-----------------------------------------------------------------------------------------------


2) Problem Statement Output Formatting  
 

Java System.out.printf function allowes you to print formatted output. 
This problem will test your knowledge on this topic. 

Take exactly 3 lines of input. Each line consists of a string and an integer.  
Suppose this is the sample input:

java 100  
cpp 65 
python 50 


The strings will have at most 10 alphabetic characters and  
the integers will range between 0 to 999.  

In each line of output there should be two columns. 
The string should be in the first column and the integer  
in the second column. This is the output for the input above:  
================================  
java           100   
cpp            065   
python         050   
================================   


The first column should be left justified using exactly 15 characters. 
The integer of the second column should have exactly 3 digits. 
If the original input has less than 3 digits, you should pad with zeros to the left.  

To make the problem easier, some part of the solution is already given in the editor, 
just complete the remaining parts.  

Result is on SolutionFormatting.java file  

------------------------------------------------------------------------------------------------


3) Problem Statement Data Type  


Java has 8 Primitive Data Types; they are char, boolean, byte, short, int, long, float, and double.  
In this problem we are only concerned about integer datatypes used to hold  
integer values (byte, short, int, long). Let's take a closer look at them:     
* byte data type is an 8-bit signed integer.  
* short data type is an 16-bit signed integer.  
* int data type is an 32-bit signed integer.  
* long data type is an 64-bit signed integer.  

(Reference: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html)  

Given an integer number, you have to determine which of these datatypes you can use to store that number.   
If there are multiple suitable datatypes, list them all in the order above.  


Input Format   
The first line will contain an integer T , which denotes the number of inputs that will follow.  
Each of the next T  lines will contain an integer n . The number can be arbitrarily large or small!  


Output Format
For each n , list all the datatypes it can be fitted into ordered by the size of the datatype.   
If it can't be fitted into any of these datatypes, print "n can't be fitted anywhere." 
See the sample output for the exact formatting.


Sample Input   
5  
-150   
150000   
1500000000   
213333333333333333333333333333333333    
-100000000000000  


Sample Output  
-150 can be fitted in:  
* short  
* int  
* long  
150000 can be fitted in:  
* int  
* long  
1500000000 can be fitted in:  
* int  
* long  
213333333333333333333333333333333333 can't be fitted anywhere.  
-100000000000000 can be fitted in:  
* long  

Explanation  
-150 can be fitted in a short or in an int or in a long.   
213333333333333333333333333333333333 is way too large to fit in any 
datatypes mentioned in the problem statement.   

Result is on SolutionDataType.java file 

------------------------------------------------------------------------------------------------

4) Problem Statement End of File

In computing, End Of File (commonly abbreviated EOF) is a condition in a computer operating   
system where no more data can be read from a data source. (Wikipedia)  


Sometimes you don't know how many lines are there in a file and you need to read the file until   
EOF or End-of-file. In this problem you need to read a file until EOF and print the 
contents of the file. You must take input from stdin(System.in).  

Hints: One way to do this is to use hasNext() function in java scanner class.  


Input Format  
Each line will contain a non-empty string. Read until EOF.  


Output Format  
For each line, print the line number followed by a single space and the line content.  


Sample Input  
Hello world  
I am a file  
Read me until end-of-file.  



Sample Output  
1 Hello world  
2 I am a file  
3 Read me until end-of-file.  

Result is on SolutionEndOfFile.java file  
