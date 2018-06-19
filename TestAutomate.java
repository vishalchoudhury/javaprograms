import java.io.*;

class TestAutomate {
  public static String getBetweenStrings(
    String text,
    String textFrom,
    String textTo) {

    String result = "";

    // Cut the beginning of the text to not occasionally meet a      
    // 'textTo' value in it:
    result =
      text.substring(
        text.indexOf(textFrom) + textFrom.length(),
        text.length());

    // Cut the excessive ending of the text:
    result =
      result.substring(
        0,
        result.indexOf(textTo));

    return result;
  }

  public static void main(String args[]) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	//BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));

	FileOutputStream out = null;

	System.out.println("Enter the input file path");

	String filePath = br.readLine();

        String outputFile = "/home/netstorm/work/vishal/javafiles/output.txt";

	String textFrom[] = {"name","address","phone"};

        // This will reference one line at a time
        String line = null;

	String abc = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(filePath);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = new BufferedReader(fileReader);

	    out = new FileOutputStream("output.txt");

                while((line = bufferedReader.readLine()) != null) {
			for(String str:textFrom) {
                		String s=str.concat("='");
                		//System.out.println("s: "+s);
				if(line.contains(s)) {
                     			abc = getBetweenStrings(line,s,"';");	
					byte b[]=abc.getBytes();
					out.write(b);
			}
			//out.write("\n");
                }
	    }   

            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                filePath + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + filePath + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
    }

}


