import java.sql.*;
import java.io.*;
class insertquery{
    public static void main(String args[])throws Exception {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int flag=1;
	while(flag==1) {
		System.out.println("Enter employee id: ");
		int emp_id=Integer.parseInt(br.readLine());
		System.out.println("Enter name: ");
		String name = br.readLine();
		System.out.println("Enter Designation");
		String designation = br.readLine();
		System.out.println("Enter the contact Number");
		long mobile = Integer.parseInt(br.readLine());
        try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db101","vishal","vishal");
           Statement stmt=con.createStatement();
	   String sql = "INSERT INTO employee(emp_id,name,designation,mobile)"+"VALUES('"+emp_id+"','"+name+"','"+designation+"','"+mobile+"')";
//           stmt.executeUpdate("insert into employee(emp_id,name,designation,mobile) values(emp_id,name,designation,mobile)");
	   stmt.executeUpdate(sql);
           con.close();
        }
        catch(Exception e){ System.out.println(e);}
	System.out.println("Do you want to add more employee then enter 1 else give any other value");
	flag=Integer.parseInt(br.readLine());
	}
     }
}

