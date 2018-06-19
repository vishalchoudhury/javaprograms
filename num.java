import java.io.*;

class num {
	public static void main(String args[]) {
		int no=65;
		int rem = no % 10;
		int div = no /10;
		int res=0,k=0,c=0;
		if(rem<5) {
			k = div * 10 + 5;
			c = k - no;
			if(c < 3) {
			    res = k;					
			}else {
			    res = no;
			}
		} else {
			k = (div+1) * 10;
			c = k - no;
			if(c < 3) {
				res = k;
			} else {
				res = no;
			}
		}
		System.out.println(res);
	}
}
