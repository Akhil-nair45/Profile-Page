package sql;
import java.sql.*;

public class mysql {

		public static void main(String[] args) {
		
		
		String dburl="jdbc:mysql://localhost:3306/ipl";
		String user="root";
		String pass= "root";
		
		try {
			Connection myConn= DriverManager.getConnection(dburl,user,pass);
			String sql = "select * from team";
			PreparedStatement myStmt = myConn.prepareStatement(sql);
			ResultSet myRs =	myStmt.executeQuery();
			
			
			while(myRs.next())
				
			{
				String name = myRs.getString("teamname");
				int Teamid = myRs.getInt("team_id");
				System.out.println(Teamid + name);	
			}
			
			myConn.close();
				
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		
		
}
}