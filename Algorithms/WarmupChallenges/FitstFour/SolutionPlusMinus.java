package mathematics;


/**
 * SolutionPlusMinus here.
 * 
 * @author David Sajdl 
 * @version 15/09/2015
 */
public class SolutionPlusMinus {
    
     public static void main(String[] args) {
     
        
        int[] myArray = {-4, 3, -9, 0, 4, 1};
        int n = myArray.length; // 6;
        int positive = 0, negative = 0,  zero = 0;
        for(int i = 0; i < n; i++){
            
            int element = myArray[i];
            if(element < 0){
                negative++;
            } else if(element > 0){
                positive++;
            } else{
                zero++;
            }
            myArray[i] = element;
        }
        double dbl = 0.0;
        if(positive > 0){
            dbl = ((double)positive) / n;
            System.out.printf("%.6f\n",dbl);
        } else{
            System.out.println(positive);
        }
    
        if(negative > 0){
            dbl = ((double)negative)/n;
            System.out.printf("%.6f\n",dbl);
        } else{
            System.out.println(negative);
        }
        if(zero > 0){
            dbl = ((double)zero)/n;
            System.out.printf("%.6f\n",dbl);
        } else{
            System.out.println(zero);
        }
    }
    
}
