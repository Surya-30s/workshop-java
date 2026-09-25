package workshopday4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class demo1 
{

	public static void main(String[] args) 
	{
         try 
         {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("load and registered");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb?user=root & password=tiger");
			System.out.println("connection established succesfully");
			Statement stmt = con.createStatement();
			System.out.println("flatform created succesfully");
//			String sqry = "insert into studentdb.student values(105, 'darshan', 'darshan431@gmail.com', 6367863648 ,'dachucode')";
//		    stmt.execute(sqry);
//		    System.out.println(sqry);
//		    
//		    String qery = "Select * from student";
//		    ResultSet rs = stmt.executeQuery(qery);
//		    
//		    while(rs.next())
//		    {
//		    	System.out.println(rs.getInt(1));
//		    	System.out.println(rs.getString(2));
//		    	System.out.println(rs.getString(3));
//		    	System.out.println(rs.getLong(4));
//		    	System.out.println(rs.getString(5));
//		    }
		    
//			String uqry = "update student set phno = 9019273033 where id = 101";
//			int rs = stmt.executeUpdate(uqry);
//	        System.out.println(rs);
//        	 
	        String dqry = "delete from student where id = 102";
			int rs = stmt.executeUpdate(dqry);
	        System.out.println(rs);
		 }
         catch (ClassNotFoundException | SQLException e)
         {
			e.printStackTrace();
		 }
	}

}

