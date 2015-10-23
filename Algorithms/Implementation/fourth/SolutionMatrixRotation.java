package Implementation;
/**
 * class SolutionMatrixRotation.
 * 
 * @author David Sajdl 
 * @version 23/10/2015
 */
public class SolutionMatrixRotation {

	public static void main(String[] args) {
		
		//sample 2
        int r = 7;
        int[][] array = {{1, 2, 3, 4}, 	 
        				{7, 8, 9, 10},  
        				{13, 14, 15, 16},  
        				{19, 20, 21, 22},  
        				{25, 26, 27, 28}};
        getArrayRotate(array, r);
        
        r = 3;
        int[][] array2 = {{11, 12, 13, 14},
        		          {22, 91, 92, 15},
        		          {21, 94, 93, 16},
        		          {20, 19, 18, 17}};
        System.out.println();
        getArrayRotate(array2, r);
        

	}
	
	public static void getArrayRotate(int[][] a, int r){
        int temp, t=-5000, te = 0;
        int row = a.length;
        int column = a[0].length; 
        int rowStart = 0;
        int columnStart = 0;
         
        while(rowStart <= row-1&&columnStart <= column-1){ 
            t=-5000;
                for(int x = 0 ; x < r; x++){
                    
                        temp = a[rowStart][columnStart];
                  
                        for(int i = rowStart; i< row; i++){
                       
                            for(int j = columnStart; j < column; j++){
                                    if(i == rowStart){
                                        if(j == column-1){
                                            a[i][j] = a[i+1][column-1];
                                        //    System.out.print(a[i][j] + " ");
                                        } else {
                                            a[i][j] = a[i][j+1];
                                          //  System.out.print(a[i][j] + " ");
                                        }
                                    } else if(i == row -1){
                                        
                                        if(j == columnStart){
                                            te = a[i][j];
                                            if(t == -5000){
                                                a[i][j] = temp;
                                            } else{
                                                a[i][j] = t;
                                            }
                                            //System.out.print(a[i][j] + " ");
                                        } else {
                                            int num = a[i][j];
                                            a[i][j] = te;
                                            te = num;
                                            //System.out.print(a[i][j] + " ");
                                        }
                                    } else if(j == columnStart ){
                                       
                                        if(i == rowStart+1){
                                            t = a[i][j];
                                            a[i][j] = temp;
                                            //System.out.print(a[i][j] + " ");
                                        } else {
                                            int t1 = a[i][j];
                                            a[i][j] = t;
                                            t = t1;
                                            //System.out.print(a[i][j] + " ");
                                        }
                                    } else if(j == column-1) { 
                                        a[i][j] = a[i+1][j];
                                        //System.out.print(a[i][j] + " ");
                                    }else{
                                        //System.out.print("  ");
                                    }
                                    
                            }
                            
                            //System.out.println("");
                        }
                        temp = a[rowStart][columnStart];
                 }
             row--;
             column--; 
             rowStart++;
             columnStart++;
        }
        
        for(int i = 0; i < a.length;i++){
            for(int j = 0; j < a[i].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

}
