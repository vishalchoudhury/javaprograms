import java.io.*;

class StringBuff {
    public static void main(String args[]) {
	StringBuffer sb = new StringBuffer();
	sb.append("Vishal");
	System.out.println(sb);
	sb.append(" choudhury");
	System.out.println(sb);
	String name = new String("Vishal choudhury");
	System.out.println("name"+name);
	String sbcontains = sb.toString();
	if(name.equals(sbcontains)){
	    System.out.println("same");
	}
	else {
	    System.out.println("Not same");
	}
    }
}
