package OOP;
import java.util.*;

/**
 * Class MainIterator.
 * 
 * @author David Sajdl 
 * @version 28/09/2015
 */
public class MainIterator {

    static Iterator func(ArrayList mylist) {
      Iterator it=mylist.iterator();
      while(it.hasNext()){
         Object element = it.next();
         if(element instanceof String) //Hints: use instanceof operator
            break;
      }
      return it;
   }

   public static void main(String []argh) {
      ArrayList mylist = new ArrayList();
      int[] ii = {42,10};
      int n = 2;
      int m = 2;
      
      for(int i = 0; i < n; i++){
         mylist.add(ii[i]);
      }
      
      mylist.add("###");
      String[] sc = {"hello","java"};
      
      for(int i = 0; i < m; i++) {
         mylist.add(sc[i]);
      }
            
      Iterator it=func(mylist);
      while(it.hasNext()){
         Object element = it.next();
         System.out.println((String)element);
      }
      
   }       

}
