import java.sql.* ;

public class RMetadata {

	public static void main(String[] args) {
	
		try	{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "Wysiwyg");
			
			PreparedStatement ps = con.prepareStatement("select * from emp");
			
			ResultSet rs = ps.executeQuery();
			
			ResultSetMetaData rsmd = rs.getMetaData();
			
			
			System.out.println("Total number of columns : " +rsmd.getColumnCount());
			
			System.out.println("Name of Column 1 : " +rsmd.getColumnName(1));
			
			System.out.println("Column type name of 1st column : " +rsmd.getColumnTypeName(1));
			
			
			con.close();
		
		}
		catch(Exception e)	{
			System.out.println(e);
		}

	}

}
