import java.util.*;

/**
 * class SolutionHashSet
 * 
 * @author David Sajdl
 * @version 30/08/2015
 */
public class SolutionHashSet {

     public static void main(String[] args) {
       
          String[] test = {"john tom","john mary","john tom","mary anna","mary anna"};
          int n = test.length;
          printAddingUnitValues(test,n);
          String[] test1 = {"a bc","ab c","a bc"};
          int n1 = test1.length;
          printAddingUnitValues(test1,n1);
          String[] test2 = {"A","A","B","C","B","C","D","D","E","E","A","A"};
          int n2 = test2.length;
          printAddingUnitValues(test2,n2);
     }
     
     public static void printAddingUnitValues(String[] a, int n){
         
     HashSet<String> hs = new HashSet<String>();
        for(int i = 0; i < n; i++){
            String str = a[i];
            hs.add(str);
            System.out.println(hs.size());
        }
        System.out.println();
    }
}
