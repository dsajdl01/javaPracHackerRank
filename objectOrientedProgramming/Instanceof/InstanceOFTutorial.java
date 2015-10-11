package OOP;
import java.util.*;

/**
 * Class InstanceOFTutorial.
 * 
 * @author David Sajdl 
 * @version 30/09/2015
 */
public class InstanceOFTutorial {
    
    static String count(ArrayList mylist) {
      int a = 0, b = 0, c = 0;
      for(int i = 0; i < mylist.size(); i++) {
          Object element=mylist.get(i);
          
         if(element instanceof  Student)
            a++;
         
         if(element instanceof Rockstar)
            b++;
         
         if(element instanceof Hacker)
            c++;
      }
      String ret= Integer.toString(a)+" "+ Integer.toString(b)+" "+ Integer.toString(c);
      return ret;
   }

   public static void main(String []argh) {
       
      ArrayList<Object> mylist = new ArrayList<Object>();
      
      String[] sc = {"Student","Student","Rockstar","Student","Hacker"};
      int t = 5;
      for(int i=0;i<t;i++){
         
         String s = sc[i];
         
         if(s.equals("Student"))mylist.add(new Student());
         
         if(s.equals("Rockstar"))mylist.add(new Rockstar());
         
         if(s.equals("Hacker"))mylist.add(new Hacker());
      }
      System.out.println(count(mylist));
   }
}