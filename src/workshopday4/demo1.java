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
	        String dqry = "delete from student where id = 102";
			int rs = stmt.executeUpdate(dqry);
	        System.out.println(rs);
			 System.out.println("hi");;
		 }
         catch (ClassNotFoundException | SQLException e)
         {
			e.printStackTrace();
		 }
	}

}

