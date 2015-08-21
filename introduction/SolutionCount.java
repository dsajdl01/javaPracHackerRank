import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolutionCount {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int a = 0, b = 2, n = 10;
        int a1 = 5, b1 = 3, n1 = 5;
        printFofmatNubers(a,b,n);
        printFofmatNubers(a1,b1,n1);
    }
    public static void printFofmatNubers(int a,int b,int n){
        int sum = a;
        for(int i = 0; i< n; i++){
            sum = countNumber(sum, i, b);
            System.out.print( sum + " ");
        }
        System.out.println();
    }
    public static int countNumber(int a, int pow, int b){
        return a+((int)Math.pow(2,pow)*b);
    }
}