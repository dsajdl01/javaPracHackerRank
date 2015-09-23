import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Map.Entry;
/**
 * class SolutionMap
 * 
 * @author David Sajdl 
 * @version 30/08/2015
 */
public class SolutionMap {
    
    public static void main(String[] args) {
       
       HashMap<String, String> map = new HashMap<String, String>();
       int n = 6;
       String[] data = {"uncle sam","99912222","tom","11122222","harry","12299933"};
       String[] test = {"uncle sam","uncle tom","harry"}; 
       
       for(int i = 0; i < n; i = i+2){
           map.put(data[i], data[i+1]);           
       }
       
       for(int j = 0; j < test.length; j++){
           printNamePhone(map, test[j]);
       }

       try{
            // input.txt file is: Test Case #4: input file.
             File f = new File("inputMap.txt");
             Scanner in = new Scanner(f);
             HashMap<String, String> phonebook = new HashMap<String, String>();
            
             int test2 = in.nextInt();
             in.nextLine();
             for(int i = 0; i < test2; i++){
                 phonebook.put(in.nextLine(), in.nextLine());           
             }

             // Read the queries until the end-of-file.
             while(in.hasNext()){
                 printNamePhone(phonebook, in.nextLine());
             }
          } catch (FileNotFoundException fnfe){
                 System.out.println(fnfe.toString());
        }

    }
    
    public static void  printNamePhone(HashMap<String, String> p,String n){
        if(p.containsKey(n)) { 
               System.out.println(p.get(n));
        } else {
                System.out.println("Not found");
        }
    }
    
}
