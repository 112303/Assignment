import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class Login{
	
	public static void createGUI(){

	}
}


class MySQLAccess {
	
	private Connection connect = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	
	public void readDatabase() throws Exception {
		try{
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/jeff","root","5trathm0re");  
			
			//here sonoo is database name, root is username and password  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from users");  
			while(rs.next())  
				System.out.println(rs.getInt(1));
			con.close();  
		} catch(Exception e){
			System.out.println(e);	
		}
	}
}
