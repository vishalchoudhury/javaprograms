import java.io.*;
class length {
     public static void main(String args[]){	
         String name="vishal";int i=0;
         System.out.println("length=" +name.length());
	 for(char c : name.toCharArray()){
	     i++;
	}
	System.out.println("value of i" +i);
      }
}
