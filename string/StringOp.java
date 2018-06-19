import java.io.*;
class StringOp {
    public static void main(String args[]) {
        String s1 = "vishal";
	String s2 = "choudhury";
	int len = 0;
	String name = new String();
	name = s1.concat(s2);
	System.out.println("name: "+name+"\nLength: "+name.length());
	for(char c: name.toCharArray()){
	    len++;
	}
	int lengthByFunc = length(name);
	System.out.println("length by loop: "+len+"\nLength by function: "+lengthByFunc);
    }
    static int length(String s) {
	System.out.println("Inside function: "+s);
	int i = 0;
	try {
	    while (true) {
		s.charAt(i);
		i++;
	    }
	}catch(IndexOutOfBoundsException e) {
	    return i;
	}
    }
}
