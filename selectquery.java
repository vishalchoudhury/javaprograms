import java.sql.*; 
import java.io.*; 
class selectquery{  
    public static void main(String args[])throws Exception { 
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the table name: ");
	String table_name=br.readLine(); 
        try{  
           Class.forName("com.mysql.jdbc.Driver");  
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db101","vishal","password@123");  
           Statement stmt=con.createStatement(); 
	   String sql = "select * from "+table_name+""; 
           ResultSet rs=stmt.executeQuery(sql);  
           ResultSetMetaData metadata = rs.getMetaData();
    	   int columnCount = metadata.getColumnCount();    
           /*for (int i = 1; i <= columnCount; i++) {
               writeToFile(metadata.getColumnName(i) + ", ");      
           }*/
           System.out.println();
           while (rs.next()) {
           String row = "";
           for (int i = 1; i <= columnCount; i++) {
               if(i != columnCount)
		   row += rs.getString(i) + ", ";
	       else
		   row += rs.getString(i);   
               }
           	System.out.println(row);
           	//writeToFile(row);
	   }
    	
	   /*while(rs.next()) { 
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
	   }*/  
           con.close();  
	}
	catch(Exception e){ System.out.println(e);}  
     }  
} 
