1) Problem Statement Exception Handling  
   
Create a class myCalculator which consists of a single method power(int,int).   
This method takes two integers, n and p, as parameters and finds n^p.   
If either n or p is negative, then the method must throw an exception   
which says "n and p should be non-negative".   
   
Please read the partially completed code in the editor and complete it.  
Your code mustn't be public.   
  
No need to worry about constraints, there won't be any overflow if your code is correct.   
   
Sample Input  
3 5  
2 4  
-1 -2  
-1 3  
  
Sample Output  
243  
16   
java.lang.Exception: n and p should be non-negative   
java.lang.Exception: n and p should be non-negative   

  	
result is on MyCalculatorExHan.java file  

*********************************************************************************************  

Problem Statement  

Exception handling is the process of responding to the occurrence, during computation,     
of exceptions – anomalous or exceptional conditions requiring special processing    
– often changing the normal flow of program execution. (Wikipedia)   

Java has built-in mechanism to handle exceptions. Using the try statement     
we can test a block of code for errors. The catch block contains the code that   
says what to do if exception occurs.  

This problem will test your knowledge on try-catch block.    

You will be given two integers x and y as input, you have to compute x/y.       
If x and y are not 32 bit signed integers or if y is zero, exception will occur and you 
have to report it. Read sample Input/Output to know what to report in case of exceptions.    

Sample Input 1:    
10  
3    
Sample Output 1:   
3   

Sample Input 2:  
10   
Hello   
Sample Output 2:  
java.util.InputMismatchException   

Sample Input 3:  
10  
0  
Sample Output 3:   
java.lang.ArithmeticException: / by zero   

Sample Input 4:  
23.323   
0    
Sample Output 4:   
java.util.InputMismatchException   

result is on SolutionHandlingException.java file 
