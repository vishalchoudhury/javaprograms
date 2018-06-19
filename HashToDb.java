import java.sql.*;
import java.util.*;
import java.io.*;
class HashToDb{
    public static void main(String args[])throws Exception {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	HashMap<Integer,String> student = new HashMap<Integer,String>();
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db101","vishal","vishal");
	System.out.println("Database connected");
	Statement stmt = null;
	String sql = null;

	int flag=1,ch=0,roll=0;
	while(flag==1) {
		System.out.println("1-Insert"+"\n2-Delete"+"\n3-Exit"+"\n Any other val to exit");
		ch = Integer.parseInt(br.readLine());
		switch(ch) {
		    case 1: System.out.println("Enter roll and name ");
			    student.put(Integer.parseInt(br.readLine()), br.readLine());
			    System.out.println("Press 1 to coninue ");
			    flag=Integer.parseInt(br.readLine());
			    try{
	   			for(HashMap.Entry m: student.entrySet()) {
           				stmt=con.createStatement();
	   				sql = "INSERT INTO stud(rollno,name)"+"VALUES('"+m.getKey()+"','"+m.getValue()+"')";
	   				stmt.executeUpdate(sql);
	   			}	
        		    }	
        		   catch(Exception e){ System.out.println(e);}
			   break;
		
		    case 2: System.out.println("Enter the roll no to delete");
			    roll=Integer.parseInt(br.readLine());
			    try {
				for(HashMap.Entry m: student.entrySet()) {
				stmt=con.createStatement();
				System.out.println("Going to delete: "+m.getKey());
			        sql="DELETE FROM stud WHERE rollno='"+m.getKey()+"'";
				stmt.executeUpdate(sql);
			    	}
			    }catch(Exception e) {e.printStackTrace(); }
			    break;
			  
		    case 3: System.out.println("Exiting");
			    try {
				con.close();
				flag=0;
			    } catch(Exception e) {e.printStackTrace();}
			    break;
		}
	}
     }
}

