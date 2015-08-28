
/**
 * class SolutionArray1DEasy.
 * 
 * @author David Sajdl 
 * @version 28/08/2015
 */
public class SolutionArray1DEasy {
    
    public static void main(String[] args){
        int n = 5;
        int[] myArr = {1, -2, 4, -5, 1};
        getAllsubArraysNegatives(myArr, n);
        int n1 = 100;
        int[] myArr1 = {-463, -744, -589, -405, -321, -427, -164, -581, -613, -468, -246, 
            -685, -869, -966, -889, -217, -712, -888, -251, -859, -969, -582, -603, -658,
            -49, -973, -185, -241, -439, -511, -479, -902, -255, -420, -660, -576, -848,
            -824, -157, -461, -644, -404, -498, -513, -722, -387, -82, -434, -275, -686,
            -645, -597, -268, -248, -255, -669, -573, -792, -910, -364, -303, -742, -267,
            -910, -162, -279, -487, -362, -103, -644, -823, -747, -400, -674, -612, -474,
            -61, -46, -260, -689, -732, -905, -286, -353, -505, -893, -22, -78, -37, -285,
            -443, -341, -27, -62, -603, -541, -341, -90, -904, -796};
         getAllsubArraysNegatives(myArr1, n1);
        }
     
    public static void getAllsubArraysNegatives(int[] myArr, int n){
        int sum = 0;
        int countNeg = 0;
        int l = n;
        while(0 != l){
            for(int i=0; i< l; i++ ){
                for(int j = i; j < l; j++){
                    sum += myArr[j];
                }
                if(sum < 0){
                    countNeg++;
                }
                sum =0;
            }
            l--;
        }
        System.out.println("The Array contain " + countNeg + " negative subarrays");
        System.out.println();
    }
  
}
