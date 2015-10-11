package mathematics;


/**
 * class SolAngryProfessor.
 * 
 * @author David Sajdl 
 * @version 11/10/2015
 */
public class SolAngryProfessor{
    
    public static void main(String[]args){
    
        int k = 3;
        int[] st = {-1, -3, 4, 2}; 
        printIfClassIsCancel(st, k);
        k = 2;
        int[] students = {0, -1, 2, 1};
        printIfClassIsCancel(students, k);
    
    }

    public static void printIfClassIsCancel(int[] s, int k){
        int studentsOnTime = 0;
        for(int i = 0; i < s.length; i++){
            if(s[i] <= 0){
                studentsOnTime++;
            }
        }
        if(studentsOnTime >= k){
            System.out.println("NO");
        } else{
            System.out.println("YES");
        }
    }
}
  
