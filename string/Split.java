import java.io.*;

class Split {

    public static void main(String args[]) {
	String s = "my,name,is,vishal";
	String s1[];
	s1 = s.split(",");

	for(String a:s1) {
		System.out.println(a);
	}
    }
}
