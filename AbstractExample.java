import java.io.*;

abstract class Calculate {
     float x;
     Calculate(float n) {
          x = n;
     }
     abstract float calc(float x);
} 
class square extends Calculate {
     public square(float n){
	super(n);
     }
     float calc(float x) {
	return (x * x);
     }
}

class AbstractExample {
    public static void main(String args[]) {
   	square ob = new square(6);
        float res = ob.calc();
	System.out.println(res);
    }
}
 
