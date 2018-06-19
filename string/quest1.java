import java.io.*;

class quest1 {
    public static void main(String args[]) {
    	String A = "vishal";
	String B = "choudhury";
	System.out.println(A.length() + B.length());
	if(A.compareTo(B)>1){
	    System.out.println(A+" comes after "+B);
	}else {
	    System.out.println(B+" comes after "+A);
	}
	A = A.substring(0,1).toUpperCase() + A.substring(1);
	B = B.substring(0,1).toUpperCase() + B.substring(1);
	System.out.println(A+" "+B);
    }
}
