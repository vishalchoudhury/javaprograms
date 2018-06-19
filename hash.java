import java.io.*;
import java.util.*;

class hash {
    public static void main(String args[]) throws Exception{
	HashMap<Integer,String> stud = new HashMap<Integer,String>();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	stud.put(Integer.parseInt(br.readLine()), br.readLine());
	for(Map.Entry<Integer,String> entry : stud.entrySet()) {
	System.out.println(entry.getKey()+ " " + entry.getValue());

	}
    }
}		
