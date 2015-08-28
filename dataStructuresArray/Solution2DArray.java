import java.util.*;
/**
 *  class Solution2DArray.
 * 
 * @author David Sajdl 
 * @version 28/08/2015
 */
public class Solution2DArray{
    
    public static void main(String[]args){
          // initialise 2D array  
          int[] [] ar = { {1, 1, 1, 0, 0, 0 },
                           {0, 1, 0, 0, 0, 0 },
                           {1, 1, 1, 0, 0, 0 },
                           {0, 0, 2, 4, 4, 0 },
                           {0, 0, 0, 2, 0, 0 },
                           {0, 0, 1, 2, 4, 0 }};
          for(int i = 0; i < ar.length; i++){
              System.out.println(Arrays.toString(ar[i]));
          }
          getHourglasses(ar);
          int[] [] arr ={ {-1, -1, 0, -9, -2, -2},
                          {-2, -1, -6, -8, -2, -5},
                          {-1, -1, -1, -2, -3, -4},
                          {-1, -9, -2, -4, -4, -5},
                          {-7, -3, -3, -2, -9, -9},
                          {-1, -3, -1, -2, -4, -5}};
          // print out 2D array                 
          System.out.println("  Our 2D Array:");
          for(int i = 0; i < ar.length; i++){
              System.out.println(Arrays.toString(arr[i]));
          }
          getHourglasses(arr);
    }
    
    public static void getHourglasses(int[][] ar) {   
          System.out.println("\nPattent to get highest sum of hourglasses:");
          System.out.println("1 1 1 \n  1\n1 1 1");
          // initalise variables
          int startLeft = 0;
          int endLeft = 3; 
          int tempSum = 0;
          int sum = 0;
         System.out.println("\nAll possible hourglasses in the 2D array and thier sum:");
         // go from right site to left by 3 columns until reaching end of array
         boolean firstRound = true;
         while(endLeft <= ar[0].length){
              int startDown = 0;
              int endDown = 3;
              // go down from top to bottom by 3 raws until reaching the end of array
              while(endDown <= ar.length){                 
                   // go down from top to bottom, raws, always by three elements 
                  for(int i = startDown; i < endDown; i++){
                            // go from right to left, columns, always by three elements            
                           for(int j = startLeft; j < endLeft; j++){
                              if(i== startDown){
                                  //print out first raw only three elements and get sum
                                  System.out.print(ar[i][j] + " + ");
                                  tempSum += ar[i][j];
                              }else if(i == startDown+1 && j == startLeft+1){
                                  //print out second raw only one element and get sum of first and second raw.
                                  System.out.print(ar[i][j] + " + ");
                                  tempSum += ar[i][j];
                              } else if(i== startDown+2){
                                    //print out third raw, three elements and get sum of all three raws
                                    if( j == endLeft -1){
                                        System.out.print(ar[i][j]);
                                    } else {
                                        System.out.print(ar[i][j] + " + ");
                                    }
                                  tempSum += ar[i][j];
                                }
                            }
                   }
                 // print out sum of each row
                 System.out.print(" = " + tempSum);
                 System.out.println();
                 // get max sum
                 if(firstRound){
                     sum = tempSum;  
                     firstRound = false;
                 } else {
                    sum = Math.max(tempSum, sum);
                 }
                 
                 
                 // assign sum of raw to zero
                 tempSum = 0;
                 // move + 1 with row 
                 startDown++;
                 endDown++;
             }
             // move + 1 with column 
             startLeft++;
             endLeft++;
          }
          // print out the greatest pattent (hourglasses ) sum
         System.out.println("\nThe highest hourglasses sum is: " + sum);
          System.out.println();
     }
  
}
