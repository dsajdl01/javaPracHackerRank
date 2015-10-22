package Implementation;
/**
 * class SolutionEncryption.
 * 
 * @author David Sajdl 
 * @version 22/10/2015
 */
public class SolutionEncryption {

	public static void main(String[] args) {
		
        String[] text  = {"haveaniceday","feedthedog","chillout","loremipsumissimplydummytextoftheprintingandtypesettingindustry"};
        
        for(int k = 0; k < text.length; k++){
		        String t = text[k].replaceAll("\\s+","");
		        
		        int n = t.length();
		        int rows = (int)Math.sqrt(n);
		        int columns = getColumns(n, rows); 
		        if((columns*rows) < n) rows++;
		        // get matrix
		        char[][] grid = getTextIntoMatricGrid(t,rows, columns, n);
		    
		        //print out
		        for(int i = 0; i < columns; i++){
		            for(int j = 0; j < rows; j++){
		                    if(i < grid[j].length){
		                        System.out.print(grid[j][i]);
		                    }
		            }
		            System.out.print(" ");
		        }
		      System.out.println();
        }

	}

	 public static int getColumns(int n,int r){
	        return ((r*r) == n) ? r : r+1; 
	    }
	    
	    public static char[][] getTextIntoMatricGrid(String t,int r,int c, int n){
	        char[][] g = new char[r][];
	         int col = c;
	         int start = 0;
	        for(int i = 0; i < r; i++){
	            if(col < n){
	                g[i] = t.substring(start,col).toCharArray();
	            } else { 
	                g[i] = t.substring(start).toCharArray();
	            }
	            col += c;
	            start += c;
	        }
	        return g;
	    }
}
