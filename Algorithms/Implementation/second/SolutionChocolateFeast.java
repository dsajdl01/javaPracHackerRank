package mathematics;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Clas SolutionChocolateFeast.
 * 
 * @author David Sajdl 
 * @version 16/10/2015
 */
public class SolutionChocolateFeast {
    
    public static void main(String[] args) {
        int[][] data = {{10, 2, 4},
                        {12, 4, 4},
                        {6, 2, 2},
                        {17, 4, 2}};
        int t = data.length;
         for(int i = 0; i < t; i++){
           System.out.println(getSolve(data[i][0], data[i][1], data[i][2]));
       }
       
        try{
            
            File f = new File("choclet.txt");
            File fi = new File("outChoclet.txt");
            Scanner out = new Scanner(fi);
            Scanner in = new Scanner(f);
            int test = in.nextInt();
            boolean errorFind = false;
            for(int i = 0; i < test; i++){
               int n = in.nextInt();
               int c = in.nextInt();
               int m = in.nextInt();
               long choc = getSolve(n,c,m);
               long outCome = out.nextLong();
               if(choc != outCome){
                   System.out.println(i+") N: " + n + ", C: " + c + ", M: " + m);
                   System.out.println("My outcome: " + choc + ",  Outcome that should be: " + outCome);
                   errorFind = true;
                }
               
            }  
            System.out.println((errorFind)? "Error occered!" : "done");         
       } catch(FileNotFoundException e){
           System.out.println(e.toString());
       }
    }
    
    private static long getSolve(int N, int C, int M){
          
        long buyChoc = (long)N / C;
          if(buyChoc >= M){
              long free = (long)buyChoc/M;
              buyChoc += free;
              long check = (long)buyChoc/M;
              if(check > free){
                  buyChoc = add(buyChoc, free, M);
               }
          }
          return buyChoc;  
    }
    
    private static long add(long b, long f, int m){
        long check = (long)b/m;
        while(true){
            long adding = check - f;
            f = check;
            b += adding;
            check = (long)b/m;
            if(f == check){
                return b;
            }
        }
    }
}
