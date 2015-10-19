package Implementation;

/**
 * class SolutionGridSearch.
 * 
 * @author David Sajdl 
 * @version 19/10/2015
 */

public class SolutionGridSearch {

	public static void main(String[] args) {
			// first input
	        int[][] matrix = {{7,2,8,3,4,5,5,8,6,4},
	        				{6,7,3,1,1,5,8,6,1,9},
	        				{8,9,8,8,2,4,2,6,4,3},
	        				{3,8,3,0,5,8,9,3,2,4},
	        				{2,2,2,9,5,0,5,8,1,3},
	        				{5,6,3,3,8,4,5,3,7,4},
	        				{6,4,7,3,5,3,0,2,9,3},
	        				{7,0,5,3,1,0,6,6,0,1},
	        				{0,8,3,4,2,8,2,9,5,6},
	        				{4,6,0,7,9,2,4,1,3,7}};
	         int[][] pattern = {{9,5,0,5},
	        		 			{3,8,4,5},
	        		 			{3,5,3,0}};
	         System.out.println(findPattern(matrix, pattern));
	         
	         // second input
	         String[] matrixStr = {"400453592126560","114213133098692",
	        		 			   "474386082879648","522356951189169",
	        		 			   "887109450487496","252802633388782",
	        		 			   "502771484966748","075975207693780",
	        		 			   "511799789562806","404007454272504",
	        		 			   "549043809916080","962410809534811",
	        		 			   "445893523733475","768705303214174","650629270887160"};	
		       String[] patternStr = {"99","99"};
		       int[][] matrix2 = new int[matrixStr.length][matrixStr[0].length()];
		       for(int i = 0; i < matrixStr.length; i++){
		    	   matrix2[i] = getArray(matrixStr[i]);
		    	   
		       }
		       int[][] pattern2 = new int[patternStr.length][patternStr[0].length()];
		       for(int i = 0; i < patternStr.length; i++){
		    	   pattern2[i] = getArray(patternStr[i]);
		       }
		       System.out.println(findPattern(matrix2, pattern2));
	 }
	
	 public static String findPattern(int[][] m, int[][] p){
	        int p1 =  p.length;
	        int p2 = p[0].length;
	        int l1 = m.length - p1 + 1;
	        int l2 = m[0].length - p2 + 1;
	        for(int i = 0; i < l1; i++){
	            for(int j = 0; j < l2; j++){
	                if(m[i][j] == p[0][0]){
	                    if(pattentMatch(m, p, i , j)){
	                        return "YES";
	                    } 
	                }
	            }
	        }
	    return "NO";
	    }
	    
	    private static int[] getArray(String str){
	    
	        int[] nums = new int[str.length()];
	        for (int i = 0; i < str.length(); i++) {
	            nums[i] = Character.getNumericValue(str.charAt(i));
	        }
	        return nums;
	    }
	    
	    private static boolean pattentMatch(int[][] m, int[][] p, int i, int j){
	        int jx = j;
	        for(int x = 0; x < p.length; x++){
	            for(int y = 0; y < p[x].length; y++){
	                if(p[x][y] != m[i][jx]){
	                    return false;
	                } 
	                jx++;
	            }
	            jx = j;
	            i++;
	        }
	        return true;
	    }
	    
}
