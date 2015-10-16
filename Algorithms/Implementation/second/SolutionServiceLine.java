package mathematics;


/**
 * class SolutionServiceLine.
 * 
 * @author David Sajdl 
 * @version 16/10/2015
 */
public class SolutionServiceLine {
   
    public static void main(String[]args){
        
        int[] width = {2, 3, 1, 2, 3, 2, 3, 3};
        int[][] test = {{0, 3},
                        {4, 6},
                        {6, 7},
                        {3, 5},
                        {0, 7}};
        for(int i = 0; i< test.length; i++){
            System.out.println(getVehicleTypetoPass(width, test[i][0], test[i][1]));
        }
    }
    
    public static int getVehicleTypetoPass(int[] a,int s,int e){
         int pass = a[s];
        for(int i = s+1; i <= e; i++){
            if(pass > a[i]){
                pass = a[i];
            }
        }
        return pass;
    }
}
