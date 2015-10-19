package Implementation;

/**
 * class SolutionManasaStones.
 * 
 * @author David Sajdl 
 * @version 19/10/2015
 */
public class SolutionManasaStones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 	int[][] stones = {{3,1,2},  
		 					  {4,10,100}}; 
	        int t = stones.length;
	        for(int i = 0; i < t; i++){
	            int stone = stones[i][0];
	            stone--;
	            int first = stones[i][1];
	            int second = stones[i][2];
	            int a = (first < second) ? first : second;
	            int b = (first > second) ? first : second;
	            int c = a*stone;
	            int m = b*stone;
	            int diff = b - a;
	            while(c <= m){
	                System.out.print(c + " ");
	                if(diff == 0) break;
	                c += diff;
	            }
	             System.out.println();
	        }
	}

}
