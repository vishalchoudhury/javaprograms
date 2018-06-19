import java.io.*;
class ReverseLine {
    public static void main(String args[]) {
        String str="My name is vishal choudhury";
	String s[]=str.split(" ");
	for(int i=s.length-1;i>=0;i--) {
	       System.out.print(s[i]+" ");
	}
    }
}
