import java.sql.* ;

public class UpdateRecords {

	public static void main(String[] args) {
		
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection 
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","Wysiwyg");
			
			PreparedStatement stmt = con.prepareStatement("update emp set name = ? where id = ?");
			
			stmt.setString(1, "Divya");   // 1 specifies the first parameter in the query.
						
			stmt.setInt(2, 1001);
			
			int i = stmt.executeUpdate();
			
			System.out.println(i + " records updated.");
			
			con.close();
		}
		catch(Exception e)	{
			System.out.println(e);
		}

	}

}


