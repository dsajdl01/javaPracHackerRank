
1) Problem Statement Substrings


Today we will learn about java strings. Your task is simple, given a string,  
find out the lexicographically smallest and largest substring of length k.  

[ Note: Lexicographic order is also known as alphabetic order dictionary order.   
So "ball" is smaller than "cat", "dog" is smaller than "dorm".  
Capital letter always comes before smaller letter, so "Happy" is smaller  
than "happy" and "Zoo" is smaller than "ball".  ]  


Input Format  
First line will consist a string containing english alphabets which has at most 1000 characters. 
2nd line will consist an integer k.  


Output Format
In the first line print the lexicographically minimum substring.  
In the second line print the lexicographically maximum substring.  

Sample Input  
welcometojava  
3  

Sample Output 
ava 
wel 

Explanation
Here is the list of all substrings of length 3:  
wel 
elc 
lco 
com 
ome 
met 
eto 
toj 
oja 
jav 
ava 

Among them ava is the smallest and wel is the largest.  

Result is on SolutionSubstring.java file  

--------------------------------------------------------------------------------------------------------------

2) Problem Statement Regular Expression  


Given a string, find number of words in that string. For this problem   
a word is defined by a string of one or more english alphabets.  

There are multiple ways to tokenize a string in java, learn how to tokenize a string  
in java and demonstrate your skill by solving this problem!  

Input Format
A string not more than 400000 characters long.  
The string can be defined by following regular expression: 
[A-Za-z !,?.\_'@]+ 


That means the string will only contain english alphabets, 
blank spaces and this characters: "!,?._'@".  

Output Format  
In the first line, print number of words n  in the string.   
The words don't need to be unique. In the next n  lines, print all the words  
you found in the order they appeared in the input. 


Sample Input  
He is a very very good boy, isn't he?  

Sample Output
10 
He 
is 
a 
very 
very 
good 
boy 
isn 
t 
he 


Result is on SolutionRegExpression.java file  

---------------------------------------------------------------------------------------------------------

3) Problem Statement IP Adrdess

Write a class called myRegex which will contain a string pattern.  
You need to write a regular expression and assign it to the pattern such that it can be  
used to validate an IP address. Use the following definition of an IP address:  

IP address is a string in the form "A.B.C.D", where the value of A, B, C, and D may range from 0 to 255.  
Leading zeros are allowed. The length of A, B, C, or D can't be greater than 3.  
Some valid IP address:  
000.12.12.034
121.234.12.12
23.45.12.56

Some invalid IP address:
000.12.234.23.23
666.666.23.23
.213.123.23.32
23.45.22.32.
I.Am.not.an.ip

In this problem you will be provided strings containing any combination of ASCII characters.   
You have to write a regular expression to find the valid IPs.  

Sample Input  
000.12.12.034  
121.234.12.12  
23.45.12.56  
00.12.123.123123.123  
122.23  
Hello.IP  


Sample Output
true  
true  
true  
false  
false  
false  


Result is on SolutionIPAddress folder
  