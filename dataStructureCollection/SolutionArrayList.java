package Programs;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * class SolutionArrayList
 * 
 * @author David Sajdl 
 * @version 30/08/2015
 */
public class SolutionArrayList {

    public static void main(String[] args) {
        
        int[][] data = { {5, 41, 77, 74, 22, 44},  
                       {1, 12},  
                       {4, 37, 34, 36, 52},  
                       {0},  
                       {3, 20, 22, 33}}; 
                       
        int n = data.length;
        List<List<Integer>> templist = new ArrayList<List<Integer>>();
        int[][] test = {{1, 3},  
                           {3, 4},  
                           {3, 1},  
                           {4, 3},  
                           {5, 5}};
        int first = 0;
        int second = 1;
                 
        for(int i = 0; i < n; i++){
            List<Integer> ls = new ArrayList<Integer>();
            for(int j = 0; j < data[i].length; j++){
                ls.add( data[i][j]); 
                
            }
            templist.add(ls);
        }
                  
        for(int x = 0; x < test.length; x++){
                   
             int a = test[x][first];
             int index = test[x][second];
             if(templist.size() >= a){
                 if(templist.get(a-1).size() > index){
                     System.out.println(templist.get(a-1).get(index));
                 }
                 else{
                     System.out.println("ERROR!");
                 }
             } 
             else {
                 System.out.println("ERROR!");
             }
        }
    }
}
