import java.io.*;

class CompareFunction { 
    public static void main(String args[]) {
	String s1 = new String("");
	String s2 = new String("");
	try {	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Eneter 1st string");
		s1 = br.readLine();
		System.out.println("Eneter 2nd string");
		s2 = br.readLine();
        } catch(IOException e) { System.out.println("Exception has occured"); }
	int result = s1.compareTo(s2);
	if(result == 0){
	    System.out.println("same");
	} else if(result > 0){
	    System.out.println(s1+" is greater than "+s2);
	} else{
	    System.out.println(s2+" is greater than "+s1);
	}
    }
} 
