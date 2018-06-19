import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class grading {

	static int[] solve(int[] grades){
        // Complete this function
        int len = grades.length,i=0,j=0,k=0,l=0,m=0;
        for(i=0;i<len;i++) {
	System.out.println(i+")"+grades[i]);
            if(grades[i] >= 38) {
                j = grades[i]/10;
                k = grades[i]%10;
                if (k < 5) {
                    l = (j * 10) + 5;
                    m = l - grades[i];
                } else {
                    l = (j + 1) * 10;
                    m = l -grades[i];
                }
                if(m < 3) {
                    grades[i] = l;
                }
            }
	System.out.println("Rem: "+k+", div: "+j+", l: "+l+", m: "+m); 
        }
        return grades;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = {43,67,38,33};
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
        

    }
}

