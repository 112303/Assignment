import java.sql.*;
public class Register{
	public static void createGUI(){
		MySQLConn.createUser("Paul", "12345");
	}
}

class MySQLConn {
		
	private static Connection connect = null;
	private static Statement statement = null;
	private static PreparedStatement preparedStatement = null;
	
	public static void createUser(String username, String password){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/jeff","root","5trathm0re");  
			
			//here sonoo is database name, root is username and password  
			Statement stmt=con.createStatement();  
			/*
			ResultSet rs=stmt.executeQuery("select * from users");  
			while(rs.next())  
			System.out.println(rs.getString(1));
			con.close(); */
			preparedStatement = con.prepareStatement("insert into users(username, password) VALUES (?, ?)");
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);
			preparedStatement.executeUpdate();
		}
		catch(Exception e){
			System.out.println(e);	
		}

	}
}