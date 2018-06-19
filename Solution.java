import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] solve(int[] grades){
        // Complete this function
        int len = grades.length,i=0,j;
        for(i=0;i<len;i++) {
            if(grades[i] >= 38) {
                for(j=grades[i];j< (grades[i]/10)*10;j++) {
                    System.out.println(j);
                }
            }
        }
        return grades;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = {73,67,38,33};
        /*for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }*/
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
        

    }
}
