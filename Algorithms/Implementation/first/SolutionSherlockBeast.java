package mathematics;


/**
 * class SolutionSherlockBeast.
 * 
 * @author David Sajdl
 * @version 11/10/2015
 */
public class SolutionSherlockBeast {
 
    public static void main(String[]args){
        
        int[] num = {1, 3, 5, 11, 2, 6, 9, 12, 15};
        for(int i = 0; i < num.length; i++){
            System.out.println("The number is: "+ num[i]);
            printDecodeNumber(num[i]);
        }
       
    }
    public static void printDecodeNumber(int n){
        int three = 0, five = 0;
        int num = n;
        
     
        while(num%3 != 0){
            num = num - 5;
            five ++;
            if(num == 0){
                printFive(five);
                System.out.println();
                return;
            } 
            
            if( num < 0){
                System.out.println(-1);
                return;
            }
        }
        
        if(num % 3 == 0){
            three = num / 3;
        }
      
        printFive(five);
        for(int j = 0 ; j < three; j++){
            System.out.print("555");
        }
        System.out.println();
    }
    
    public static void printFive(int n){
        for(int j = 0; j < n; j++){
          System.out.print("33333");
         }
    }
}
