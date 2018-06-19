import java.io.*;
class filewriter {
   public static void main(String args[]) throws Exception{
        try {
	BufferedWriter bw = null;
	FileWriter fw = null;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Enter file name");	
	    File file = new File(br.readLine());
	    if (!file.exists()) {
		file.createNewFile();
		System.out.println("File created");
	    	}
	    else {
		System.out.println("File already exists!");
	    }
	System.out.println("Start writting your content and press enter to exit");
	while(true){
	String text = br.readLine();
	fw = new FileWriter(file.getAbsoluteFile(),true);
        bw = new BufferedWriter(fw);
        bw.write(text);
	     }
	if (bw != null)
		bw.close();
	if (fw != null)
		fw.close();
	}
	finally {
		System.out.println("Done");
	}
    }
}
	
		
		
