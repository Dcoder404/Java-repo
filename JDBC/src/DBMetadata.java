import java.sql.* ;

public class DBMetadata {

	public static void main(String[] args) {

		
		try	{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=root", "root", "Wysiwyg");
		
			DatabaseMetaData dbmd = con.getMetaData();
			
			
			System.out.println("Driver name : " +dbmd.getDriverName());
			
			System.out.println("Driver version : " +dbmd.getDriverVersion());
			
			System.out.println("User name : " +dbmd.getUserName());
			
			System.out.println("Database product name : " +dbmd.getDatabaseProductName());
			
			System.out.println("Database product Version : " +dbmd.getDatabaseProductVersion());
			
			
			con.close();
			
		}
		catch(Exception e)	{
			System.out.println(e);
		}

	}

}
