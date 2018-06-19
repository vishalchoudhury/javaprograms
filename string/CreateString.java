import java.io.*;

class CreateString {
    public static void main(String args[]) throws Exception{
	String name1 = "vishal choudhury";
	String name2 = new String("vishal choudhury");
	char arr[] = {'v','i','s','h','a','l',' ','c','h','o','u','d','h','u','r','y'};
	String name3 = new String(arr);
	System.out.println("name1: "+ name1 + " name2: "+ name2 + " name3: "+name3);
	}
}
