/**
 * class Solution1DArrayHard
 * 
 * @author David Sajdl 
 * @version 28/08/2015
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1DArrayHard {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int test = 4;
        int n = 5, m = 3;
        System.out.print("Yes -> ");
        int[] myArr = {0, 0, 0, 0, 0};
        getPathThroughArray(myArr,n,m);
        int n1 = 6, m1= 5;
        System.out.print("Yes -> ");
        int[] myArr1 = {0, 0, 0, 1, 1, 1};
        getPathThroughArray(myArr1,n1,m1);
        int n2 = 6, m2 = 3;
        System.out.print("No ->");
        int[] myArr2 = {0, 0, 1, 1, 1, 0};
        getPathThroughArray(myArr2,n2,m2);
        int n3 = 3, m3 = 1;
        System.out.print("N0 -> ");
        int[] myArr3 = {0, 1, 0};
        getPathThroughArray(myArr3,n3,m3);
        int n4 = 10, m4 = 6;
        System.out.print("No -> ");
        int[] myArr4 = {0,0,1,1,0,0,1,1,0,0};
        getPathThroughArray(myArr4,n4,m4);
        System.out.print("Yes -> ");
        getPathThroughArray(myArr4,n4,3); 
        int n6 = 6, m6 = 2;
        System.out.print("Yes -> ");
        int[] myArr6 = {0,1,0,1,0,1}; 
        getPathThroughArray(myArr6,n6,m6);
        System.out.print("No -> ");
        getPathThroughArray(myArr6,n6,3);
        int a = 9, b = 4;
        System.out.print("Yes -> ");
        int[] ar = {0, 1, 1, 0, 0, 1, 1, 0, 1};
        getPathThroughArray(ar,a,b);
        System.out.print("Yes -> ");
        int[] array = {0,0,0,1,0,0,0,1,1};
        getPathThroughArray(array,9,2);
        System.out.print("yes -> ");
        getPathThroughArray(array,9,3);
    }
    
    public static void getPathThroughArray(int[] myArr, int n, int m){
            System.out.println("m = " + m);
            for(int j = 0; j < n; j++){
                System.out.print(myArr[j] +" ");
            }
            System.out.println();
            if(canGo(myArr, n,m)){
               System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            System.out.println();
    }
       
    public static boolean canGo(int[] a, int n, int m){
       int i = 0;
        boolean backWord = true;
        
        while(i < n-1){
            if(i+m > n-1){
                    return true;
            }
            if(i+m == n-1){
                if(a[i+m]==0){
                    return true;
                }
            }
            if(a[i+1] == 0){
                i++;
            }
            else{
                backWord = true;
                int tempIndex = i;
                while(backWord){
                    if(i+m > n-1){
                        if(i> 0 && a[i-1]==0){
                            i--;
                        } else {
                            return false;
                        }
                    } else if(a[i+m] != 0 && i > 0){
                        if(a[i-1] !=0){
                            return false;
                        } else{
                            if(i > 0){
                                i--;
                            } else{
                                return false;
                            }
                        }
                    } else {
                        if(i+m <= tempIndex){
                            return false;
                        } else {
                            if(a[i+m]== 0){
                                i = i+m;
                                backWord = false;
                            } else {
                                return false;
                            }
                        }
                    }
                   
                }   
            }
        }
        return true; 
    }
}
