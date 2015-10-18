package mathematics;

/**
 * class ChoclateFeast.
 * 
 * @author David Sajdl 
 * @version 18/10/2015
 */

public class ChocolateFeast {

	 public static void main(String[] args) {
		 int[][] data = {{10, 2, 4},
                 {12, 4, 4},
                 {6, 2, 2},
                 {17, 4, 2}};
		 int t = data.length;
		 for(int i = 0; i < t; i++){
			 System.out.println(getSolve(data[i][0], data[i][1], data[i][2]));
		 }
	  }
	    
	  private static long getSolve(int n, int c, int m){
	        return n/c + add(n/c, m);
	    }
	    
	    private static long add(int res, int m){
	        if(res < m) return 0;
	        else return res/m + add(res-res/m*m + res/m, m);
	    }
}
