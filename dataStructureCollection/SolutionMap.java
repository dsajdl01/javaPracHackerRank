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
    }
    
    public static void  printNamePhone(HashMap<String, String> p,String n){
        if(p.containsKey(n)){
            for(Entry<String, String> e : p.entrySet()){
				if(e.getKey().equals(n.trim())){
                    System.out.println(n+"="+e.getValue());
				}
            }
        } else {
          System.out.println("Not found");
        }
    }
    
}
