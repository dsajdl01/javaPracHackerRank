package mathematics;


/**
 * SolutionDiagonalDiff here.
 * 
 * @author David Sajdl 
 * @version 15/09/2015
 */
public class SolutionDiagonalDiff {
   
    public static void main(String[] args) {
       
        int[][] matrix = {{11,2,4},
                          {4,5,6},
                          {10,8,-12}};
        int n = matrix.length;
        
        int firstdia = getFirstDiagonal(matrix, n); 
        int seconddia = getSecondDiagonal(matrix, n);
        int diff = firstdia - seconddia;
        System.out.println(Math.abs(diff));
    }
    
    public static int getFirstDiagonal(int[][] m,int n){
        int sum = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j){
                    sum += m[i][j];
                }
            }
        }
        return sum;
    }
    
    public static int getSecondDiagonal(int[][] m,int n){
        int sum = 0;
        int start = 0;
        int end = n - 1;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == start && j == end){
                    sum += m[i][j];
                    end--;
                    start++;
                }
            }
        }
        return sum;
    }
 
}
