package mathematics;


/**
 * class SolutionUtopianTree.
 * 
 * @author David Sajdl 
 * @version 11/10/2015
 */
public class SolutionUtopianTree {
    
    public static void main(String[]args){
        int[] cycles = {0,1,2,3,4,5,6,7,8,9,10};
        for(int i = 0; i<cycles.length; i++){ 
            System.out.print(i + " = ");
            System.out.println(getGrowth(cycles[i]));
        }
    }
    
    public static int getGrowth(int n){
       
        if(n == 0) return 1;
        if(n == 1) return 2;
        int cycles = n;
        boolean addOne = false;
        if(n%2 != 0){
            addOne = true;
            cycles++;
        }
        int grow = 1;
        for(int j = 1; j < cycles; j = j+2){
            grow = grow * 2 + 1;
        }
        if(addOne){
            grow--;
            cycles--;
        }
        
        return grow;
    }
  
}
