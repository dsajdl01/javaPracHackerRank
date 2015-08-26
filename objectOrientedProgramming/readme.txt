1) Problem Statement Inheritance1 

Using Inheritence one class can acquire the properties of others. Consider the following Animal class:  

class Animal{ 
    void walk() 
    { 
        System.out.println("I am walking"); 
    } 
} 

This class has only one method walk. Now we want to create a  
Bird class that also has fly method. We can do it using extends keyword. 

class Bird extends Animal 
{ 
    void fly() 
    {  
        System.out.println("I am flying");  
    } 
}  
Now we can create a Bird object that can both fly and walk.  

public class Solution  
{  
   public static void main(String args[])   
   {  

      Bird bird = new Bird();  
      bird.walk();  
      bird.fly();  
   }   
}    

This code will print:  
I am walking  
I am flying  
So Bird has all the properties that an animal have and it also have some unique properties.  

Your task is very simple. We provided the code above in the editor. Just add a sing method 
in the Bird class and modify main function accordingly so that it prints the following lines:  
I am walking  
I am flying  
I am singing   

Result is on Inheritance1 folder

-------------------------------------------------------------------------------------------------------  

2) Problem Statement Inheritance 2 

Take a look at the following java code:  

class Solution{  

    public static void main(String []argh){  
        Adder X=new Adder();  
        System.out.println("My superclass is: "+X.getClass().getSuperclass().getName());      
        System.out.print(X.add(10,32)+" "+X.add(10,3)+" "+X.add(10,10)+"\n");  
  
    }  
}  
The main function in Solution class creates an object of Adder class.   
Then it prints the name of the class that Adder inherited and calls the add method several times.  
 
Now complete this code so that it outputs the following lines:  
 
My superclass is: Arithmetic  
42 13 20  
You don't need to write the Solution class. We will append your code   
with the code given above before running it.  

If you need to write more than one class, write them in a single file.   
Your classes shouldn't be public.   

Sample Input  
No input.  

Sample Output  
My superclass is: Arithmetic   
42 13 20   

Result is on Inheritance2 folder

-----------------------------------------------------------------------------------------------------
  
3) Problem Statement Interface  
  
A Java interface can only contain method signatures and fields. Interface can be used   
to achieve polymorphism. In this problem you will practice your knowledge on interfaces.  
  
You are given an interface AdvancedArithmetic which contains a method signature public abstract   
int divisorSum(int n). You need to write a class called MyCalculator which implements the interface.  
  
divisorSum function just takes an integer as input and return the sum of all its divisors.   
For example divisors of 6 are 1,2,3 and 6, so divisorSum should return 12.   
Value of n will be at most 1000.  
  
Read the partially completed code in the editor and complete it.   
You just need to write the MyCalculator class only. Your class shouldn't be public.  
 
Sample Input  
6  
 
Sample Output   
I implemented: AdvancedArithmetic   
12   

Explanation   
Divisors of 6 are 1,2,3 and 6. 1+2+3+6=12.   

Result is on Interface folder   
 