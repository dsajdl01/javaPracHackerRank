
/**
 * class SolutionInheritance2
 * 
 * @author David Sajdl 
 * @version 26/08/2015
 */
public class SolutionInheritance2 {
 
       public static void main(String []argh){
        Adder X=new Adder();
        System.out.println("My superclass is: "+X.getClass().getSuperclass().getName());    
        System.out.print(X.add(10,32)+" "+X.add(10,3)+" "+X.add(10,10)+"\n");

    }
}
