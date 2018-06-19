import java.io.*;
class filehandle {
    public static void main(String args[])throws Exception {
	FileInputStream in=null;
	FileOutputStream out=null;
	try{
	      in = new FileInputStream("/tmp/a");
	      out = new FileOutputStream("output.txt");
	      int c;
	      while((c=in.read()) != -1){
		     System.out.println(c);
		     out.write(c);
	      }
	}
	finally{
		if(in != null){
			in.close();
		}
		if(out != null){
			out.close();
		}
	}
    }
}
