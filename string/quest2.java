//Smallest and largest substring
import java.io.*;
import java.util.*;
class quest2 {
    public static void main(String args[]) { 
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the string");
        String s = scan.next();
	System.out.println("Enter the substring size");
	int k = scan.nextInt();
	//System.out.println(getSmallestAndLargest(s,k));
	getSmallestAndLargest(s,k);
    }
    public static void getSmallestAndLargest(String s, int k) {
        String smallest = "";
	String largest = "";
	int len = s.length();
	int size = k;
	for(int i = 0; i+size < len; i++) {
	    k=size;
	    smallest = s.substring(i,k);
	    for(int j = i+1;j+size < len;j++) {
		String s1 = s.substring(j,k+1);
		if(s1.compareTo(smallest)<0) {
		    smallest = s1; 
		}
	        k++;
	    }
	}
	System.out.println("smallest: "+smallest);
    }
}
