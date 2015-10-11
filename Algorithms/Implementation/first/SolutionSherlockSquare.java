package mathematics;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * class SolutionSherlockSquare.
 * 
 * @author David Sajdl 
 * @version 11/10/2015
 */
public class SolutionSherlockSquare {
  
    public static void main(String[]args){
       
        try {
            // it reads Test Case #5 input and output
            File f = new File("inpower.txt");
            File f1 = new File("outpower.txt");
            Scanner in = new Scanner(f);
            Scanner out = new Scanner(f1);
            int test = in.nextInt();
            boolean find = true;
            int count = 0;
            for(int i = 0; i < test; i++){
                int fr = in.nextInt();
                int sd = in.nextInt();
                int myoutcome = getCount(fr,sd);
                int outcome = out.nextInt();
                /** it checks if my output is the same as Test Case #5 output
                 if not print out differences */
                if(myoutcome != outcome){
                    System.out.println("First: " + fr + " Second: " + sd);
                    System.out.println("My out come is:   " + myoutcome);
                    System.out.println("Real out come is: " + outcome);
                    count++;
                    find = false;
                }
            }
            System.out.println((find) ? "End and evrything is ok\n" : count + "Errors occured!\n");
            int[][] sampleInput = {{3,9},
                                   {17, 24}};
            for(int i = 0; i < sampleInput.length; i++){
                System.out.println(getCount(sampleInput[i][0],sampleInput[i][1]));
            }
          
       } catch(FileNotFoundException e){
           System.out.println(e.toString());
       }
    }
    
    public static int getCount(int l, int h){
    
          boolean counter = false;
          int count = 0;
            for(int i = 1; i < h; i++){
                int sqr = i*i;
                if(sqr >= l){
                    counter = true;
                }
                if(sqr > h){
                    return count;
                }
                if(counter){
                    count++;
                }
                
            }
          return count;
    }
}
