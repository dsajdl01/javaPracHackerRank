1) Problem Statement Inheritance1 

Using Inheritence one class can acquire the properties of others.   
Consider the following Animal class:   

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

---------------------------------------------------------------------------------------------     

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
Then it prints the name of the class that 
Adder inherited and calls the add method several times.   
 
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

--------------------------------------------------------------------------------------------   
  
3) Problem Statement Interface  
  
A Java interface can only contain method signatures and fields. Interface can be used   
to achieve polymorphism. In this problem you will practice your knowledge on interfaces.  
  
You are given an interface AdvancedArithmetic which contains a method signature  
public abstract int divisorSum(int n). You need to write a class called   
MyCalculator which implements the interface.   
  
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

-------------------------------------------------------------------------------------------     
4) Problem Statement Abstract Class
  
A Java abstract class is a class that can't be instantiated, that means you cannot   
create new instances of an abstract class. It works as a base for subclasses.       
You should learn about Java Inheritence before attempting this challenge.   
   
Following is an example of abstact class:
   
abstract class Book {  
    String title;  
    abstract void setTitle(String s);  
    String getTitle(){   
        return title;   
    }   
} 
   
If you try to create an instance of this class like the following line you will get an error:    
  
Book new_novel=new Book();   
You have to create another class that extends the abstract class.   
Then you can create instance of the new class.  
   
Notice that setTitle method is abstract too and has no body.     
That means you must implement the body of the that method in the child class.   
   
In the editor we have provided the abstract Book class and a Main class.    
In the Main class we created instance of a class called MyBook.    
Your task is to write just the Mybook class. Your class mustn't be public.   
  
Sample Input  
A tale of two cities      
  
Sample Output    
The title is: A tale of two cities   
 
Result is on Abstract folder  

----------------------------------------------------------------------------------------   
  
5) Problem Statement Method Overriding 1  
   
When a subclass inherits a superclass, it can override methods of the superclass.    
Consider the following Sports class:  
   
class Sports{  
   String get_name() {  
      return "Generic Sports";  
   }  
   void get_number_of_team_members() {   
       System.out.println("Each team has n players in "+get_name());   
   }    
}  
   
Now we want to create a Soccer class that inherits the Sports class.      
We can override the get_name method and return a different string.  
   
class Sports{  
   String get_name() {  
      return "Generic Sports";   
   }   
}  
  
Note that to override a method, the parameters and return type of     
the new method should be exactly same as the old method.  
   
Your task is simple, you are given a partially completed code in the editor,    
complete the code so that it prints the following lines:   
   
Generic Sports   
Each team has n players in Generic Sports  
Soccer Class    
Each team has 11 players in Soccer Class   
  
Result is on Overriding_1 folder  

------------------------------------------------------------------------------------   
  
6) Problem Statement Method Overriding 2  
  
When a method in a subclass overrides a method in superclass,   
it is still possible to call the overridden method using super keyword.     
If you write super.func() to call the function func(),    
it will call the method that was defined in the superclass.  
   
You are given a code in the editor. Modify exactly 1 line so   
that the code prints the following text:  
   
Hello I am a motorcycle, I am a cycle with an engine.  
My ancestor is a cycle who is a vehicel with pedals.  
If you lose the original code, click the top left button   
in the editor and create a new buffer.  
   
Result is on Overriding_2 folder   

-----------------------------------------------------------------------------------  
  
7) Problem Statement Instanceof keyword   
   
The Java instanceof operator is used to test if     
the object or instance is an instanceof the specified type.  
  
In this problem we have given you three classes in the editor, Student, Rockstar and Hacker.   
In the main function we populated an ArrayList with instances of these classes.    
count method counts how many instance of each type are present in the ArrayList.     
Some lines of the code are missing, and you have to fix it by modifying only 3 lines!  
  
To restore the original code in the editor, click on the top   
left icon in the editor and create a new buffer.  
  
Sample Input  
5  
Student  
Student  
Rockstar  
Student  
Hacker  

Sample Output  
3 1 1    
  
Result is on Instanceof folder 

-------------------------------------------------------------------------------------
8) Problem Statement Iterator    
  
Java Iterator class can help you to iterate through every elements in an collection.     
Here is a simple example:  

import java.util.*;  
public class Example {  

    public static void main(String []argh) { 
        ArrayList mylist = new ArrayList();  
        mylist.add("Hello");  
        mylist.add("Java");  
        mylist.add("4");  
        Iterator it=mylist.iterator();  
        while(it.hasNext()) {  
            Object element = it.next();  
            System.out.println((String)element);   
        }  
    }  
}   

In this problem you need to complete a function func. The function takes an ArrayList as input.    
In that ArrayList there is one or more integer numbers, then there is a special string "###",    
after that there are one or more other strings. A sample ArrayList may look like this:  
  
element[0]=>42  
element[1]=>10  
element[2]=>"###"  
element[3]=>"Hello"   
element[4]=>"Java"   

You have to modify the func function by editing at most 2 lines so that the code only prints    
the elements after the special string "###". For the sample above the output will be:  

Hello  
Java  

To restore the original code in the editor, click the top left icon   
on the editor and create a new buffer.  

Result is on MainIterator.java file 

