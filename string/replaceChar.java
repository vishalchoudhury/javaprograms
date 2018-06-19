import java.io.*;
import java.util.Scanner;
class replaceChar {
    public static void main(String args[]) {
	String str = new String();
	String finalStr = new String();
	char ch1,ch2;
	try {
	    System.out.println("Enter your string: ");
	    Scanner sc = new Scanner(System.in);
	    str = sc.next();
	    System.out.println("Enter the char you want to replace");
	    ch1 = sc.next().charAt(0);
	    System.out.println("Enter the char you want to replace it with");
	    ch2 = sc.next().charAt(0);
	    str = str.replace(ch1,ch2);
	} catch(Exception e){
	    System.out.println("Exception has occurred");
	}
	//System.out.println("Char 1"+ch1);
	//System.out.println("Char 2"+ch2);
	//str = str.replace(ch1,ch2);
	System.out.println("Resulted string is: "+str);    
    }
}
