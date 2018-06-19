import java.io.*;

class Test {
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

	System.out.println("Enter the input file path");

	String filePath = br.readLine();

	System.out.println("Enter the RB");

	String textFrom = br.readLine();

	System.out.println("Enter the LB");

	String textTo = br.readLine();

        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(filePath);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(getBetweenStrings(line,textFrom,textTo));
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


